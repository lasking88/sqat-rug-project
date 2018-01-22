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
		case (PackageDec)`<Anno* _> package <PackageName pn> ;` :
			if (/[a-z]+(\.[a-zA-Z_][a-zA-Z0-9_]*)*/ !:= "<pn>")
				pnl += pn@\loc;
	}
	return pnl;
}

set[Message] warningsForPackageName(set[loc] pnl) 
  = { warning("This is not proper package name!", l) | l <- pnl};

set[Message] checkPackageName(loc project) {
	pn = {};
	for (loc l <- files(project), l.extension == "java") {
    	pn += packageNameLocs(parse(#start[CompilationUnit], l, allowAmbiguity=true));
    }
	return warningsForPackageName(pn);
}

/* Check empty statement */
set[loc] emptyStmsLoc(start[CompilationUnit] cu) {
	esl = {};
	visit(cu) {
		case s:(Stm)`;` : esl += s@\loc; 
	}
	return esl;
}

set[Message] warningsForEmptyStms(set[loc] ces) =
	{ warning("Empty Statement!", l) | l <- ces};

set[Message] checkEmptyStatement(loc project) {
	ces = {};
	for (loc l <- files(project), l.extension == "java") {
    	ces += emptyStmsLoc(parse(#start[CompilationUnit], l, allowAmbiguity=true));
    }
	return warningsForEmptyStms(ces);
}

/* Check number of fields in a class */
set[loc] fieldLocs(start[CompilationUnit] cu, int threshold) {
	fl = {};
	visit(cu) {
		case ClassDec cd :	fl = checkNrMthds(cd, threshold);
	}
	return fl;
}

set[loc] checkNrMthds(ClassDec cd, int threshold) {
	count = 0;
	cnm = {};
	visit(cd) {
		case FieldDec fd : {
			cnm += fd@\loc;
			count += 1;
		}
	}
	if (count <= threshold) cnm = {};
	return cnm;
}

set[Message] warningsForNrFields(set[loc] nf, int threshold) =
	{ warning("This class has more than <threshold> fields!", l) | l <- nf };
	
set[Message] checkNrFields(loc project, int threshold) {
	cnf = {};
	for (loc l <- files(project), l.extension == "java") {
    	cnf += fieldLocs(parse(#start[CompilationUnit], l, allowAmbiguity=true), threshold);
    }
	return warningsForNrFields(cnf, threshold);
}

void main() {
	loc project = |project://jpacman/|;
	removeMessageMarkers(project);
	addMessageMarkers(checkPackageName(project));
	addMessageMarkers(checkStringComp(project));
	addMessageMarkers(checkEmptyStatement(project));
	addMessageMarkers(checkNrFields(project, 20));
	/**
	 * The message warnings are checked manually by creating example code that viaolates rules
	 * Jpacman project keeps these implemented rules except for the our own rule when the threshold is lowered.
	 **/
}
