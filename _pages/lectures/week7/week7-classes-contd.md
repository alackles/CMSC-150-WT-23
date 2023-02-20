---
title: Week 7 Day 2 - Classes (Continued)
permalink: /lectures/w7-d2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week7/).

# Classes

Today we're mostly continuing our discussion of Classes from last lecture with methods you can use to _mutate_ and _override_ elements of your classes.

# Questions from the Reading

> What is an instance?

> What is a static method vs. an instance method? 

> Checking for equality vs. identity -- what does it mean that two things are equal vs. that they are the same? 
 
# Live-Code/Lecture

We're continuing our Date example from last class. This time, we'll add some methods to print, to check for equivalency, and to change the date. 

All of these are common operations you might want to do when you define a new class, and they're operations you expect or want other classes to have already. For example, when you print an integer, you're really printing the string version of that integer, not its location in memory or anything like that. This happens because it has been specifically implemented; since you're defining a new class, you have to be the one to specifically implement that kind of functionality now.

## "Overrides"

Overrides are functions you write that are similar enough to existing methods for other classes that you have a baseline idea of what they should do. That is, when you make a method `toString()` for a class, you know it should convert it to a String, but more than that you know it should convert it to a string that _would make sense to represent the object itself_. 

### toString()

For our Date class, that might look something like this: 

```java
public String toString() {
    return this.month + "/" this.day +  "/" this.year;
}
```

Or, it might look something like this:

```java
public String toString() {
    return String.format("%d/%d/%d", this.month, this.day, this.year);
}
```

Or, maybe this:

```java
public String toString() {
    // alt: "MM " + this.month + " DD " + this.day + " YYYY " + this.year;
    return String.format("MM %d DD %d YYYY %d", this.month, this.day, this.year);
}
```

But in any case, when we print the date now, the string returned from `toString()` will be what prints. 

### equals()

By default, `==` between two objects checks if they refer to the same object. But sometimes we want to check equality, not identity. 

We can create an equals method that returns a boolean which is true if they are equal, and we get to choose what equal means. 

```java
public boolean equals(Date other) {
    return this.month == other.month &&
            this.day == other.day &&
            this.year == otehr.year;
}
```

Why does this work even though we are only giving it a single argument? 

Here's how we call it:

```java
Date defaultDate = new Date();
Date unixZero = new Date(1, 1, 1970);
System.out.println(defaultDate == unixZero);
System.out.println(defaultDate.equals(unixZero));
```

## Mutators

Mutators are just methods that change something about the class when they're called. You could have mutators with or without parameters. Each of the following are mutators with different properties. 

```java
public void setZero() {
    this.month = 1;
    this.day = 1;
    this.year = 1970;
}

public void addYear() {
    this.year++;
}

public void jumpYears(int n) {
    this.year = this.year + n;
}

public int yearsBetween(Date other) {
    return Math.abs(this.year - other.year);
}

```

## In-Class Exercise

Write a `compareTo()` method for the `Date` class. It should take another Date object as a parameter and return a `-1` if the given date is _before_ the current date, and return a `1` if the given date is _after_ the current date. 

