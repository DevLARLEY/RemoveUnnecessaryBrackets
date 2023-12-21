# RemoveUnnecessaryBrackets
Created be me, this program removes all unnecessary brackets from a calculation ?1+(2+(3*4)+5)? (Question marks intentional). It will solve ANY calculation as long as it doesn't use spceial math-shortforms like: (1+1)(1+1) or 3(1+1) (multiplication operator is left out)

# Requirements
JDK 14.0.2 (Not working on JDK 11, 17).
Please note that when compiling the source file, the same Java version must be used to run the program.

# Compiling 

```sh
javac RemoveUnnecessaryBrackets.java
```

# Running

```sh
java RemoveUnnecessaryBrackets ?[CALCULATION]?
```

# Example Output

```sh
((3+4)+(5+6))+((7-8)*(9*(1*2))) --[43ms]-> 3+4+5+6+(7-8)*9*(1*2)
```
