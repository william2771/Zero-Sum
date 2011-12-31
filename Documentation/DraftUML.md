#Preliminary design
##Behavior
2 Well defined behavior for the entire suite:
1. Code Generation
2. Code Analysis

###Code Generation
Various Methods of Code Generation (strategic, etc.)

###Code Analysis
Analysis of various metrics (coding efficiency, coverage, power, etc.)


##Classes

###CodeWord
Basic parent class of all code words contains associated behavior of a codeword
####Behavior/Methods
* Reporting various stats?
* Coding efficency
* Code length
* toString

###Zero-Sum* CodeWord
**Extends** CodeWord
Representation for all ZS* family, includes a weight set (assigned)
####Behavior/Methods
* Get Data field
* Get check field
* Get Parity
* Get Syndrome

###Field Vector
A wrapper for an Array of Bits (0 or 1)
####Behavior/Metods
* Flip(index)
* Get parity