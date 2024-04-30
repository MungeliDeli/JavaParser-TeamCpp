# Book Lending Project

This repository contains the code files and resources for the Book Lending project, completed as part of the CSC3301 assignment on understanding program structure through Abstract Syntax Trees (AST) and tokenization of source code.

## Introduction

The purpose of this assignment was to gain a deeper understanding of program structure through the analysis of Abstract Syntax Trees (AST) and tokenization of source code. Key tools and technologies utilized for this assignment include Visual Studio Code (VSCode) as the Integrated Development Environment (IDE), Maven for project management, Graphviz for visualizing ASTs as diagrams, and Java Parser libraries obtained from GitHub for parsing Java source code.

## Implementation

### Functionality Implemented for the Book Lending Project:

The implemented functionality allows users to interact with a simple book lending system. Key features include:

- Adding Books
- Borrowing Books
- Returning Books

### Summary of Source Code Structure:

The source code consists of two classes:

- `Library`: Manages the library's collection of books and provides methods for adding, lending, and returning books.
- `BookLending` (Main): Contains the main method responsible for user interaction.

## Abstract Syntax Trees (AST)

ASTs are hierarchical structures used to represent the syntactic structure of code. They provide a structured, abstract view of code's syntax, capturing its essential elements and relationships. The visual representations of the ASTs are found in the Appendix.

## Token Analysis

Token analysis involves breaking down source code into its smallest meaningful units, called tokens. The types of tokens and their frequencies in the source code are analyzed and presented.

## Conclusion

In conclusion, the analysis of the code structure and token distribution provides valuable insights into the organization and composition of the software.

## Appendix: Project Repository

The code files and resources for this assignment are available in the following GitHub repository: [JavaParser-TeamCpp](https://github.com/MungeliDeli/JavaParser-TeamCpp.git).

### Folder Contents:

1. **Code Files:** 
   - `BookLending.java`: Contains the main program code.
   - JavaParser classes:
     - `AbstractSyntaxPrinter.java`: Prints the AST and generates the .dot files for graphic visualization of the AST.
     - `TokenCounter.java`: Prints the number of tokens in the source code file.
     - `TokenTypeCounter.java`: Prints the types of tokens and how many there are of each type.

2. **Other Files:** 
   - Screenshots for the outputs.
   - Graphviz AST diagrams (in PDF format).
