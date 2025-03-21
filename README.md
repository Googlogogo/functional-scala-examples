# Functional Programming in Scala: Lambdas, Map, Filter, and Fold

## Introduction
This repository contains a Scala file (`FunctionalExamples.scala`) that demonstrates the use of **lambda expressions**, **map**, **filter**, and **fold** in Scala, and compares key features with purely functional programming languages like Racket and Haskell. These examples are designed to help you understand functional programming concepts in Scala.

## How to Run the Code

### Prerequisites
- [Install **Scala**](https://www.scala-lang.org/download/) (version 2.13+ recommended)
- [Install **sbt**](https://www.scala-sbt.org/download/) (Scala Build Tool)

### Environment
- IntelliJ IDEA with **Scala** plugin installed (Recommended)
- VS Code with **Scala (Metals)** extension installed

### Running the Code
#### Using sbt (Recommended)
1. Clone the Repository and navigate to the project directory:  
```bash
git clone https://github.com/Googlogogo/functional-scala-examples.git
cd functional-scala-examples
```

2. Start SBT from your project's root directory:
```bash
sbt new
```
or if you already have sbt environment:
```bash
sbt
```

3. Drag the `Examples.scala` file under the folder `src/main/scala/example`

4. Inside the SBT console, compile and run your code:
```bash
compile
run
```

Alternatively, once you created the sbt environment, you can compile and run the project in the command line:
```bash
sbt compile
sbt run
```

#### Using the Scala REPL
Alternatively, you can test each function interactively:
1. Open the Scala REPL by typing the following in your shell:
```bash
scala
```

2. Copy and paste the function examples from `Examples.scala` into the REPL.
```bash
// Sample Output
Lambda Example:
double(5) = 10

Map Example 1 - Squaring Numbers:
Original numbers: List(1, 2, 3, 4)
Squared numbers: List(1, 4, 9, 16)

Map Example 2 - Processing User Data:
Users: List(User(Alice,25), User(Bob,30), User(Charlie,35))
Names: List(Alice, Bob, Charlie)

Filter Example 1 - Filtering Even Numbers:
Numbers 1 to 10: List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
Even numbers: List(2, 4, 6, 8, 10)

Filter Example with view - Lazy Filtering:
Lazy even numbers: List(2, 4, 6, 8, 10)

Filter Example 2 - Filtering Active Users:
All users: List(UserWithStatus(Alice,true), UserWithStatus(Bob,false), UserWithStatus(Charlie,true))
Active users: List(UserWithStatus(Alice,true), UserWithStatus(Charlie,true))

Fold Example 1 - Multiplying a List of Numbers:
Numbers: List(1, 2, 3, 4)
Product using foldRight: 24

Fold Example 2 - Calculating Total Salary:
Employees: List(Employee(Alice,50000.0), Employee(Bob,60000.0), Employee(Charlie,70000.0))
Total salary: 180000.0

Combined Example - Filter, Map, and FoldLeft:
Numbers: List(1, 2, 3, 4, 5, 6)
Result of filtering evens, squaring, and summing: 56
```

## License
This project is for educational purposes only, and is only used for the course CSCC24: Principles of Programming Languages.

## Author
Yiran (Gogo) Yu
