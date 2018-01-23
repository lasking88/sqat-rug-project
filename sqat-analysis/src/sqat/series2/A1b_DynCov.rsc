module sqat::series2::A1b_DynCov

import Java17ish;
import ParseTree;
import util::FileSystem;
import util::ValueUI;
import IO;
import String;
import lang::java::jdt::m3::AST;
import lang::csv::IO;
import Set;
import util::Math;

/*

Assignment: instrument (non-test) code to collect dynamic coverage data.

- Write a little Java class that contains an API for collecting coverage information
  and writing it to a file. NB: if you write out CSV, it will be easy to read into Rascal
  for further processing and analysis (see here: lang::csv::IO)

- Write two transformations:
  1. to obtain method coverage statistics
     (at the beginning of each method M in class C, insert statement `hit("C", "M")`
  2. to obtain line-coverage statistics
     (insert hit("C", "M", "<line>"); after every statement.)

The idea is that running the test-suite on the transformed program will produce dynamic
coverage information through the insert calls to your little API.

Questions
- use a third-party coverage tool (e.g. Clover) to compare your results to (explain differences)
- which methods have full line coverage?
- which methods are not covered at all, and why does it matter (if so)?
- what are the drawbacks of source-based instrumentation?

Tips:
- create a shadow JPacman project (e.g. jpacman-instrumented) to write out the transformed source files.
  Then run the tests there. You can update source locations l = |project://jpacman/....| to point to the 
  same location in a different project by updating its authority: l.authority = "jpacman-instrumented"; 

- to insert statements in a list, you have to match the list itself in its context, e.g. in visit:
     case (Block)`{<BlockStm* stms>}` => (Block)`{<BlockStm insertedStm> <BlockStm* stms>}` 
  
- or (easier) use the helper function provide below to insert stuff after every
  statement in a statement list.

- to parse ordinary values (int/str etc.) into Java15 syntax trees, use the notation
   [NT]"...", where NT represents the desired non-terminal (e.g. Expr, IntLiteral etc.).  

*/
int line = 0;

void shadowProject(loc l, str name) {
	for (f <- files(l)) {
		if (f.extension == "java") {
			start[CompilationUnit] shadow = parseJava(f);
			ImportDec tmp = parse(#ImportDec, "import static sqat.series2.Api.hit;");
			shadow = visit(shadow) {
				case (CompilationUnit)`<PackageDec? pd> <ImportDec* id> <TypeDec* td>` =>
					(CompilationUnit)`<PackageDec? pd>
					'
					'<ImportDec tmp>
					'<ImportDec* id>
					'
					'<TypeDec* td>`
				case c:(ClassDec)`<ClassDecHead cdh> <ClassBody cb>` => aux(c@\loc, cdh, cb)
			}
			f.authority = name;
			writeFile(f, shadow);
		} else {
			list[int] b = readFileBytes(f);
			f.authority = name;
			writeFileBytes(f, b);
		}
	}
	l.authority = name;
	writeFile(l + "src/main/java/sqat/series2/Api.java", 
		parseJava(|project://sqat-analysis/src/sqat/series2/Api.java|));
}

MethodDec aux(loc classLoc, loc mthdLoc, MethodDecHead mdh, MethodBody mb) {
	BlockStm hitmthd = parse(#BlockStm, "hit(\"<classLoc>\", \"<mthdLoc>\");");
	mb = visit(mb) {
		case (Block) `{ <BlockStm* bs> }` => (Block)`{ <BlockStm hitmthd> <BlockStm* bs> }`
		case BlockStm* bs => putBeforeEvery(bs, BlockStm(loc l) {
			line += 1;
			return parse(#BlockStm, "hit(\"<classLoc>\", \"<mthdLoc>\", \"<line>\");");
		})
	}
	return (MethodDec)`<MethodDecHead mdh> <MethodBody mb>`;
}

ConstrDec aux(loc classLoc, loc constrLoc, ConstrHead ch, ConstrBody cb) {
	BlockStm hitmthd = parse(#BlockStm, "hit(\"<classLoc>\", \"<constrLoc>\");");
	cb = visit(cb) {
		case (Block) `{ <BlockStm* bs> }` => (Block)`{ <BlockStm hitmthd> <BlockStm* bs> }`
		case BlockStm* bs => putBeforeEvery(bs, BlockStm(loc l) {
			line += 1;
			return parse(#BlockStm, "hit(\"<classLoc>\", \"<constrLoc>\", \"<line>\");");
		})
	}
	return (ConstrDec)`<ConstrHead ch> <ConstrBody cb>`;
}

ClassDec aux(loc l, ClassDecHead cdh, ClassBody cb) {
	cb = visit(cb) {
		case c:(ConstrDec)`<ConstrHead ch> <ConstrBody cob>` => aux(l, c@\loc, ch, cob)
		case m:(MethodDec)`<MethodDecHead mdh> <MethodBody mb>` => aux(l, m@\loc, mdh, mb)
	}
	return (ClassDec)`<ClassDecHead cdh> <ClassBody cb>`;
}

void methodCoverage(loc project) {
	rel[str,str] methodTotal = {};
	for (f <- files(project), f.extension == "java") {
		m = parseJava(f);
		visit(m) {
			case (BlockStm)`hit ( <StringLiteral sl> , <StringLiteral sl2> ) ;` :
					methodTotal += <replaceAll("<sl>", "\"", ""), replaceAll("<sl2>", "\"", "")>;
		}
	}
	rel[str,str] methodHit = {};
	methodHit = readCSV(#rel[str,str], project + "method_coverage.csv");
	
	for (c <- methodTotal<0>) {
		println("Class <c>");
		for (<c,m> <- methodTotal) {
			if (<c,m> in methodHit) println("	<m> -- hit!");
			else println("	<m>");
		}
	}
	println("Method Coverage : <100*toReal(size(methodHit)) / toReal(size(methodTotal))> %");
}

void lineCoverage(loc project) {
	rel[str,str,str] lineTotal = {};
	for (f <- files(project), f.extension == "java") {
		m = parseJava(f);
		visit(m) {
			case (BlockStm)`hit ( <StringLiteral sl> , <StringLiteral sl2> , <StringLiteral sl3> ) ;` :
				lineTotal += <replaceAll("<sl>", "\"", ""), replaceAll("<sl2>", "\"", ""), replaceAll("<sl3>", "\"", "")>;
		}
	}
	rel[str,str,str] lineHit = {};
	lineHit = readCSV(#rel[str,str,str], project + "line_coverage.csv");
	
	map[str, int] mHit = ();
	map[str, int] mTotal = ();
	for (<c,m,l> <- lineTotal) {
		if (m in mTotal) {
			mTotal[m] += 1;
		} else {
			mTotal[m] = 0;
		}
	}
	for (<c,m,l> <- lineHit, <c,m,l> <- lineTotal) {
		if (m in mHit) {
			mHit[m] += 1;
		} else {
			mHit[m] = 0;
		}
	}
	for (m <- lineTotal<1>) {
		if (mTotal[m] != 0 && m in mHit)
			println("<m> : <100 * toReal(mHit[m]) / toReal(mTotal[m])> %");
		else println("<m> : 0 %");
	}
	println("Line Coverage : <100*toReal(size(lineHit)) / toReal(size(lineTotal))> %");
}

// Helper function to deal with concrete statement lists
// second arg should be a closure taking a location (of the element)
// and producing the BlockStm to-be-inserted 
BlockStm* putBeforeEvery(BlockStm* stms, BlockStm(loc) f) {
  
  Block put(b:(Block)`{}`) = (Block)`{<BlockStm s>}`
    when BlockStm s := f(b@\loc);
  
  Block put((Block)`{<BlockStm s0>}`) = (Block)`{<BlockStm s> <BlockStm s0>}`
    when BlockStm s := f(s0@\loc);
  
  Block put((Block)`{<BlockStm s0> <BlockStm+ stms>}`) 
    = (Block)`{<BlockStm s> <BlockStm s0> <BlockStm* stms2>}`
    when
      BlockStm s := f(s0@\loc), 
      (Block)`{<BlockStm* stms2>}` := put((Block)`{<BlockStm+ stms>}`);

  if ((Block)`{<BlockStm* stms2>}` := put((Block)`{<BlockStm* stms>}`)) {
    return stms2;
  }
}

void main() {
	l = |project://jpacman|;
	str shdw = "jpacman-instrumented";
	println("processing shadowing project...");
	shadowProject(l, shdw);
	l.authority = shdw;
	println("Now, ready to do test. After testing the project manually,");
	println("run methodCoverage(<l>) or lineCoverage(<l>)");
}

