module sqat::series1::A1_SLOC

import IO;
import Map;
import Set;
import ParseTree;
import String;
import util::FileSystem;

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

SLOC sloc(loc project) {
	result = ();
	for (f <- find(project, "java")) {
		result = result + slocFile(f);
	}
	return result;
}

SLOC slocFile(loc fileLoc) {
  SLOC result = ();
  str contents = readFile(fileLoc);
  contents = removeComments(contents);
  contents = removeEmptyLines(contents);
  list[str] lines = split("\n", contents);
  result[fileLoc] = size(lines);
  return result;
}

str removeComments(str fileLiteral) {
	contents = fileLiteral;
	while (/<comment:\/\*(\*+[^\*\/]|[^\*])*\**\*\/>/ := contents) {
		contents = replaceAll(contents, comment, "");
	}
	while (/<comment:\/\/[^\n]*>/ := contents) {
		contents = replaceAll(contents, comment, "");
	}
	return contents;
}

str removeEmptyLines(str fileLiteral) {
	contents = fileLiteral;
	while (/<empty:\n[\s]+>/ := contents) {
		contents = replaceAll(contents, empty, "\n");
	}
	if (contents[0] == "\n") contents = contents[1..]; 
	return contents;
}

void printMax(SLOC s) {
	li = toList(s);
	int idx =  indexOf(li<1>, max(li<1>));
	println(li[idx]);
}

int sumSloc(SLOC s) {
	int sum = 0, len = size(s);
	for (l <- s<0>) {
		sum += s[l];
	}
	return sum;
}

void main() {
  loc jpacman = |project://jpacman/|;
  loc jpacmanTest = |project://jpacman/src/test/|;
  loc jpacmanActual = |project://jpacman/src/main/|;
  loc example = |project://sqat-analysis/src/sqat/series1/SlocExample.rsc|;
  SLOC slocJpacman = sloc(jpacman);
  printMax(slocJpacman); // print max lines of code with location
  println(sumSloc(slocJpacman)); // print size of project
  // Since it consists of 2459 LOC, it is ranked as ++ in terms of SIG model.
  
  sumActualSloc = sumSloc(sloc(jpacmanActual));
  sumTestSloc = sumSloc(sloc(jpacmanTest));
  
  println("Actual Code : <sumActualSloc>");
  println("Test Code : <sumTestSloc>");
  println(sumActualSloc / sumTestSloc); // ratio between actual code and test code
}