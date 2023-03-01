---
title: Week 9 Day 2 - Objects of Arrays
permalink: /lectures/w9-d2
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Today we're talking about our final mandatory topic for the course, _objects of arrays_. This is essentially just an extension of our discussion up to this point on classes; we can make objects that are represented by arrays, just like we can make arrays that hold objects. Making these two ideas distinct in your mind can be helpful for understanding program design. 

First, let's refresh ourselves on working with _arrays of objects_ using the `Card()` class we have been looking at. 

# In-Class Exercise

In your groups, complete part of exercise 12.3 from your book, written below. You can download or copy our implementation of the `Card()` class from last week [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week8/code/CardExample/src).

In Poker a “flush” is a hand that contains five or more cards of the same suit. For these purposes, hand can contain any number of cards.

1. Write a method called `suitHist()` that takes an array of `Card`s as a parameter and returns a histogram of the suits in the hand. Your solution should traverse the array only once, as in Section 7.7.
2. Write a method called `hasFlush()` that takes an array of `Card`s as a parameter and returns `true` if the hand contains a flush (and `false` otherwise).
3. A “royal flush” includes the Ace, King, Queen, Jack, and 10 (all in the same suit). Write a method called `hasRoyal()` that determines whether an array of `Card`s contains a royal flush.

# Lecture/Live-Code

We can construct classes that use other classes we have written if we want to represent a collection of objects in some way. 

For example, we could create a `Deck()` of cards. 

```java
public class Deck {
    private Card[] cards;

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank ++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public Deck(int n) {
        this.cards = new Card[n];
    }

    public Card[] getCards() {
        return this.cards;
    }
}
```

What might be some of the advantages here over creating an array in a place like CardDeckClient?

One advantage might be that we can create methods that are usually used on decks and then keep them in the Deck class. We can write code once, and then use it over and over again. 

For example, here is a `shuffle()` method we might use. 

```java
public void shuffle() {
    for (int i = 0; i < this.cards.length; i++) {
        int swapIndex = rand.nextInt(this.cards.length);
        Card tempCard = this.cards[i];
        this.cards[i] = this.cards[swapIndex];
        this.cards[swapIndex] = tempCard;
    }
}
```

We can also encapsulate these methods into other methods as well as shown on page 220 of the book; in this case, think of the advantages and disadvantages of each approach. 

