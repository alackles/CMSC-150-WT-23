---
title: Homework 1 - Variables & Algorithmic Thinking
permalink: /hwk/hwk2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

## Overview

The purpose of this first homework is to give you practice with handling user input and output, as well as writing your own methods. 

This homework has many problems, but they are all relatively short. In the future, homeworks will have fewer, more complex problems. 

Questions 1-8 are coding questions.

Question 9 is a written response question.

Make sure to follow the [collaboration policy][collab] for all homework.

As before, the name after the question number should be what your program is called. 

Note that **when you take user input for turning in your homework, you should not have a text prompt to do so.** That is, the only thing that the program should print is the requested output. Each homework question below has an example of what should print based on a given input. The `>` indicates the input. 

## Assessment

For **Proficiency** credit, your submissions for 1-8 must pass all test cases in Gradescope. Your submission for 9 must describe an accurate algorithm.

For **Mastery** credit, your submission must pass all test cases, and also have:

- Useful, informative variable names 
- Clear and consistent spacing/linebreaks

Your written submission must describe an accurate algorithm, and also must: 

- Be consistent in its language (e.g., not switching between pseudocode/Java/English)
- Include an example

[collab]: https://alackles.github.io/CMSC-150-WT-23/syllabus/#collaboration-and-plagiarism

## Questions


### Q1: `PrintOne.java`

Write a program which contains a method called `echo()` that takes a single string as an argument and directly prints the string. Call this method in main.

Example:
```
> Hello!
Hello!
```

### Q2: `PrintTwo.java`

Write a program which contains a method called `heard()` that takes a single string as an argument and _returns_ that same string. Call this method in main, but do not print the result.

Example:

```
> Hello!
```

_Note that this should print nothing._


### Q3: `ConvertDouble.java`

Write a program which contains a method called `intToDouble()` that takes an integer as an argument and returns the integer as a double with a single 0 after the decimal. Print the integer and double with `->` between them. 

Example:

```
> 7
7 -> 7.0
```

### Q4: `ConvertInt.java`

Write a program which contains a method called `doubleToInt()` that takes a double as an argument and returns the double as an integer. Print the double and integer with `->` between them.

Example:

```
> 8.4
8.4 -> 8
```

### Q5: `AreaVolume.java`

Write a program which calculates both the area of a circl eand  volume of a sphere with a given radius. 

The formula for area of a circle is:

$$ A = \pi r^2 $$

The formula for volume of a sphere is:

$$ V = \frac{4}{3} \pi r^3$$

It should then print them rounded to 3 decimal places, labeled as `Area:` and `Vol:`.

Use at least two methods other than `main`. One of the methods should call the other. 

Example:

```
> 4
Area: 50.265
Vol: 268.083
```

### Q6: `CourseName.java`

Rewrite your `CourseName.java` program from week 1 so that instead of having a set course name, the program takes a course name as input.

Example:

```
> CMSC510
This course is called CMSC510.
```

### Q7: `Eggs.java`

Rewrite your `Eggs.java` program from week 1 so that: 

1. Instead of having a set number of eggs, the program takes an integer as input, **and**
2. The conversion from number of eggs to number of dozens happens inside its own method, which takes one argument (the number of eggs) and _returns_ (not prints) the number of dozens. 

Example:
```
> 30
You have 30 eggs (2.5 dozen).
```

### Q8: `Convert.java`

Rewrite your `Convert.java` program from week 1 so that:

1. Instead of having a set number of glorps, the program takes a double as an input
2. Instead of having a set conversion rate, the program takes a double as an input (to account for possibly varying conversion rates)
3. The conversion happens inside its own method, which takes two arguments (the number of glorps and the conversion rate, and _returns_ (not directly prints) the number of murps. 

Example: 

```
> 25
> 0.5
12 murps
```

### Q9: Free Response Question

Write out an _algorithm_ for converting a number from binary to decimal. This algorithm does not have to be in Java or in pseudocode; it can be in plain english. It should have clear steps to follow and should work for any positive binary number. 