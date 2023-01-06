---
title: Week 1 Day 2 - Variables and Operators
permalink: /lectures/w1-d2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---


# Variables and Operators

The goal of today's class is to learn how to create new variables in Java, how to change the value of variables once created, and what kinds of operations are and are not allowed between different types.

**By the end of the class, you should be able to answer the following:**
- What is a variable? How is it different from a value?
- How do you declare a variable in Java?
- How do you assign a variable in Java?
- What is the difference between an `int` and a `double`? 
- What is the difference in Java between `=` and `==`?
- What kinds of operations (`+`, `*`, etc) can be performed on numbers in Java? On strings? Between numbers and strings? 
 
## Questions from the Reading

These are questions or themes compiled from Perusall to help guide our discussion before jumping into course content.

### Style

> Various questions about reserved keywords; how will I know they're reserved? What if I use different capitalization? 

> Do I have to follow the capitalization conventions the book talks about? Will Java be mad at me if I don't?

### Declaration

> Does a variable have a value when it is first declared, if it is not also assigned? 

### Types

> Is there ever a reason you would use an int instead of a double? 

> Is there a maximum value for an integer? For a double? How are they represented inside the computer?

### Operators

> How do I check equality? What is the difference between the mathematical equals `=` and the programming equals `==`?

> Can I add strings together?

> What kinds of mathematical operations are allowed on strings vs. ints?

## Lecture/Live Code

### Variables & Types

We've been introduced to three basic variable types: _strings_, _integers_, and _doubles_ (or floating-point values).

**Strings** are basically words; information represented visually that we can interpret. 

**Integers** and **doubles** are both numbers, but **integers** can only be _whole_ numbers, while doubles can have decimal values.

As a refresher, here's some examples:

```java
String hello = "Hello!"; // a string
int x = 8;              // an integer
double x = 8.0;         // a double
```

Notice that variable names start with lowercase letters by convention, but not by necessity. 

Storing information in variables is a basic but powerful component of programming. Having a variable means that when you want to make changes throughout the program, you may only need to change a single piece of the program, instead of the whole thing. Here's an example:

Without variables:

```java
System.out.println("My name is Acacia Ackles.");
System.out.println("First name: Acacia");
System.out.println("Last name: Ackles"); 
```

With variables:

```java
String firstName = "Acacia";
String lastName = "Ackles";
System.out.println("My name is " + firstName + " " + lastName);
System.out.println("First name: " + firstName);
System.out.println("Last name: " + lastName); 
```

It is longer to start with, but easier to change if I want to. 

### Operators

Above, and in the reading, you got a little taste of some operators that are permitted in variables. Most of these are standard operators you are used to. 

For example, what will this print?

```java
int x = 7;
int y = 4;
double z = x + y;
```

What about this?

```java
int a = 9;
int b = 20;
a = 7;
int c = b * a
```

One thing to pay special attention to, however, is how **division** works between ints and floats. There is a difference between integer division and floating-point division.

Floating point division is what we are probably used to; 3/2 = 1.5. But integer division cuts off (NOT rounds) any non-integer parts of the answer. In integer division, 3/2 = 1. 

Here's an example:

```java
int a = 8;
int b = 3;
System.out.println(a/b);
```

What could we do if we wanted it to print an exact value instead?

### Stirng Operations

For the most part, mathematical operations do not work on strings. Addition "works", but it isn't adding the strings in the way we think of addition; it is _concatenating_ them. 

```java
String subj = "CMSC";
String code = "150";
System.out.println(subj + code);
```

Note that Java WILL allow you to add strings and ints, but it assumes that what you want out of it is a string. 

```java
String subj = "CMSC";
int code = 150;
System.out.println(subj + code);
```
## In-Class Exercise

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
