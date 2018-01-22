module sqat::series1::A2_McCabe

import lang::java::jdt::m3::AST;
import util::ValueUI;
import IO;
import Map;
import Set;
import List;
import util::Math;
import sqat::series1::A1_SLOC;
import analysis::statistics::Correlation;

/*

Construct a distribution of method cylcomatic complexity. 
(that is: a map[int, int] where the key is the McCabe complexity, and the value the frequency it occurs)


Questions:
- which method has the highest complexity (use the @src annotation to get a method's location)

- how does pacman fare w.r.t. the SIG maintainability McCabe thresholds?

- is code size correlated with McCabe in this case (use functions in analysis::statistics::Correlation to find out)? 
  (Background: Davy Landman, Alexander Serebrenik, Eric Bouwers and Jurgen J. Vinju. Empirical analysis 
  of the relationship between CC and SLOC in a large corpus of Java methods 
  and C functions Journal of Software: Evolution and Process. 2016. 
  http://homepages.cwi.nl/~jurgenv/papers/JSEP-2015.pdf)
  
- what if you separate out the test sources?

Tips: 
- the AST data type can be found in module lang::java::m3::AST
- use visit to quickly find methods in Declaration ASTs
- compute McCabe by matching on AST nodes

Sanity checks
- write tests to check your implementation of McCabe

Bonus
- write visualization using vis::Figure and vis::Render to render a histogram.

*/

set[Declaration] jpacmanASTs() = createAstsFromEclipseProject(|project://jpacman|, true);

alias CC = rel[loc method, int cc];

// calculate cyclomatic complexity counting forking node
int calcCC(Statement impl) {
    int result = 1;
    visit (impl) {
        case \if(_,_) : result += 1;
        case \if(_,_,_) : result += 1;
        case \case(_) : result += 1;
        case \do(_,_) : result += 1;
        case \while(_,_) : result += 1;
        case \for(_,_,_) : result += 1;
        case \for(_,_,_,_) : result += 1;
        case foreach(_,_,_) : result += 1;
        case \catch(_,_): result += 1;
        case \conditional(_,_,_): result += 1;
        case infix(_,"&&",_) : result += 1;
        case infix(_,"||",_) : result += 1;
    }
    return result;
}

CC cc(set[Declaration] decls) {
  CC result = {};
  visit(decls) {
  	case c:\constructor(_,_,_,Statement s):
  		result[c.src] = calcCC(s);
  	case m:\method(_,_,_,_,b:\block):
  		result[m.src] = calcCC(b);
  }
  return result;
}

alias CCDist = map[int cc, int freq];

CCDist ccDist(CC cc) =
	(() | it + (idx:size(li[idx])) | idx <- cc<1>, li := cc<1,0>);
	
CC getMax(CC c) =
	({} | it + item | item <- c, item[1] >= max(c<1>));
	
int getMethodSLOC(CC c, int minimum, int maximum) =
	(0 | it + slocFile(mthd)[mthd] | <mthd,val> <- c, minimum < val, val <= maximum);

lrel[int,int] getCCPerSloc(CC c) =
	[<val, slocFile(mthd)[mthd]> | <mthd,val> <- c];
	
map[str,int] getRelSLOC(CC c) {
	map[str,int] relSloc = ();
	relSloc["simple"] = getMethodSLOC(c, 0, 10);
	relSloc["moderate"] = getMethodSLOC(c, 10, 20);
	relSloc["high"] = getMethodSLOC(c, 20, 50);
	relSloc["veryHigh"] = getMethodSLOC(c, 50, 1000);
	return relSloc;
}
	
void anaylizeASTs(set[Declaration] d) {
	CC cycloComp = cc(d);
	CCDist cycloCompDist = ccDist(cycloComp);
	println("Cyclo complexity distribution : <cycloCompDist>");
	CC maxCC = getMax(cycloComp);
	println("Methods with max CC : <maxCC>");
	int sizeOfJpac = sumSloc(sloc(|project://jpacman/|));
	
	map[str,int] mthdSLOC = getRelSLOC(cycloComp);
	println("=========== Jpacman Relative LOC ===========");
	println("  Simple  | <100 * mthdSLOC["simple"] / toReal(sizeOfJpac)> %");
	println(" Moderate | <100 * mthdSLOC["moderate"] / toReal(sizeOfJpac)> %");
	println("   High   | <100 * mthdSLOC["high"] / toReal(sizeOfJpac)> %");
	println(" Very High| <100 * mthdSLOC["veryHigh"] / toReal(sizeOfJpac)> %");
	println("============================================");
	
	ccPerSloc = getCCPerSloc(cycloComp);
	println("Pearson correlation : <PearsonsCorrelation(ccPerSloc)>");
	println("Spearman Correlation : <SpearmansCorrelation(ccPerSloc)>");
}

set[Declaration] getPartialASTs(set[Declaration] project, str path)
	= {d| d <- project, /<path>.*/ := d.src.path};

void main() {
	set[Declaration] d = jpacmanASTs();
	text(d);
	println("Jpacman project");
	anaylizeASTs(d);
	/**
	 * Accoring to the SIG Model, jpacman prject is ranked as ++ 
	 * where	moderate	high	very high
	 *	++ :	25%			0%		0%
	 *  +  :	30%			5%		0%
	 *	...
	 * Pearson correlation r ranges from +1 to -1
	 * +1 indicates positive relation between two variable
	 * 0 for no relations, -1 for negative relation
	 *
	 * Spearman correlation p ranges from +1 to -1 checking monotonious relation
	 * +1 indicates monotonically related, otherwise -1
	 * 
	 */
	
	println("Jpacman project: Actual code");
	d2 = getPartialASTs(d, |project://jpacman/src/main/java/|.path);
	anaylizeASTs(d2);
	
	println("Jpacman project: Test code");
	d3 = getPartialASTs(d, |project://jpacman/src/test/java/|.path);
	anaylizeASTs(d3);
}

test bool checkCC() =
	7 == getOneFrom(cc({createAstFromString(|project://tmp|, "
		'class Test {
		'	int t = 1;
		'	void test() {
		'		if (t == 1) {
		'			t = 2;
		'			while (t != 10) t++; 
		'		}
		'		for (int i = 0; i \<10; i++)
		'			t += i;
		'		try {
		'			if (t == 1 || t == 10)
		'				t = \"string\";
		'			else t = 3.7;
		'		} catch (Exception e) {}
		'	}
		'}
		'", true)})<1>);
