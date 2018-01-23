module sqat::series2::A1a_StatCov

import lang::java::jdt::m3::Core;
import util::ValueUI;
import IO;
import Set;
import util::Math;
/*

Implement static code coverage metrics by Alves & Visser 
(https://www.sig.eu/en/about-sig/publications/static-estimation-test-coverage)


The relevant base data types provided by M3 can be found here:

- module analysis::m3::Core:

rel[loc name, loc src]        M3@declarations;            // maps declarations to where they are declared. contains any kind of data or type or code declaration (classes, fields, methods, variables, etc. etc.)
rel[loc name, TypeSymbol typ] M3@types;                   // assigns types to declared source code artifacts
rel[loc src, loc name]        M3@uses;                    // maps source locations of usages to the respective declarations
rel[loc from, loc to]         M3@containment;             // what is logically contained in what else (not necessarily physically, but usually also)
list[Message]                 M3@messages;                // error messages and warnings produced while constructing a single m3 model
rel[str simpleName, loc qualifiedName]  M3@names;         // convenience mapping from logical names to end-user readable (GUI) names, and vice versa
rel[loc definition, loc comments]       M3@documentation; // comments and javadoc attached to declared things
rel[loc definition, Modifier modifier] M3@modifiers;     // modifiers associated with declared things

- module  lang::java::m3::Core:

rel[loc from, loc to] M3@extends;            // classes extending classes and interfaces extending interfaces
rel[loc from, loc to] M3@implements;         // classes implementing interfaces
rel[loc from, loc to] M3@methodInvocation;   // methods calling each other (including constructors)
rel[loc from, loc to] M3@fieldAccess;        // code using data (like fields)
rel[loc from, loc to] M3@typeDependency;     // using a type literal in some code (types of variables, annotations)
rel[loc from, loc to] M3@methodOverrides;    // which method override which other methods
rel[loc declaration, loc annotation] M3@annotations;

Tips
- encode (labeled) graphs as ternary relations: rel[Node,Label,Node]
- define a data type for node types and edge types (labels) 
- use the solve statement to implement your own (custom) transitive closure for reachability.

Questions:
- what methods are not covered at all?
- how do your results compare to the jpacman results in the paper? Has jpacman improved?
- use a third-party coverage tool (e.g. Clover) to compare your results to (explain differences)

*/

alias Node = loc;
alias Edge = tuple[loc, str, loc];
alias Nodes = set[Node];
alias Edges = set[Edge];
alias Graph = tuple[Nodes, Edges];

M3 jpacmanM3() = createM3FromEclipseProject(|project://jpacman|);

void main() {
	m = jpacmanM3();
	// nodes information
	Nodes cls = classes(m);
	Nodes ifs = interfaces(m);
	Nodes pkgs = packages(m);
	Nodes mthds = {mthd | mthd <- methods(m), !isConstructor(mthd)};
	Nodes cnstr = {mthd | mthd <- methods(m), isConstructor(mthd)};
	Nodes nodes = cls + ifs + pkgs + mthds;
	
	// edges
	// structural information
	// edges from packages to class or interface
	Edges dt = {<from, "defineType", to> | <from, cu> <- m.containment, isCompilationUnit(cu), <cu, to> <- declaredTopTypes(m)};
	// edges from class or interface to method
	Edges dm = {<from, "defineMethod", to> | <from, to> <- declaredMethods(m), !isConstructor(to), from in nodes, to in nodes };

	// call information
	Edges c = {<from, "call", to> | from <- dm<2>, to <- m.methodInvocation[from], to in nodes };
	map[loc,loc] mapping = (const : class | <class, const> <- declaredMethods(m), isConstructor(const));
	c += {<mapping[from], "call", to> | <from, to> <- m.methodInvocation, isConstructor(from), to in mthds };
	copy = c;
	c += {<from, "call", to2> | <from, "call", to> <- copy, <to,to2> <- m.methodOverrides, to2 in nodes };
	c += {<from, "call", to2> | <from, "call", to> <- copy, <to2,to> <- m.methodOverrides, to2 in nodes };
	Edges i = {<from, "init", to> | <from, "call", via> <- c, <viaclass, "defineMethod", via> <- dm, <viaclass, "call", to> <- c};
	Edges ivk = {<from, "invoke", to> | <from, _, to> <- c + i};
	Edges tmp = ivk;
	solve(ivk) {
		lhs = {<from, to> | <from, "invoke", to> <- ivk};
		rhs = {<from, to> | <from, "invoke", to> <- tmp};
		ivk += {<from, "invoke", to> | <from, to> <- lhs o rhs};
	}
	Edges edges = dt + dm + c + i + ivk;
	
	// get test classes
	testMethods = { mthd | <mthd, annot> <- m.annotations, /.*junit.*/ := annot.path || /.*cucmber.*/ := annot.path, !isConstructor(mthd) }; 

	// collect covered methods
	coveredMethods = {from, to | <from, "invoke", to> <- edges, from <- testMethods};
	
	println("Not covered Methods : <mthds - coveredMethods>");
	println("In the paper, Pacman is covered statically 84% and 90% by Clover.
			'In this program, it covers 78% at system level and 78% by Clover.
			'So, it is hard to say that the pacman project has been improved.
			'Although the coverage seems similar, but at package level or at class level
			'they are quite different. Because this static coverage takes only 
			'the methods hit or not, while Clover takes method lines that are
			'excuted or not. In other words, there is not 50% of method hit on
			'static coverage.
			'Furthermore, it does not count method calls from out of this project,
			'but it can happen to have those calls.
			'");
	
	int hit = 0;
	int total = 0;
	map[loc, int] pHit = ();
	map[loc, int] pTotal = ();
	map[loc, int] cHit = ();
	map[loc, int] cTotal = ();
	for (fp <- pkgs) {
		pHit[fp] = 0;
		pTotal[fp] = 0;
		for (<fp,_,fc> <- dt) {
			cTotal[fc] = 0;
			cHit[fc] = 0;
			for (<fc,_,fm> <- dm) {
				cTotal[fc] += 1;
				if (fm in coveredMethods) cHit[fc] += 1;
			}
			pHit[fp] += cHit[fc];
			pTotal[fp] += cTotal[fc];
		}
		hit += pHit[fp];
		total += pTotal[fp];
	}
	println("System coverage : <100*toReal(hit)/toReal(total)>%");
	for (fp <- pkgs) {
		if (pTotal[fp] != 0) {
			println("	Package <fp> : <100*toReal(pHit[fp])/toReal(pTotal[fp])>%");
			for (<fp,_,fc> <- dt) {
				if (cTotal[fc] != 0) {
					println("		Class <fc> : <100*toReal(cHit[fc])/toReal(cTotal[fc])>%");
				}
			}
		}
	}
}