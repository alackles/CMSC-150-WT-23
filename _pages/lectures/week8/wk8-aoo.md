---
title: Week 8 Day 1 - Arrays of Objects
permalink: /lectures/w8-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week8/).

The purpose of today's class is to get more experience with constructing and working with classes. 

# Questions from the Reading

> Why did they implement 0 as "null"?

> Why do we need to write a toString() method? What happens if we do not? 

> What is "that.[name]"? What is "that" referring to? 

> What is "final"? What is "static"?

> How does binary search work? 


# Lecture/Live-Code

For today's class I'm going to implement the `Card` class from [the reading](https://greenteapress.com/thinkjava7/html/chapter-12.html) and discuss questions as they come up. If you miss class and have questions about the implementation of these structures, make sure to see me.

# In-Class Exercise

In your groups, complete exercise 12.3 from your book. You can download or copy our implementation of the `Card()` class from [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week8/CardExample/src).

In Poker a “flush” is a hand that contains five or more cards of the same suit. For these purposes, hand can contain any number of cards.

1. Write a method called `suitHist()` that takes an array of `Card`s as a parameter and returns a histogram of the suits in the hand. Your solution should traverse the array only once, as in Section 7.7.
2. Write a method called `hasFlush()` that takes an array of `Card`s as a parameter and returns `true` if the hand contains a flush (and `false` otherwise).
3. A “royal flush” includes the Ace, King, Queen, Jack, and 10 (all in the same suit). Write a method called `hasRoyal()` that determines whether an array of `Card`s contains a royal flush.