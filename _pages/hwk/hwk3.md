---
title: Homework 3 - Loops
permalink: /hwk/hwk3
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

The purpose of this homework is to get more practice with loops, and in particular nested loops. This homework is intended to be relatively short since it deals with fewer topics than the previou homework.

Questions 1-3 are coding questions.

Question 4 is a written response question.

Make sure to follow the [collaboration policy][collab] for all homework.

As before, the name after the question number should be what your program is called. 

Note that **when you take user input for turning in your homework, you should not have a text prompt to do so.** That is, the only thing that the program should print is the requested output. Each homework question below has an example of what should print based on a given input. The `>` indicates the input. 

## Assessment

For **Proficiency** credit, your submissions for 1-3 must pass all test cases in Gradescope. Your submission for 4 must be of sufficient length and address the questions asked.

For **Mastery** credit, your submission must pass all test cases, and also have:

- Useful, informative variable names 
- Clear and consistent spacing/linebreaks

Your written submission must show evidence of careful thought and correctly identify the difference between a while loop and a do-while loop. 

[collab]: https://alackles.github.io/CMSC-150-WT-23/syllabus/#collaboration-and-plagiarism

## Questions


### Q1: `PrettyPrint.java`

Write a method called that prints the following output using nested loops:

```
* * * * *
* * * * *
* * * * *
```

Then, write a second method that prints the following output, also using nested loops:

```
* * *
* * *
* * *
* * *
* * *
```

Call both methods from main; call the one with more columns than rows first, and print a `-` between them.

Required Output:

```
* * * * *
* * * * *
* * * * *
-
* * *
* * *
* * *
* * *
* * *
```

**Note:** The autograder expects that each line of asterisks has a space at the end (but not the line with the dash). This is because the most natural way to solve the problem will include a space at the end of the asterisk lines. If you are having trouble with getting the autograder to accept your solution, let me know so I can take a look at your code.

### Q2: `PrettyPrintGen.java`

Alter your program from question 1 so that you have a **single** method which takes the number of rows and columns to print as arguments to the method. 

Then, read in the desired number of rows and columns from the user, and print the method both ways. 

It should still print the 'longer' one first regardless of the order in which the inputs are given.

Example Input/Output:

```
> 2
> 3
* * *
* * *
-
* *
* *
* *
```

**Note:** The autograder expects that each line of asterisks has a space at the end (but not the line with the dash). This is because the most natural way to solve the problem will include a space at the end of the asterisk lines. If you are having trouble with getting the autograder to accept your solution, let me know so I can take a look at your code.

### Q3: `ProductSum.java`

Find the sum of the factorial of every number between two given numbers. As a reminder, factorial is defined as:

$$n! = n \times (n-1) \times (n-2) \times ... \times 1$$

For example, 5! = 5 * 4 * 3 * 2 * 1  = 20

**Caution:** Factorial gets VERY big, VERY fast. To test this program, only use numbers between 1 and 10. 

Example:

```
> 2
> 5
152
```

### Q4: Do-While

Another loop structure in Java that is less common is called the `do-while` loop. We did not talk about this in class, but for this homework problem, you will investigate how this loop works. 

Below are a 'while' and 'do-while' loop that function similarly. Run these two pieces of code and compare their output:

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

Then run these other while and do-while loops, and compare the output of each:

```java
int i = 5;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

```java
int i = 5;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

**Question:** What does this experiment tell you about the difference between a while and do-while loop? Can you think of scenarios in which might use a do-while loop instead of a while loop? Or vice versa? Give your thoughts in 4-5 sentences.

