---
title: Week 6 Day 1 - Immutable Objects
permalink: /lectures/w6-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week6).

# Immutable Objects

The goal of today's class is to start thinking about _objects_ in Java. Java is an _object-oriented_ programming language, which means that the conceptual basis behind the language is to focus on the idea of self-contained objects which contain methods that you can use to interface with them. 

Here's a visual understanding of what that means:

![image of procedural vs object-oriented language. Both show an image of a black woman making a withdrawal from an ATM. The procedural language has arrows highlighted labeled 'withdraw, deposit, transfer'. The object-oriented language has the woman and the items highlighted labeled 'customer, money, account'](https://i.pinimg.com/736x/76/c0/df/76c0df8ee6d2a2d38237aa6e33a057c6--coding-procedural-programming.jpg)


**By the end of today's class, you should be able to answer the following questions:**
- What is the difference between a primitive type and an object?
- How do you create a new object in Java?
- What might be the purpose of wrapper classes vs primitives?
- What are some possible uses of the `null` string?

# Questions from the Reading

## What is an Object

> Is an array an object?

> How do objects differ from classes or methods, and are classes and methods objects?

## Wrappers vs Primitives

> Why have wrapper classes at all? Why not just have primitives? 

> Which types are primitive and which are objects? How will I know?

## Etc.

> How do I work with null? Why would I want a null value? 

# Lecture/Live-Code

## A Note on Organization

From now on, for future labs, your second exam, and for your final project, we will be organizing our code into chunks. Your _main_ method should contain very little code. It should primarily take input from the command line, call methods, and print to the command line. Any other features should be organized into appropriate methods which are either void or return a value. 

## Objects

_Primitive variables_ are the most basic kinds of values your computer can work with. They're stored in some small area of memory and are directly used and accessed; there's very little built in to them besides the ability to perform certain operations. 

On the other hand, _objects_ provide interfaces for you to work with these primitive types as well as other types. 

Objects and classes are not the same, and objects and methods are not the same. Objects are specific instances of a class or a method. 

Think of it like this: the version of CMSC 150 that you are sitting in right now, CMSC 150 Winter Term 2023, is the object. It has all kinds of specific attributes: we meet from 9:50 - 11:00, in Briggs 419, and the roster is all of you. 

The concept of CMSC 150, as a course you can take, is the class. Conceptually, it will have a meeting time, a meeting room, and a roster, but none of those things are set in stone or chosen. Once those things are chosen, that is a new instance of the class, and a new object.

Methods are just things we can do to any version of the class. We can set the meeting time; that's a method. We can change the room number; that's a method. And calling those methods might create a new object, but methods themselves aren't objects. 

## Wrapper Classes

Wrapper classes provide additional functionality and have a primitive type at their 'core'. 

```java
Double x = new Double.valueOf(2.4);
```

This is much longer than saying `double x = 2.4`, but we get some nice features with this wrapper class.

```java
String i = x.toString();
```

Here's an alternative way to write the same thing:

```java
String j = Double.toString(2.4)
```

Note the difference in having to provide an argument when you just call it on the abstract concept of a 'Double' vs. when you are calling it on a specific instance of Double. 

Here are the wrapper classes for the three most common data types we've been working with

Primitive | Wrapper Class
------ | ------ |
`int` | `Integer()`
`double` | `Double()`
`boolean` | `Boolean()`

Note that `String()` is already a wrapper class, not a primitive. **The only reason you can declare a new string without `new` is because this feature has been intentionally added** since strings are so common. 

## Finding a Max/Min Value

This pattern of programming is very common, so I want to introduce it here explicitly where your book does. 

```java
int max = Integer.MIN_VALUE;
for (String arg : args) {
    int value = Integer.parseInt(arg);
    if (value > max) {
        max = value;
    }
}
System.out.println("The max is " + max);
```

Note that we do a few things here:

1. Set the maximum value to a MINIMUM, so that we're guaranteed to find something larger than it or at least equal
2. Iterate through the array
3. Every time we find a value greater than the max, set the max to that new value

At the end, this will give us the maximal value in the array. 

# In-Class Exercise

The following is a Java program with all the functionality to it written in main.

```java
class Parens {

    public static void main(String[] args) {

        String s = "((3 + 7) * 2)";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }

        System.out.println(count);
    }
}
```
1. Encapsulate this fragment in a method that takes a string argument and returns the final value of count.
2. Test your method with multiple strings, including some that are balanced and some that are not. 
3. Take your string input from the command line **without using Scanner**. 
4. Come up with a way to generalize this code to check for balance of any kind of brackets. How could you do this without writing a ton of different if statements? 