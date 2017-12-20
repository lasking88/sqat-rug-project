module sqat::series1::A2_McCabe

import lang::java::jdt::m3::AST;
import IO;
import Map;
import Set;
import List;

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

int calcCC(Statement impl) {
    int result = 1;
    visit (impl) {
    	case \block(list[Statement] l) :
    		for (Statement s <- l) {
    			result += calcCC(s);
    		}
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
  	case m:\method(_,_,_,_,(Statement)s): 
  		result[m.decl] = calcCC(s);
  }
  return result;
}

alias CCDist = map[int cc, int freq];

CCDist ccDist(CC cc) {
	CCDist ret = ();
	for (c <- cc) {
		int cyclo = c[1];
		if (cyclo in ret) {
			ret[cyclo] += 1;
		} else {
			ret[cyclo] = 0;
		}			
	}
	return ret;
}

void printMax(CC s) {
	li = toList(s);
	int idx =  indexOf(li<1>, max(li<1>));
	println(li[idx]);
}

void main() {
	set[Declaration] d = jpacmanASTs();
	CC cycloComp = cc(d);
	CCDist cycloCompDist = ccDist(cycloComp);
	printMax(cycloComp);
}
