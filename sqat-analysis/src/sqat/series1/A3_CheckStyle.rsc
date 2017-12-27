module sqat::series1::A3_CheckStyle

import Java17ish;
import Message;
import util::ResourceMarkers;
import util::FileSystem;
import ParseTree;
import sqat::series1::A1_SLOC;
import IO;
import Set;
import util::ValueUI;

/*

Assignment: detect style violations in Java source code.
Select 3 checks out of this list:  http://checkstyle.sourceforge.net/checks.html
Compute a set[Message] (see module Message) containing 
check-style-warnings + location of  the offending source fragment. 

Plus: invent your own style violation or code smell and write a checker.

Note: since concrete matching in Rascal is "modulo Layout", you cannot
do checks of layout or comments (or, at least, this will be very hard).

JPacman has a list of enabled checks in checkstyle.xml.
If you're checking for those, introduce them first to see your implementation
finds them.

Questions
- for each violation: look at the code and describe what is going on? 
  Is it a "valid" violation, or a false positive?

Tips 

- use the grammar in lang::java::\syntax::Java15 to parse source files
  (using parse(#start[CompilationUnit], aLoc), in ParseTree)
  now you can use concrete syntax matching (as in Series 0)

- alternatively: some checks can be based on the M3 ASTs.

- use the functionality defined in util::ResourceMarkers to decorate Java 
  source editors with line decorations to indicate the smell/style violation
  (e.g., addMessageMarkers(set[Message]))

  
Bonus:
- write simple "refactorings" to fix one or more classes of violations 

*/

/* String Literal Comparision */
set[loc] stringCompLocs(start[CompilationUnit] cu) {
	sel = {};
	visit(cu) {
		case e:(Expr)`<Expr _> == <StringLiteral sl>` :
			sel += e@\loc;
		case e:(Expr)`<Expr _> != <StringLiteral sl>` :
			sel += e@\loc;
		case e:(Expr)`<StringLiteral sl> == <Expr _>` :
			sel += e@\loc;
		case e:(Expr)`<StringLiteral sl> != <Expr _>` :
			sel += e@\loc;
	}
	return sel;
}

set[Message] warningsForStringComp(set[loc] pnl) 
  = { warning("String literal should not used with == or !=", l) | l <- pnl};

set[Message] checkStringComp(loc project) {
	sc = {};
	for (loc l <- files(project), l.extension == "java") {
    	sc += stringCompLocs(parse(#start[CompilationUnit], l, allowAmbiguity=true));
    }
	return warningsForStringComp(sc);
}

/* package nameing check */
set[loc] packageNameLocs(start[CompilationUnit] cu) {
	pnl = {};
	visit(cu) {
		case (PackageDec)`<Anno* _> package  <PackageName pn> ;` :
			pnl += pn@\loc;
	}
	return pnl;
}

set[loc] packageNaming(set[loc] pls) 
	= ( {} | it + l | loc l <- pls, /[a-z]+(\.[a-zA-Z_][a-zA-Z0-9_]*)*/ !:= readFile(l));

set[Message] warningsForPackageName(set[loc] pnl) 
  = { warning("This is not proper package name!", l) | l <- pnl};

set[Message] checkPackageName(loc project) {
	pn = {};
	for (loc l <- files(project), l.extension == "java") {
    	pn += packageNameLocs(parse(#start[CompilationUnit], l, allowAmbiguity=true));
    }
	return warningsForPackageName(packageNaming(pn));
}

/* Naming convention for constants */
set[loc] constantLocs(start[CompilationUnit] cu) {
	cl = {};
	visit(cu) {
		case c:(FieldDec) `static final <Type _> <Id i> = <VarInit vi> ;`:
				cl += i@\loc;
		case c:(ConstantDec) `static final <Type _> <Id i> = <VarInit vi> ;` :
				cl += i@\loc;
		case c:(FieldDec) `final static <Type _> <Id i> = <VarInit vi>;`:
				cl += i@\loc;
		case c:(ConstantDec) `final static <Type _> <Id i> = <VarInit vi> ;` :
				cl += i@\loc;
	}
	return cl;
}

set[loc] constantNaming(set[loc] cls) 
  = ( {} | it + l | loc l <- cls, /[A-Z][A-Z0-9]*(_[A-Z0-9]+)*/ := readFile(l));

set[Message] warningsForConstantName(set[loc] ms) 
  = { warning("Better to keep constant naming convention!", l) | l <- ms  };

set[Message] checkConstantName(loc project) {
	cn = {};
	for (loc l <- files(project), l.extension == "java") {
    	cn += constantLocs(parse(#start[CompilationUnit], l, allowAmbiguity=true));
    }
	return warningsForConstantName(constantNaming(cn));
}

void main() {
	loc project = |project://jpacman/|;
	addMessageMarkers(checkConstantName(project));
	addMessageMarkers(checkPackageName(project));
	addMessageMarkers(checkStringComp(project));
}
