---
title: Week 9 Day 1 - Arrays of Objects Cont'd
permalink: /lectures/w9-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---
Today we will continue our discussion of different ways to use and extend classes by talking about arrays of objects and letting you create your own arrays of objects. 

# Lecture/Live-Code

Last class we built a `Card()` class with certain properties. 

We can now build an array of cards to represent a _deck_. We can do this the same way we create an array of any other kind of object:

```java
Card[] cards = new Card[52];
```

Each spot in the array is really a spot for a potential reference to a Card object. Right now each reference is `null`. 

We need to populate this deck. One way is to use nested `for()` loops:

```java
int index = 0;
for (int suit = 0; suit <=3; suit++) {
    for (int rank = 1; rank <= 3; rank++) {
        cards[index] = new Card(rank, suit);
        index++;
    }
}
```

**Think:** Why might we **not** want to do a triply-nested loop like this?

```java
// this won't do what we want it to do; how come?
for (int i = 0; i < cards.length; i++) {
    for (int suit = 0; suit <=3; suit++) {
        for (int rank = 1; rank <= 3; rank++) {
            cards[i] = new Card(rank, suit);
        }
    }
}
```

## Printing Arrays of Objects

There are a few ways to print an array of objects. We could write our own method:

```java
public static void printDeck(Card[] cards) {
    for (Card card : cards) {
        System.out.println(card);
    }
}
```

There is also a built-in method on the Array class that can help us.

```java
System.out.println(Arrays.toString(cards));
```

# In-Class Exercise

In your groups, complete part of exercise 12.3 from your book, written below. You can download or copy our implementation of the `Card()` class from last week [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week8/code/CardExample/src).

In Poker a “flush” is a hand that contains five or more cards of the same suit. For these purposes, hand can contain any number of cards.

1. Write a method called `suitHist()` that takes an array of `Card`s as a parameter and returns a histogram of the suits in the hand. Your solution should traverse the array only once, as in Section 7.7.
2. Write a method called `hasFlush()` that takes an array of `Card`s as a parameter and returns `true` if the hand contains a flush (and `false` otherwise).
3. A “royal flush” includes the Ace, King, Queen, Jack, and 10 (all in the same suit). Write a method called `hasRoyal()` that determines whether an array of `Card`s contains a royal flush.
