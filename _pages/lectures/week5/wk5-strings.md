---
title: Week 4 Day 1 - Nested Loops
permalink: /lectures/w5-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week5).

# Nested Loops

The goal of today's class is to start working with iteration _over_ some objects: in this case, iteration over strings. The other goal is to get used to working with strings themselves.

**By the end of today's class, you should be able to answer the following questions:**
- How do you perform string operations like reversing a string, finding the index of a character in a string, manipulating a string from lower to upper case, etc?
- How do you perform string comparisons, like checking if something is equal or greater? 

# In-Class Exercise: Warm-Up

Create the following pattern using nested loops:

*
* - 
* - *
* - * -
* - * - *
* - * - * -

# Lecture/Live-Code

## Characters

Characters are the individual pieces that make up a string. They are a different type than strings; you create them like this:

```java
char myChar = 'a'
```

Note the single quotes. This is how you differentiate between a character and a string that is one character long. 

Under the hood, chars are basically representations of individual values, just like integers are. For this reason, you can cast ints to chars as long as they have a [unicode representation](https://unicodelookup.com/).

```java
char myChar = (int)67
```

This means that you can also use incrementation on chars:

```java
for (char c = 'a'; c < 'z'; c++) {
    System.out.println(c);
}
```

While this is nice, usually this isn't how we represent characters. In common day-to-day life, it's rare to want to represent characters all by themselves. However, it's very common to represent data with strings, so it's nice to know how to work with those. 

## Finding Characters in Strings

There are two complementary methods you might be interested in: `charAt()` and `indexOf()`

`charAt()` gives you a CHARACTER when you give it an INDEX.

`indexOf()` gives you an INDEX when you give it a CHARACTER (or a substring).

Examples:

```java
String h = "Hello!"
char c = h.charAt(5); // returns '!'
int i = h.indexOf("e"); // returns 1
```

## Finding Strings in Strings

You can also use the method `substring()`, which you can also think of as complimentary to `indexOf()`.

```java
String sentence = "How are you today?"
String word = sentence.substring(0,4); // returns "How"
String word = sentence.substring(7); // returns " you today?"
int i = sentence.indexOf("you"); //returns 8
```

## String Iteration

You can find the length of a string with `.length()`:

```java
len = "Hello, world".length();
System.out.println(len);
```

A common use case for this is to iterate over every character in a string.

```java
for (int i = 0; i < fruit.length(); i++) {
    char letter = fruit.charAt(i);
    System.out.println(i + " : " + letter);
}
```

Before running this code, think about what it should print. 

The book provides an example of a string reversal algorithm:

```java
public static String reverse(String s) {
    String r = "";
    for (int i = s.length() - 1; i>=0; i--) {
        r += s.charAt(i);
    }
    return r;
}
```

As a quick exercise at your table, rewrite this loop so that we increment i instead of decrement, but the functionality remains the same. 

## String Comparison

To check if two strings are equal:

```java
String s = "hello"
String x = "hello"
boolean equal = x.equals(s)
```

To check the alphabetical order of two strings:

```java
String a = "apples"
String b = "bananas"
int diff = a.compareTo(b);
```

## Input Manipulation

One thing that is frequently frustrating is when you want to take some input from the user in the form of a string, but you don't want to have to check all possible cases. For example:

```java
Scanner in = new Scanner(System.in);
System.out.println("Say hello!");
String userGreeting = in.nextLine();
String myGreeting = "hello"
if (myGreeting.equals(userGreeting)) {
    System.out.println("Thanks!");
}
```

This won't work if the user types "Hello", "HELLO", "hELLO", or any other form of capitalization. 

To get around this a little bit, one thing you can do is force the user input to be in a certain form before evaluation. 

```java
Scanner in = new Scanner(System.in);
System.out.println("Say hello!");
String userGreeting = in.nextLine();
String myGreeting = "hello"
if (myGreeting.equals(userGreeting.toLowerCase())) {
    System.out.println("Thanks!");
}
```

Let's break this up a little bit more to see what's going on:

```java
Scanner in = new Scanner(System.in);
System.out.println("Say hello!");
String userGreeting = in.nextLine();
String userGreetingLower = userGreeting.toLowerCase();
System.out.println(userGreetingLower);
String myGreeting = "hello"
if (myGreeting.equals(userGreetingLower)) {
    System.out.println("Thanks!");
}
```

This way, we don't have to worry quite so much about exactly what the user inputs.

# In-Class Exercises

Complete Exercise 6.4 from your book:

A word is said to be "abecedarian" if the letters in the word appear in alphabetical order. For example, the following are English abecedarian words:

> abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, deinos, diluvy, dimpsy 

Write a method called `isAbecedarian` that takes a `String` and returns a `boolean` indicating whether the word is abecedarian. 

Then, take in a string from the user and check it with `isAbecedarian`. Remember to cast the user input to all the same case first!

