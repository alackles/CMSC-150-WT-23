---
title: Week 2 Day 1 - Input/Output
permalink: /lectures/w3-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week3).

# If/Else Statements

The goal of today's class is to learn how to use `if` and `switch` statements to control program flow in Java. 

**By the end of today's class, you should be able to answer the following questions:**
- How do you choose between multiple cases in Java?
- What kinds of tokens can be passed to an if statement? 
- When might it be beneficial to use an if statement vs. a switch statement? 

## Questions from the Reading

These are questions or themes compiled from Perusall to help guide our discussion before jumping into course content.

> Why do we need an else statement if the code is just going to move on anyway when the if statement is false? 

> When might you need/want nested if statements instead of a series of if/else if/else statements? 

> What do they mean about braces being optional sometimes? Why don't if statements end with a semicolon? 

```java
if (x % 2 == 0) 
    System.out.println("x is even");
else
    System.out.println("x is odd");

```


## Lecture/Live-Code

We talked about if/else statements a little bit in lab when we were constructing logical operators. If/else statements are a fundamental part of program flow; they are what allow programs to respond differently based on different inputs. 

### If/Else

If statements evaluate if the thing inside the parentheses is true; if it is, then the part inside the braces is executed. 

```java
if (x % 2 == 0) {
    System.out.println("x is even");
} else {
    System.out.println("x is odd");
}
```

You can have more than just two conditions using `else if`. 

```java
if (x == 0) {
    System.out.println("x is zero");
} else if (x % 2 == 0) {
    System.out.println("x is even");
} else {
    System.out.println("x is odd");
}
```

**Question:** What would happen if we put the `x == 0` statement at the end? 

You can have more than one `else if` in an if clause. You also don't need the final `else`.

```java
userName = "Acacia"
password = "my_real_password"
if (userName == "Acacia" && password == "my_real_password") {
    System.out.println("Access granted.");
} else if (userName == "Acacia") {
    System.out.println("wrong password");
} else if (password == "my_real_password") {
    System.out.println("wrong username");
} else {
    System.out.println("Wrong password and username.");
}
```

```java
x = 20
if (x > 600) {
    System.out.println("Big number!");
} else if (x > 30) {
    system.out.println("Kinda big number.");
}
```
Again, make sure to pay attention to the order of your statements, or to make sure your cases don't overlap if you don't want them to. 

### Switch/Case

An alternative to if/else statements are switch/case statements. They are formatted like this:

```java
switch (x) { // x is some variable that can take on ANY kind of value, not just true/false
    case val1:
        // some code
        break;
    case val2:
        // some code
        break;
}
```

An example:

```java
courseCode = "MATH 230"
switch (courseCode) { // x is some variable that can take on ANY kind of value, not just true/false
    case "MATH 230":
        System.out.println("This is a math class.");
        break;
    case "CMSC 150":
        System.out.println("This is a CS class.");
        break;
}
```
The advantage over if statements is that you can easily chain together cases without using `or`. Compare the following, which do the same thing, but one is easier to maintain and expand upon.

```java
courseCode = "MATH 230"

// with switch
switch (courseCode) { 
    case "MATH 140":
    case "MATH 155":
    case "MATH 230":
        System.out.println("This is a math class.");
        break;
    case "CMSC 150":
    case "CMSC 250":
    case "CMSC 270":
    case "CMSC 510":
        System.out.println("This is a CS class.");
        break;
}

// with if

if (courseCode == "MATH 140" || courseCode == "MATH 155" || courseCode == "MATH 230") {
    System.out.println("This is a math class.");
} else if (courseCode == "CMSC 150" || courseCode == "CMSC 250" || courseCode == "CMSC 270" || courseCode == "CMSC 510") {
    System.out.println("This is a CS class.");
}
```

It is much more common to need and use if statements than switch statements, but it is good to know switch statements are there for you if you find yourself with multiple cases. As a general rule, if you find yourself doing a lot of `or` operators in an if statement, consider if it would make more sense to switch to a switch/case. 

## In-Class Exercise

Last class, we wrote a Java class to find the positive root of a polynomial. 

As a reminder, here is the quadratic formula with some additional information:

The quadratic formula is a simple way to find the roots of a polynomial function of the form

$$f(x) = ax^2 + bx + c$$

That is, if we set `f(x) = 0` and solve the equation for `x`, we get:

$$ x = \frac{-b \pm \sqrt{b^2-4ac}}{2a} $$

The part of the quadratic formula under the radical (square root sign) is called the _discriminant_. 

Modify your program now to do the following: 

- Make sure that it can take input from the user. 
- Prompt the user to state whether they want the additive root (the case with  `b + discriminant(a, b, c)`) or the subtractive root (the case with `b - discriminant(a, b, c)`). 
- If they want the additive root, return that value from your method `quadratic()`.
- If they want the subtractive root, return that value from your method `quadratic()`. 
- Print the values to 3 decimal places using `printf()`.

Here is an example input and output (you can prompt them with text for this one). 

```
a: 1
b: -2
c: -8
+ or -: +
Root is 2.000.
```