---
title: Week 4 Day 1 - Nested Loops
permalink: /lectures/w5-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week4).

# Nested Loops

The goal of today's class is to expand our understanding of loops 


**By the end of today's class, you should be able to answer the following questions:**
- How do you construct a nested loop in Java? 
- In what kinds of situations might you want to use a nested loop? 


## In-Class Exercise: Warm-Up

Consider the following methods (main and loop):

1. Draw a table that shows the value of the variables i and n during the execution of loop. The table should contain one column for each variable and one line for each iteration.
2. What is the output of this program? (Do not use your computer for this)
3. Can you prove that this loop terminates for any positive value of n? (By "prove" I mean just give your best argument.)

```java
public static void main(String[] args) {
    loop(10);
}

public static void loop(int n) {
    int i = n;
    while (i > 1) {
        System.out.println(i);
        if (i % 2 == 0) {
            i = i / 2;
        } else {
            i = i + 1;
        }
    }
}
```

## Questions from the Reading

## Lecture/Live-Code

You can do anything inside a loop that you can do outside a loop. This includes making a loop. 

### Nested Loop Basics

Here's the example from your book:

```java
for (int x = 1; x <= 10; x++) {
    for (int y = 1; y <= 10; y++) {
        System.out.printf("%4d", x * y);
    }
    System.out.println();
}
```

Something to note here is that this is printing _rows_, and then _columns_. This is not extremely clear as it's formatted. Let's take another look.

```java
for (int x = 1; x <= 10; x++) {
    for (int y = 1; y <= 10; y++) {
        System.out.printf("%(3dx%3dy)", x, y);
    }
    System.out.println();
}
```

So the inner loop executes first, then the outer loop. Let's look at it another way to see more of what's going on. 

```java
for (int x = 1; x <= 10; x++) {
    for (int y = 1; y <= x; y++) {
        System.out.printf("%4d", x*y);
    }
    System.out.println();
}
```

Why do we have fewer rows early on and more rows later? What is happening here? 

Loop variables _can be_ and often _are_ dependent on other loop variables. But note that they must be dependent on _outer_ loop variables, not variables further inside the loop. 

Note that this, in particular, does not work: 

```java
for (int x = 1; x <= y; x++) {
    for (int y = 1; y <= 10; y++) {
        System.out.printf("%4d", x*y);
    }
    System.out.println();
}
```

`int y` hasn't been declared yet, so `x <= y` in the outer loop makes no sense. 

If it helps, you can think of the inner loop as like a method that the outer loop is calling. 

```java
public static void inner_loop(int x) {
    for (int y = 1; y <= 10; y++) {
        System.out.printf("%4d", x*y);
    }
}

public static void main(String[] args) {
    for (int x = 1; x <= 10; y ++) {
        inner_loop(x);
        System.out.println();
    }
}
```

You should not do this in practice, because it makes your code a little unwieldy. But if it helps you to think about what is happening, you can think of it in this way. 

### Nested Loop Pitfalls

Here are some common nested loop pitfalls

#### Switching inner/outer

The inner loop will execute first. The outer loop will execute after the entire inner loop inishes executing. 


### Do I Need a Nested Loop?

Some clues you might be looking at a situation where you need or want a nested loop:

- You want to do something in _2 dimensions_; e.g., simulating a grid, rows and columns
- You want to do something in a large collection, and also want to do something that requires a loop to every element in that collection
- You are struggling to think of how to access every object or number that you want by using just one loop

## In-Class Exercise

Using nested loops, create the following pattern:

```java
----1
---22
--333
-4444
55555
```



