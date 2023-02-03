---
title: Homework 4 - Strings and Arrays
permalink: /hwk/hwk4
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

# Homework 4: Strings and Arrays

The puprose of this homework is to get additional practice with strings and arrays, and working with them in Java. 

Question 1 is a small project, and Question 2 is a written response question.

Make sure to follow the [collaboration policy][collab] for all homework.

As before, the name after the question number should be what your program is called. 

## Assessment

For **Proficiency** credit, your submissions must pass all the test cases on Gradescope.

For **Mastery** credit, your submission must pass all test cases, and also have:

- Useful, informative variable names 
- Clear and consistent spacing/linebreaks

Your answer for Q2 should include **comments** which detail what you fixed in the code. 

## Q1: `DuplicateWords.java`


You will be given an integer `n`, followed by `n` words, each on their own line. Your job is to read in the input, and then output:

1. How many duplicate words there are
2. What the duplicate words were, in alphabetical order

Example input:

```
5
apple
zebra
bear
zebra
bear
```

Example output:

```
2
bear
zebra
```

[collab]: https://alackles.github.io/CMSC-150-WT-23/syllabus/#collaboration-and-plagiarism

## Q2: `ChickenWalk.java`

Here is a broken answer to the the exam question from Exam 1 (note that this is not anyone's actual code). 

Your job is to **identify the issues** with the code as compared to the project requirements, and **fix them**. Feel free to try to compiel and run the code and use those messages to fix your input. Leave comments wherever you have fixed or changed something to indicate what you did. 

The broken code is below. The problem statement is under that as a refresher. 

```
import java.util.Scanner

class walk {

    public static void walker(n) {
        Random rand = new Random();
        int counter = 0;
        while (n>0) {
            int i = rand.nextInt();
            if (n % 2 == 0) {
                n++;
            } else {
                n--;
            }
            counter++;
        }
        System.out.println(counter);
    }
    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        walker(n);
    }
}

```

### Problem Statement

A chicken accidentally hitches a ride on a truck and finds herself n steps away from her home farm. She needs to make it back home, but because she's a chicken, she has no idea which direction home is, or how to choose which direction to walk.

Your job is to write a program called ChickenWalk.java to simulate the movements of this chicken and find out how long it will take her to return home, in steps, given n (the number of steps she is away from home). You should take the number n from the command line.

To do so, generate a random number between 0 and 99. If that number is even, have her take a step towards home. If it is odd, have her take a step away from home.

Once the chicken reaches home, print out the number of steps it took to get home. (Note that because you are generating a random number, it will not print out the same number of steps each time.)

- Your program should take integer input and give integer output.
- Your program should contain at least one method besides main, and that method should return a value (that is, it should not be a method of type void.) That method should not print anything.
- Your program should be called ChickenWalk.java.
