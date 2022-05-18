# JavaScript Study Guide 05/20

## Data Types, Variables, Type Conversion
- Integer
    ```
    let integer = 5;
    ```
- String
    ```
    let string = "Jimbei";
    ```
- float
    ```
    let float = 6.6;
    ```
- Booleans
    ```
    let boolean = false;
    ```
- character
    ```
    let character = "A";
    ```
- Objects
    ```
    let pirateCrew = {
        firstMate: "Zoro",
        secondMate: "Nami",
        thirdMate: "Usopp",
        fourthMate: "Sanji",
        fifthMate: "Tony-Tony Chopper",
        sixthMate: "Nico Robin",
        seventhMate: "Franky",
        eigthMate: "Brook",
        ninthMate: "Jimbei",
        tenthMate: "Yamaoto"
    }
    ```
- Numbers

## Operators
- Arithmetic
    ```
    let sum = a + b;
    let difference = a - b;
    let product = a * b;
    let qoutient = a / b;
    ```
- Logical
    ```
    // LOGICAL AND
    if(score > 5 && score < 10){
        return true;
    }

    // LOGICAL OR
    if(score > 5 || score < 10){
        return false;
    }
    ```
- Comparisons
- Assignment
    ```
    let add = function(a,b,c){
        return a + b + c;
    }
    ```
- Bitwise

## Control Statements
- If/else
- if/elseif
- switch statements

## Loops
- For Loop
- while loop
- do/while loop
- foreach loop
- for in loop

## Basic Keywords
- Break
- continue

## Collections
- Arrays
- List
- Maps
- Objects

## Functions
- Scope
- custom function syntax
- String Methods
- Number Methods
- Array Methods
- Date Get Methods
- Date Set Methods
- Array Sort

## Class and Objects
- Math
- Random
- Dates

## Best Practices
- RegExp
    ```
    let vowel = /[aeiou]/;
    ```
- Errors
- Debugging
- Hosting or Hoisting?
- Strict Mode
- Best Practices
- Mistakes
- Performance
- Versions
- JSON

## JS Forms
- Forms and Forms API

## JS Objects
- Definitions
- Properties
- Methods
- Constructors
- Prototypes

## JS Functions
- Invocation
- Call
- Apply
- Closures

## QUESTIONS
1. What is Javascript?
2. What is the benefirt of Modern JavaScript
3. What is Prototypes in javascipt   in regards to object?
4. Know the reason why we seperate javascript, html, and css in different files. understand the file structures
5. understand how javascript arrays work
6. understand how these operator work in JS
    - .reverse()
    ```
    // the reverse() operator reverses an array, where the first element becomes last and the last element becomes first

    let string = "OnePiece";
    string.split("").reverse();
    
    // expected output = ["e","c","e","i","P","e","n","O"]
    ```
    - .filter()
    - .prototype()
    - .split()
    ```
    // the split() operator divides a string into an ordered list of substrings, and puts them into an array and returns the substring array
    
    let string = "Zoro";
    string.split("");
    
    // expected output = ["Z","o","r","o"]
    ```
    - .lastIndexOf()
    - .splice()
    - .sort()
    - .slice()
    - .substring()      
7. understand how the operators work in JS
    - .forEach()
    - .map() 
8. understand how variables work in javascript
9. understand how to declare integer variables
10. understand how to declare strings
11. understand for loops, while loops, and switch cases.
12. can you traverse through a string with a for loop?
13. understand how to use the enhanced for loop
14. Understand how to use an alert in javascript
15. in a for loop understand what does the break key word accomplish and what does the continue keyword accomplish.
16. forEvery()
17. forEach()
18. callForEvery()
19. callForEach()
20. How to concatanate
21. Understand how JavaScript Date object works