---
title: Homework 1 - Variables & Algorithmic Thinking
permalink: /hwk/hwk1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

## Overview

The purpose of this first homework is to get you familiar with writing and submitting your own Java programs, as well as to familiarize you with Gradescope and the autograder software. 

Make sure to follow the [collaboration policy][collab] for all homework.

## Questions

### Question 1: `CourseName.java`

Consider the following Java program. 

```java
class CourseName {
    public static void main(String[] args) {
        String courseName = "CS 101"
        // print statement here
    }
}
```

Save this program as an appropriately named file, change the name to our course code (CMSC150), and have the file print the sentence `This course is called CMSC150.` (note the period at the end). **Use the variable `courseName` in the print statement.** Submit your changed file.

### Question 2: `Eggs.java`

Write a Java program called `Eggs.java` that does the following:

1. Creates an integer, called `eggs`, that stores the number 30.
2. Creates a double, called `dozens`, that stores the number of dozens of eggs that you have (There are 12 eggs in 1 dozen). 
3. Prints a string, using the variables `eggs` and `dozens`, that prints out `You have #EGGS eggs (#DOZENS dozen)`. where `#EGGS` and `#DOZENS` are replaced by their respective values.

Example: If `eggs` was 45, the program should print `You have 45 eggs (3.75 dozen)`.

_Notice that there should **not** be a period (`.`) at the end of the sentence._

### Question 3: `Convert.java`

You are an accountant for a small business on Planet Glorp that needs to do some interplanetary currency exchange with Planet Murple. Glorp currency is called `glorps`, and Murple currency is called `murps`. The current exchange rate is 1 glorp = 0.7 murps. For example, 25 glorps would be 17.5 murps. 

However, Murple currency does not have a concept of fractional murps. All fractional amounts are rounded down to the nearest whole number. Here are some examples:

20 glorps = 14 actual value = 14 murps  
25 glorps = 17.5 actual value = 17 murps  
2.99 glorps = 2.093 actual value = 2 murps  
1000 glorps = 700.7 actual value = 700 murps  

 **Write a Java program called `Convert.java` that will convert `7455.47 glorps` into the appropriate number of murps, and then print that number, along with the word `murps`, to the console.**

 For example, if you had 25 glorps, the program should print `17 murps`. 


## Assessment

For **Proficiency** credit, your submission must pass all test cases in Gradescope.

For **Mastery** credit, your submission must pass all test cases, and also have:

- Useful, informative variable names (e.g. `glorps` rather than `x1`)
- Clear and consistent spacing/linebreaks

[collab]: https://alackles.github.io/CMSC-150-WT-23/syllabus/#collaboration-and-plagiarism