---
title: Week 1 Day 1 - Algorithmic Thinking
permalink: /lectures/w1-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

# Algorithmic Thinking

The goal of today's class is to develop your understanding of what it means to think algorithmically, and how to break a problem down into a series of steps in plain language before we learn how to do so in Java.

**By the end of the class, you should be able to answer the following:**
- What does it mean to think "algorithmically"? 
- What is the difference between an algorithm and a method? Between a method and a program? 
- What is the difference between an _interpreted_ language and a _compiled_ language? What might the benefits be of each?
- When you write a Java program, what are the steps required to run that program on your computer? 

## Questions from the Reading

These are questions or themes compiled from Perusall and the pre-class survey to help guide our discussion before jumping into course content. 

> I've heard this class is a lot of work/I've heard it's very difficult? How much time should I be spending on this class? 

> The book said learning programming is going to be frustrating. Is there no way to avoid getting frustrated? How do I know when I'm too frustrated? What should I do when I'm stuck? 

> Is debugging all just trial and error? How do I get better at it? 

> What's up with the `public static void` thing? Why do we need that? What about `String[] args`? Actually what the heck is going on with this whole program? 

> How do comments work? Why do we use comments? What do we use comments for? 

> Do I have to re-compile my program every time I want to run it? 

> What is a virtual computer? How can a computer run inside a computer? 

## Algorithmic Thinking 

An algorithm is a series of steps which, when precisely followed, will produce some desired output.

Much of algorithmic thinking is about taking a problem from a vague, plain language idea of what you want to do and translating it into precise, mathematically formulated ideas. 

### Example

Suppose I said, "Write down all the numbers between 1 and 20 that are divisible by either 3 or 5."

How would you approach this problem? 


The first thing you'd probably do is start from 1, and see whether it's divisible by either 3 or 5. It's not, so you move on and don't write it down. 

What about 2? Same thing, so you don't write it down. 

What about 3? Now, this one is divisible by 3, so you write it down. 

Then you move on... etc, etc, until you reach 20.

One way of describing how you'd do this is to describe what you do at each and every of the 20 steps.

But you don't actually have to write out 20 steps; you aren't doing 20 different things. You are doing a small number of things, 20 times. So you might be able to more concisely describe your process by thinking about _what you are doing at each small step_, and whether there is any _repetition_ involved. 

### Possible Solution

Here's an example algorithm for the problem described above:

1. Start with the number 1.
2. Check if it is divisible by 3. If it is, write it down.
3. If it isn't divisible by 3, check if it is divisible by 5. If it is, write it down.
4. If it isn't divisible by either, don't write anything down.
5. Move on to the next number. 
6. Stop when you reach 20.


As a quick preview, here's (one way) that you would write that same algorithm in Java.

```java
for (int i = 1; i <= 20; i++) {
    if (i % 3 == 0 || i % 5 == 0) {
        System.out.println(i);
    }
}
```

_**CHECK:** Is this a complete Java program? If we paste this into a blank `.java` file and compile it with `javac`, will it run?_

What parts of our algorithm do you think map to parts of this Java code snippet? 

> **Note:** Like English, Java can be written in a variety of different ways so long as it follows some basic rules. Here's a second, perfectly valid way to write the exact same algorithm. 
> 
> ```java
> for (int num = 1; num < 21; ++num) 
>    {
>    if !(num % 3 && num % 5) 
>    {
>        System.out.println(num);
>    }
> }
>```
> These differences are why it's important to develop your understanding of algorithmic thinking as well as your understanding of programming, and why the two are not exactly alike.

## In-Class Exercise

_The following questions are adapted from [1][1]._

At your tables, on your whiteboards or on your computers projected onto your whiteboards, do the following. 

You are given the following sequence:

```
1, 1, 2, 3, 5, 8, 13, 21 ...
```

Develop an _algorithm_, or series of steps, which when precisely followed will generate the first 20 numbers in this sequence. It can be in plain English.

[1]: https://www.cs.jhu.edu/~jorgev/cs106/Creating_algorithms.pdf



