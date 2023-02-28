---
title: Lab 6 - Debug Challenge
permalink: /labs/lab6/
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

# Lab Assignment

The purpose of this lab is to give you practice debugging some code that someone else has written. In this case, as in a previous homework question, you will be debugging a version of the second exam problem. 

[Fork this GitHub repository]() and then clone it to your computer. Make any necessary changes to the code to allow it to fit the problem description and run as intended. Add, commit, and push your changes, then make a pull request on the original repository to submit your lab. 

## Problem Description

In many tabletop role playing games, the player rolls dice to determine the outcome of a certain action. These dice have different face values – some have 6 sides, some have 12, some have 20, etc. The sum of the dice is the result of the roll.

You will simulate rolling and summing a k-sided die n times. k and n should be taken in either from a scanner or as command-line arguments.

You should implement the dice as a class called `Dice` with an attribute `numFaces` to set the number of faces of the dice, and an instance method `roll()` to simulate a random dice roll (implementation is your choice). When a Dice object is printed using `System.out.print()`, it should display the letter “d” followed by the number of faces; for example, a 10-sided die when printed should display as `d10`. 

You can and should include other attributes and methods as you need them. 

The actual rolling and summing of dice should happen in a second program called `Roll.java`. In this program, you should create only one dice object which you can re-roll as many times as you need.

Your program, when run, should output the number of dice rolled and their number of faces, the resulting sum, and the individual rolls. Those rolls need not be in any particular order, but should all be printed on a single line.

Example Input (command-line args):

```
java Roll 7 4
```

Example Output:

```
7d4: 20 (3, 2, 2, 2, 3, 4, 4)
```

Note that this problem is not autograded, so you do not have to follow this print layout exactly.
