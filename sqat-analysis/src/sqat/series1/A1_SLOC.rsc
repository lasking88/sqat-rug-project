module sqat::series1::A1_SLOC

import IO;
import Map;
import Set;
import ParseTree;
import String;
import util::FileSystem;
import util::Math;

/* 

Count Source Lines of Code (SLOC) per file:
- ignore comments
- ignore empty lines

Tips
- use locations with the project scheme: e.g. |project:///jpacman/...|
- functions to crawl directories can be found in util::FileSystem
- use the functions in IO to read source files

Answer the following questions:
- what is the biggest file in JPacman?
- what is the total size of JPacman?
- is JPacman large according to SIG maintainability?
- what is the ratio between actual code and test code size?

Sanity checks:
- write tests to ensure you are correctly skipping multi-line comments
- and to ensure that consecutive newlines are counted as one.
- compare you results to external tools sloc and/or cloc.pl

Bonus:
- write a hierarchical tree map visualization using vis::Figure and 
  vis::Render quickly see where the large files are. 
  (https://en.wikipedia.org/wiki/Treemapping) 

*/

alias SLOC = map[loc file, int sloc];

SLOC sloc(loc project) =
	(() | it + slocFile(f) | f<-find(project, "java"));

SLOC slocFile(loc fileLoc) =
	(fileLoc:size(split("\n", preProcess(readFile(fileLoc)))));

str preProcess(str fileLiteral) {
	contents = fileLiteral;
	/* Remove C-style comments */
	while (/<comment:\/\*(\*+[^\*\/]|[^\*])*\**\*\/>/ := contents) {
		contents = replaceAll(contents, comment, "");
	}
	/* Remove single line of comment */
	while (/<comment:\/\/[^\n]*>/ := contents) {
		contents = replaceAll(contents, comment, "");
	}
	/**
	 * Substitute multi-whitespaces (which contains at least a '\n') 
	 * with a new line character
	 **/
	while (/<empty:\n[\s]+>/ := contents) {
		contents = replaceAll(contents, empty, "\n");
	}
	/* Remove a starting '\n' if exists */
	if (contents[0] == "\n") contents = contents[1..]; 
	return contents;
}

SLOC getMax(SLOC s) = 
	(location: s[location] | location <- s, s[location] >= max(s<1>));
	
int sumSloc(SLOC s) = 
	(0 | it + s[location] | location <- s);

void main() {
  loc jpacman = |project://jpacman/|;
  loc jpacmanTest = |project://jpacman/src/test/|; // location for test code
  loc jpacmanActual = |project://jpacman/src/main/|; // location for actual code
  
  SLOC slocJpacman = sloc(jpacman); // SLOC of jpacman
  SLOC maxSLOC = getMax(slocJpacman); // max SLOC(s) of jpacman
  println("Maximum SLOC of jpacman project : <maxSLOC>");
  int sizeSLOC = sumSloc(slocJpacman); // size of jpacman project
  println("Total size of jpacman project: <sizeSLOC> lines");
  println("According to SIG model, 0-66 KLOC Java project is ranked as ++.");
  println("so that JPacman project is extremely small.");
  
  sumActualSloc = sumSloc(sloc(jpacmanActual));
  sumTestSloc = sumSloc(sloc(jpacmanTest));
  
  println("Actual Code : <sumActualSloc> lines");
  println("Test Code : <sumTestSloc> lines");
  println("Ratio : <toReal(sumActualSloc) / toReal(sumTestSloc)>"); // ratio between actual code and test code
}

test bool skippingMulticomments() = 
	preProcess("test();/* this is
	' multiple comment
	' example */") == "test();";
	
test bool consecutiveSpace() =
	preProcess("test();
	'
	' 
	'test();") ==
	"test();
	'test();";