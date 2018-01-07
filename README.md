# MiniJava

This is a compiler project for MiniJava.



## Members

14307130060 Fenyi Ye 叶奋翼 : lexical/syntactic analysis, error recovery
14307130310 Yihan Cai 蔡一涵 : semantic analysis, projoct report

## How to Run

### Building Environment

`export CLASSPATH=".:<antlr_path>/antlr-4.0-complete.jar:$CLASSPATH"
java -jar <antlr_path>/antlr-4.0-complete.jar
java org.antlr.v4.Tool
alias antlr4='java -jar <antlr_path>/antlr-4.0-complete.jar'
alias grun='java org.antlr.v4.runtime.misc.TestRig'
`

### Compiling
`antlr4 MiniJava.g4
javac *.java`

### Running
`grun MiniJava <context> <option> <testcase>`

## Dependency

Java + ANTLR 4

## Reference

[BNF for MiniJava](http://www.cambridge.org/us/features/052182060X/grammar.html) 

[Modern Compiler Implementation in Java, Second Edition - The MiniJava Project](http://www.cambridge.org/us/features/052182060X/)

The Definitive ANTLR 4 Reference
