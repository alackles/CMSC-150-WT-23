---
title: Week 5 Day 2 - Arrays and References
permalink: /lectures/w5-d2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week5).

# Arrays and References

The goal of today's class is to start working with iteration over objects that are not just strings; in this case, we will be working with arrays. 

As part of that goal, we are going to have to work with _references_. References can feel confusing at first because we can't really see the way they're working except by interacting with them, but they are relatively straightforward on a conceptual level. We'll build that conceptual understanding in class today.

**By the end of today's class, you should be able to answer the following questions:**
- How do you create a new array in Java? 
- How do you create a new array in Java that also has pre-set elements?
- What can arrays contain?
- What is the difference between a _reference_ to an array and an array itself? 
- How do you iterate over an array? 
- How do you change the elements of an array? 

# In-Class Exercise Warm-Up

Complete Exercise 6.4 from your book:

A word is said to be "abecedarian" if the letters in the word appear in alphabetical order. For example, the following are English abecedarian words:

> abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy 

Write a method called `isAbecedarian` that takes a `String` and returns a `boolean` indicating whether the word is abecedarian. 

Then, take in a string from the user and check it with `isAbecedarian`. Remember to cast the user input to all the same case first!

# Questions from the Reading

> Can an array have multiple data types?

> Why use `int[] a = new int[4]` instead of `int[] a = {1, 2, 4, 5}`?

> How are references different from any other kind of variable? 

```java
public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}
```

# Lecture/Live-Code

## Creating an Array

Arrays are created like any other variable, except that we give the type a bracket `[]` so that it knows we are trying to create an array instead of a single value. 

```java
int[] myInts = {3, 4, 5, 2};
```

This works for any of the types we've used so far.

```java
String[] names = {"Acacia", "Kurt", "Joe"};
```

If you wanted to create an empty array, you do have to tell it what size you want the array to be. 

```java
int[] j = new int[20];
```

However, you can only do the `new` construction on separate lines, not the initialization. This is because the array needs to be told at some point how long it should be, and it just won't accept doing that on separate lines. 

```java
//String[] words; // this won't work!!
//words = {"Hello", "Goodbye"};

String[] courses;
courses = new String[10];
```

## References

References are one thing that is different between how we think of arrays and how we think of other values like integers and doubles. When we create a variable to store an integer, the variable directly pulls from some location in the memory whenever it is accessed. The variable and the integer it is talking about can be thought of as the same thing. 

When we create a variable to _reference_ an array, the variable is basically an "alternate name" for the array, and we are never actually talking to the array directly. So you can have multiple variables that reference the same place but are all talking about the same thing. It's like creating a nickname. 

The reasons this happens are myriad. One major reason is that arrays typically store more pieces of information than a single integer or a single double and so they need more space. If arrays are referenced instead of copied by default, we can save a lot of space if we don't actually need a copy. 

In class we'll talk about this and I'll draw some diagrams on the board. But it's important to understand what a reference is, because you will later encounter _pointers_, which are NOT the same thing. 

## Accessing and Looping over Arrays

Individual elements of arrays are accessed with square brackets.

```java
int[] a = {2, 4, 7};
int num = a[1];
System.out.println(num); // will print 4
```

You can loop over arrays with a standard for loop structure just like looping over strings.

```java
String[] depts = {"MATH", "STAT", "CMSC"};
for (int i = 0; i < 3; i++) {
    System.out.println(depts[i]);
}
```

You can also loop over an array with an enhanced loop structure, given in section 7.8 of your book, but I recommend using the standard loop for a while first to get used to it. We will do more with enhanced for loops in a few weeks. 

# In-Class Exercise

1. Write a method called `indexOfMax` that takes an array of integers and returns the index of the largest element.

2. Write a method named `areFactors` that takes an integer n and an array of integers, and returns true if the numbers in the array are all factors of n (which is to say that n is divisible by all of them).