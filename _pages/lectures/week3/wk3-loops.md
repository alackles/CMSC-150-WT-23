---
title: Week 3 Day 2 - Loops
permalink: /lectures/w3-d2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week3).

# If/Else Statements

The goal of today's class is to learn how to use loops -- a fundamental part of creating complex programs that are more powerful than the ones we have created so far. Having loops allows us to do the same thing repeatedly to multiple pieces of data or information and to change or update our code systematically without needing new inputs.

**By the end of today's class, you should be able to answer the following questions:**
- How do you construct a while loop in Java?
- How do you construct a for loop in Java? 
- When might you want to use a while loop vs. a for loop? A for loop vs a while loop? 

## Questions from the Reading

These are questions or themes compiled from Perusall to help guide our discussion before jumping into course content.

> 


## Lecture/Live-Code

### While Loops

While loops look a lot like if statements. 

```java
i = 0
if (i <5 ) {
    System.out.println("hi");
}
System.out.println("End of if.");
```

```java
i = 0
while (i <5 ) {
    System.out.println("hi");
}
System.out.println("End of while.");
```

The difference is that a while loop will continue executing as long as the statement is true, while an if statement will only execute once. 

So to stop the while loop from infinitely executing, something has to happen inside the loop that might, possibly, change the statement to be false. 

```java
i = 0
while (i <5 ) {
    System.out.println("hi");
    i++;
}
System.out.println("End of while.");
```
Now, it prints out as long as the statement is true; once it becomes false, the loop stops and moves on. 

Remember that you don't have to print inside a loop. You can do anything.

```java
my_num = 0
while (i < 10) {
    my_num = my_num - i*2
}
```

This is fine; we just can't see the output unless we print it. 

You can use any of the structures we've used so far inside a while loop. Here's an example from the book of something you can do with this kind of structure, the collatz conjecture.

```java
// take in n from somewhere
while (n > 1) {
    System.out.print(n + " -> ")
    if (n % 2 == 0) {
        n = n / 2;
    } else {
        n = (n * 3) + 1
    }
}
System.out.println(1);
```

This is nice, because we don't know when the loop will end. We don't know how many times through the loop it will take for us to reach 1. But sometimes we do know when it will end, like in the simpler cases above. In this case it would be nice if we had a different way to do things.

### For Loops

Fortunately, that pattern is so common, as your book points out, that we do have a somewhat simpler way to do things.

```java
i = 0
while (i <5 ) {
    System.out.println("hi");
    i++;
}
System.out.println("End of while.");
```

```java
for (int i = 0; i < 5; i++) {
    System.out.println("hi");
}
System.out.println("End of for.");
```

Notice that all the same elements are still there, just moved around. In particular, notice that we don't have to worry about incrementing the i in the body of the loop; we increment it in the declaration of the loop instead


### Accumulator Design Pattern

A lot of the loops we write will look something like this:

```java
sum = 0 // initialize some variable outside the loop
for (int i = 0; i < 10; i ++) { // loop over a range
    sum += i; // add to the initialized variable inside the loop
}
System.out.println(sum);
```

This is so common that it has a name: the _accumulator design pattern_. It's not important that you remember that name exactly, just that you're familiar with the structure happening here. Something is initialized outside the loop; inside the loop, we do something to change that variable; at the end of the loop, the variable has the value that we wanted. 

### A Note on Loops

Loops are CONFUSING. They are a weird thing to wrap our heads around as human beings, but something that our computers seem to do easily. This can make it frustrating and confusing to try to learn how to work with loops. 

The best way to understand loops is to practice loops. The second best way to understand loops is to practice more loops. You will get there; it will 'click'. I promise! I've been there too. 

## In-Class Exercise

## Exercise 6.13.1

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

## Exercise 6.13.2

Let’s say you are given a number, a, and you want to find its square root. One way to do that is to start with a rough guess about the answer, x_0, and then improve the guess by using this formula:

$$ x_1 = \frac{x_0 + \frac{a}{x_0}}{2} $$


For example, if we want to find the square root of 9, and we start with x_0 = 6, then x_1 = (6 + 9/6) / 2 = 3.75, which is closer. We can repeat the procedure, using x_1 to calculate x_2, and so on. In this case, x_2 = 3.075 and x_3 = 3.00091. So the repetition converges quickly on the correct answer.

Write a method called `squareRoot` that takes a double `a` and returns an approximation of the square root of the parameter, using this technique. You should not use `Math.sqrt`.

As your initial guess, you should use `a/2`. Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001. You can use `Math.abs` to calculate the absolute value of the difference.