module sqat::series2::A2_CheckArch

import sqat::series2::Dicto;
import lang::java::jdt::m3::Core;
import Message;
import ParseTree;
import IO;
import String;
import sqat::series2::A1a_StatCov;


/*

This assignment has two parts:
- write a dicto file (see example.dicto for an example)
  containing 3 or more architectural rules for Pacman
  
- write an evaluator for the Dicto language that checks for
  violations of these rules. 

Part 1  

An example is: ensure that the game logic component does not 
depend on the GUI subsystem. Another example could relate to
the proper use of factories.   

Make sure that at least one of them is violated (perhaps by
first introducing the violation).

Explain why your rule encodes "good" design.
  
Part 2:  
 
Complete the body of this function to check a Dicto rule
against the information on the M3 model (which will come
from the pacman project). 

A simple way to get started is to pattern match on variants
of the rules, like so:

switch (rule) {
  case (Rule)`<Entity e1> cannot depend <Entity e2>`: ...
  case (Rule)`<Entity e1> must invoke <Entity e2>`: ...
  ....
}

Implement each specific check for each case in a separate function.
If there's a violation, produce an error in the `msgs` set.  
Later on you can factor out commonality between rules if needed.

The messages you produce will be automatically marked in the Java
file editors of Eclipse (see Plugin.rsc for how it works).

Tip:
- for info on M3 see series2/A1a_StatCov.rsc.

Questions
- how would you test your evaluator of Dicto rules? (sketch a design)
- come up with 3 rule types that are not currently supported by this version
  of Dicto (and explain why you'd need them). 
*/


set[Message] eval(start[Dicto] dicto, M3 m3) = eval(dicto.top, m3);

set[Message] eval((Dicto)`<Rule* rules>`, M3 m3) 
  = ( {} | it + eval(r, m3) | r <- rules );
  
set[Message] eval(Rule rule, M3 m3) {
  set[Message] msgs = {};
  switch(rule) {
  	case (Rule)`<Entity e1> cannot depend <Entity e2>`: {
  		msgs += check(rule, m3);
  		break;
  	}
  	case (Rule)`<Entity e1> may inherit <Entity e2>`: {
  		msgs += check(rule, m3);
  		break;
  	}
  	case (Rule)`<Entity e1> must invoke <Entity e2>`: {
  		msgs += check(rule, m3);
  		break;
  	}
  	default :
  		println("This is rule is not yet supported!");
  }
  
  return msgs;
}

set[Message] check((Rule)`<Entity e1> cannot depend <Entity e2>`, M3 m3) {
	set[Message] ms = {};
	dependency = m3.typeDependency;
	pke1 = replaceAll("<e1>", ".", "/");
	pke2 = replaceAll("<e2>", ".", "/");
	ms += { warning("<pke1> cannot depend <pke2>", from) | <from, to> <- dependency, /.*<pke1>.*/ := from.path, /.*<pke2>.*/ := to.path};
	println(ms);
	return ms;
}

set[Message] check((Rule)`<Entity e1> may inherit <Entity e2>`, M3 m3) {
	set[Message] ms = {};
	inheritance = m3.extends;
	inheritance += m3.implements;
  	solve(inheritance) { inheritance += (inheritance o m3.extends); }
  	pke1 = replaceAll("<e1>", ".", "/");
  	pke2 = replaceAll("<e2>", ".", "/");
  	bool isInherited = false;
  	for (<from,to> <- inheritance) {
  		if (/.*<pke1>.*/ := from.path, /.*<pke2>.*/ := to.path) {
  			isInherited = true;
  			break;
  		}
  	}
  	if (!isInherited) ms += warning("<pke1> may inherit <pk2>", from);
  	println(ms);
  	return ms;
}

set[Message] check((Rule)`<Entity e1> must invoke <Entity e2>`, M3 m3) {
	set[Message] ms = {};
	invocation = m3.methodInvocation;
	pke1 = replaceAll("<e1>", ".", "/");
  	pke2 = replaceAll("<e2>", ".", "/");
  	bool isCalled = false;
  	for (<from,to> <- inheritance) {
  		if (/.*<pke1>.*/ := from.path, /.*<pke2>.*/ := to.path) {
  			isCalled = true;
  			break;
  		}
  	}
  	if (!isCalled) ms += warning("<pke1> must invoke <pke2>", from);
  	println(ms);
  	return ms;
}