---
title: Week 2 Day 2 - void Methods
permalink: /lectures/w2-d2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week2).

# void Methods

The goal of today's class is to learn how to organize the things you've learned so far--printing output and receiving input, as well as doing some basic computations--into their own methods. 

**By the end of today's class, you should be able to answer the following questions:**
- How do you create a new method in Java? 
- What is a _parameter_?
- What is an _argument_?
- Why is it important to specify the type of a parameter? 
- What does it mean for a variable to be _local_ vs. _global_?

## In-Class Exercise

First, in your groups, complete the following in-class exercise using the `System.out.println()` and `Scanner()` techniques you learned last class. 

As before, choose someone to project who did not project last time, and they should do as little talking as possible. 

Write a program that takes two integers from the user and divides them, then displays the answer to two decimal places. It should also include some greeting text, prompts, and an ending message, each on their own line. Here is a sample of what the program should output. 

User input is also included for clarity. The only user input is "25" and "6". 

```
Hello! Welcome to the divider.
Enter first number:  25
Enter second number: 6
25/5 = 4.17
End.
```

## Questions from the Reading

## Lecture/Live-Code

We've so far looked at classes with a single method called `main()`. But you can write your own methods as well. 

> Note: Most programming languages will call these "functions". These two concepts are the same. Java calls them methods because everything is so explicitly tied to a class, and functions that are part of a class are called methods. So since everything is always in a class, all functions in Java are methods.

This is the example given in the book:

```java
public class NewLine {

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        System.out.println("First line.");
        threeLine();
        System.out.println("Second line.");
    }
```

Key things to note here are:
- There is no assignment needed when a method is called, just like there is no assignment needed with `System.out.println()` is called. It just does what is asked of it.
- A method can consist of nothing but calling other methods
- Methods are not executed when they are written; methods are executed when they are called

Q: What does this mean about _main()_? Why don't we have to call that method? 

### Parameters and Arguments

A **parameter** is a special name given to a variable that is defined in a method definition. In the method below, the parameter is _myString_.

```java
public static void excite(String myString) {
    System.out.println(myString + "!!!!!!");
}
```

Notice that we don't have to declare `String myString` in the body of the method, because it is declared _in the method definition_, type and all. 

You can give multiple parameters to a method and use them both.

```java
public static void dashes(String a, String b) {
    System.out.println(a + "-" + b);
}
```

```java
dashes("one","two") // would print "one-two"
```

An **argument** is the name given to what we actually pass in to the method when it is called (not defined). In the method call below, the argument is the string _"Hello"_. 

```java
excite("Hello");
```

As the book notes, you can pass in variables as arguments, too. 

```java
String h = "Hello";
excite(h);
```

Be careful, however, not to try to pass in the type as when you call the method. You only need to put the type when you declare the variable, which is in the definition, not the call. 

```java
excite(String h); // this is wrong
```

### Scope and Stack Diagrams

In addition to naming a group of related commands and making them easier to call, creating a new method actually creates a new _scope_, or basically a little world of its own. So the variables that exist in one method have no effect on the variables that exist inside another method. 

Consider the following example, modified from the book.

```java
public class PrintTime {

    public static void printTime(int hour, int minute) {
        int exampleInt = 0;
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
        System.out.println("printTime i: " + exampleInt);
    }

    public static void main(String[] args) {
        int exampleInt = 20;
        int hour = 11;
        int minute = 59;
        printTime(hour, minute);
        System.out.println("main i: " + exampleInt);
    }
}
```

Even though the variable `exampleInt` is declared in both printTime and main, they are two completely different variables, the same way that the variable `int hour` that is declared in the definition of printTime is different than the `int hour` declared in main. 

One way you can think of different methods is as boxes with little glass windows cut out. All the boxes for methods are in a larger box, the class. Different methods can look into each other, ask them to do something, and see the answer, but they cannot actually go in and change the things in the boxes, and they can't take things out of the boxes. They are self-contained worlds. 

Another way of looking at this is through a _stack diagram_, which is a drawing or visual representation of the variables and objects contained in your code. There are some handy tools to generate these that can be very useful for debugging your code. 

The one the book points to is [here](https://thinkjava.org/javatutor). 

## In-Class Exercise

Turn the divider from the beginning of class into its own method called `divider()`. Call that method in `main()` so that your program still works the same way it did before. Then, visualize your entire program with the stack diagram creator linked above.