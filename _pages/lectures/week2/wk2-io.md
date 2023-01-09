---
title: Week 2 Day 1 - Input/Output
permalink: /lectures/w2-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---


# Input and Output

The goal of today's class is to learn how to handle user input and create output in Java. 

**By the end of today's class, you should be able to answer the following questions:**
- What is the difference (in simple terms) between a _class_ and a _method_ in Java?
- How do you read input from the user? How do you store that input into a variable? 
- How do you choose which type of input you are reading? What happens if the user enters a different kind of input? 

 
## In-Class Exercise - Refresher

At your tables, with your group members, complete Exercise 2.2 from the reading. Feel free to use your book or any notes (including the lecture notes) as a reference.

**Choose someone to project who did not project last time. The person projecting/typing should do as little talking as possible and instead just ask clarifying questions; everyone else should be the ones providing input.**

EXERCISE 2.2:

1. Create a new program named Date.java. Copy or type in something like the Hello World program and make sure you can compile and run it.
2. Following the example in Section 2.4, write a program that creates variables named `day`, `date`, `month`, and `year`. The variable day will contain the day of the week (like Friday), and date will contain the day of the month (like the 13th). Assign values to those variables that represent today’s date.
3. Display the value of each variable on a line by itself. This is an intermediate step that is useful for checking that everything is working so far. Compile and run your program before moving on.
4. Modify the program so that it displays the date in standard American format; for example: 
    
    `Thursday, July 18, 2019`
5. Modify the program so it also displays the date in European format. The final output should be as follows:

    `American format: Thursday, July 18, 2019`  
    `European format: Thursday 18 July 2019`

## Questions from the Reading

These are questions or themes compiled from Perusall to help guide our discussion before jumping into course content.

There are **a lot** of questions about Classes. Please know that **you don't need to understand what a class is in depth just yet**. For now it is sufficient to understand that a class is a collection of methods, all centered around the a similar purpose, and that you can use those methods by typing the class name followed by the method name. 

### Classes

> How do I know what is contained in a class? How are classes organized? 
 
> What is System.out? Is out a variable? A class? Something else? What is going on here?

> What is the difference between a class and a package?

### Program Organization

> Why are there programs inside other programs? 

> How do I make my own package, or my own class?

> What does it mean that most of the Java language is written in Java? How could you write a language in a different language??

### Imports

> What is an import? Why do we use it? Why doesn't the computer just know? 

> What is automatically imported? How is that chosen? 

## Lecture/Live-Code

### Types and Casting

Quick review of different data types in Java. So far we've worked with `int`, `double`, and `String`. 

When you **declare** a variable, its type cannot change. You can overwrite the previous variable, but you cannot change the type of the original variable.

```java
int x = 8;
double y = 0.3;
String z = "Hello";
```

You can change `x` into a different integer by just saying `x = 4`, but you cannot change it into a float by just saying `x = 2.3`. 

You can, however, cast a _value_ to a new type. So you can create a new variable out of an old variable that is of a new type. Here is how you would change the double `y` above into a new variable that is an integer.

```java
int k = (int)y
```

You can do the same thing with doubles:

```java
double j = (double)x
```

Strings are a little different and are confusing, as they use language elements we have not discussed. This is the technical way to change an integer or double into a string:

```java
String address = Integer.toString(123)
String balance = Double.toString(304.50)
```

Remember you can always simply add the number to a blank string, too.

And to change a string to an integer or double:

```java
int age = Integer.parseInt("48")
double gpa = Double.parseDouble("3.2")
```

The reason strings need these extra steps is strings are a little weird and harder to store than a simple integer or double, so they are harder to convert back and forth. 

### Classes: A Brief Overview

> We will talk about classes in **a lot** more depth as the course goes on. This chapter, and today's lecture, is mainly to give you a sense of how Java is structured so that some of the strange parts of it feel less like mysteries. 

![heirarchy of information in Java](/CMSC-150-WT-23/assets/img/wk2-javaelem.png)

You can think of a _class_ in Java as a collection of methods, or functions, all designed for a related task.

For example, in your homework, you're asked to make an _Eggs_ class to print the number of eggs and dozens of eggs that you have. 

The class is designed to hold some information about eggs. 

The class contains a single method, which both stores and prints the information you are interested in. 

A class can have many methods, but for right now, we are writing ones with only one method: the _main_ method, which does everything the class needs. It's kind of like we have a big storage closet, but only one box. 

### System Input with Scanner

We are familiar with `System.out`, which has a method called `println()` that allows us to print to the console. 

Remember that we can even use this to see what `System.out` itself is:

```java
System.out.println(System.out)
```

We can do a similar thing for the matching `System.in`

```java
System.out.println(System.in)
```

`System.in` itself is a "Buffered Input Stream", meaning it's a kind of variable capable of taking input from your keyboard and using it for Java code. This is pretty complicated under the hood, which means directly using `System.in` is not practical. We will instead use `Scanner`, which you can think of as a wrapper that has pre-written functions which let you do the kinds of things you would want to do with input. 

```java
import java.util.Scanner
```

```java
Scanner in = new Scanner(System.in);
```

A few things are happening here:
- `Scanner` declares the type of the new variable `in`
- `in` is the variable name. It could be literally anything. We could call it `cows` or `ahglkdhgkdhghkghkd`. But `in` is a useful, concise name for it.
- `new` is how we say we want to make a new _instance_ of the Scanner class. It is like saying, please give me something built off the Scanner template that is new and empty so that I can put in it whatever I want. 
- `Scanner(System.in)` is the value that we have set Scanner to. Just like `int x = 20` sets `x` to `20`, we have set `in` to `Scanner(System.in)`. Now we can access the methods by using the dot notation. 

Here's an example of how to use this:

```java
int age;
Scanner in = new Scanner(System.in);
System.out.print("How old are you?: ");
age = in.nextInt();
```

This saves whatever you type into the variable `age`.

**Q:** Why do we use `print()` here and not `println()`? Does it matter?

#### Helpful Scanner Functions

Here are some helpful Scanner methods you might want to use. Remember these are all part of Scanner, so to use them you would type `Scanner` and then the method with dot notation (e.g. `Scanner.nextInt()`).

| Method | Purpose |
| ----- | ----- |
| `nextInt()` | read integer |
| `nextDouble()` | read double |
| `nextLine()` | read string | 
| `next()` | reads one word at a time as strings (broken up on spaces) |

It's important to know that **you can't enter a double into the comand line if you are trying to read it with `nextInt()`; it won't cast it for you**. That's why it's important to know what your user is going to input. 

In future classes, we'll find out how to handle "incorrect" input. For now, just assume your users are perfect angels who never enter something they aren't supposed to.

## In-Class Exercise

In your groups, write a program that takes two numbers from the user and adds them together. Here is a sample of what the program should output. 

User input is also included for clarity. The only user input is "9" and "1020". 

```
Hello! Welcome to the adder.
Enter first number:  9
Enter second number: 1020
9 + 1020 = 1029
```