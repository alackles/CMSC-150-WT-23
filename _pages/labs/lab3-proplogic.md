---
title: Lab 3 - Thinking like a Computer Scientist
permalink: /labs/lab3/
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

# Overview

The purpose of this lab is to get you familiar with some of the mathematics behind how computers operate, and the theory upon which computer science as a discipline is built. In this case, we will be looking at **propositional logic**. 

Throughout the lab, you will see this symbol: ❓. This is a signal to stop and work on the question on your worksheet with your group. **You will turn in your answers to these questions on Gradescope under Lab 3.** You can submit images or files as the answers, so if you want, you can just take a picture of the answers.

## Assessment

For **Proficiency** credit, your answers should be clear (obvious what your final answer is) and correct.

For **Mastery** credit, your answers should **show your work**. That is, it should not just be an answer; you should have some written work showing intermediate steps you and/or your group mates took to get to the answer.

# Lab


Last week, we looked at **logic gates** and **boolean operators**. As a quick refresher, boolean operators take the values TRUE and FALSE and combine them into a new boolean value. 

As a refresher, remember that we had multiple ways to represent these operators and what they do. 

## Definition of an Operator

We could list out all the possible combinations one at a time:

**and:**

TRUE and TRUE = TRUE  
TRUE and FALSE = FALSE  
FALSE and TRUE = FALSE  
FALSE and FALSE = FALSE  

We could also create a table that conveys the same information as above, but is written in a more compact way and uses variables for true and false.

| x | y | **x AND y** |
| ----- | ----- | ------ |
| T | T | **T** |
| T | F | **F** |
| F | T | **F** |
| F | F | **F** | 

The two options above are the _definition_ of the AND operator. We have decided that saying "x AND y" will be equal to True if both are True, and False otherwise. 

## Notation for an Operator

Notice that talking about the "AND" operator can get a little bit messy because "and" is also a regular English word. We could choose some notation for how to write the operator "AND" differently from the English "and"; for example, in this paragraph, I'm using all caps for the operator. 

Mathematics has already come up with some notation for this; in mathematics we use what looks like an upside down V. It looks like this:

$$ x \land y $$

This is very helpful for when we're writing mathematics by hand, but this isn't a common key on the keyboard (^ is slightly different). 

So in computer science, and particularly in Java, the and operator is represented differently:

```java
x && y
```

The double & symbol tells Java to evaluate the things on either side of it as booleans. `True && False` will evaluate to False, just like `7 + 4` will evaluate to 11. 

Here's the operators we've learned so far (a full table is at the bottom).

| Name | Mathematics | Java | What it Does |
| ---- | ---- | ---- | ---- |
| AND | ∧ | `&&` | Returns 'True' if both sides are True |
| OR | ∨ | `\|\|` | Returns 'True' if either side is True | 
| NOT | ¬ | `!` | Returns opposite |

❓ Complete questions 1 and 2 on your worksheet. 

## The IF-THEN and IFF Operators

In addition to `&&`, `||`, and `!`, there are two more mathematical logical operators that do not have a direct connection to logical operators in computer science. 

We're still going to learn about them, because they are an important part of thinking rigorously about statements, and they will help provide a scaffold for the `if` statements we will write later this week. 


### IF-THEN

IF-THEN is represented by a rightward arrow in mathematics: →. It is often read as "implies".

Unlike the operators we have learned about so far; the order matters: x → y is not the same as y → x.  However, don't get confused: just like `&&`, the combination of the two sides is what is important. 

Here is the definition of →.

| x | y | **x → y** |
| ----- | ----- | ------ |
| T | T | **T** |
| T | F | **F** |
| F | T | **T** |
| F | F | **T** | 

This might seem kind of confusing. How can F → T be True? Let's think about it computationally using an `if` statement.

```java
if (x) {
    // the part in between the braces is "y"
}
```

Here's a simple example:

```java
if (1 == 1) {
    System.out.println("hello");
}
```

Output:
```
hello
```

Here, the part inside the braces will be evaluated if `x` is True. Remember though that the implies operator needs two different statements: `x` and `y`. 

In this case, think of the truth value of `y` as answering the question "does the behavior of the code change based on what is inside these brackets?"

Think of the truth value of `→` as answering the question "does the operation reach the end of the braces without changing anything about the code?" 

So the entire _operation_ is what is either 'True' or 'False'.

Now it's easier to see why `F → T` and `F → F` both evaluate to True; because if `x` is False, then nothing in the braces is evaluated, so by default, the operation will reach the end of the braces without changing anything about the code.

Here's an example of `T → T` in Java. 

```java
if (2 == 2) {
    // an empty statement; nothing would change
}
```

Here's an example of `T → F` in Java. 

```java
if (2 == 2) {
    x = 7;
}
```

Here's an example of `F → T` in Java. 

```java
if (2 == 3) {
    // empty; nothing would change
}
```

Here's an example of `F → F` in Java. 

```java
if (2 == 3) {
    x = 7;
}
```

You can think of the operators like this:

Mathematically, if the lefthand side is **True**, then the truth of the statement depends upon the righthand side. If the lefthand side is **False**, then the statement is automaticlaly true. 

Computationally, if the part inside the parentheses is **True**, then the behavior of the code depends on what is inside the brackets If the part inside the parentheses is **False**, then the behavior of the code is _unrelated_ to whatever is inside the brackets.

❓ Complete Questions 3 and 4 on your worksheet.

### IFF

Finally, there is the mathematical operator "IFF", or if-and-only-if. In computer science this works basically like `==`; if both sides are true, the entire operation is true. 

| x | y | **x ⇔y** |
| ----- | ----- | ------ |
| T | T | **T** |
| T | F | **F** |
| F | T | **F** |
| F | F | **T** | 

Note that in mathematics, we're usually trying to show that _if_ one side is true, _then_ the other side is true. 

❓ Complete Question 5 on your worksheet.


## Propositional Logic

The five operators above help us construct what is called _propositional logic_; basic statements of truth built up from smaller statements. 

This kind of propositional logic is part of the underlying structure of your computer. It is also an important piece of mathematical understanding that will come back to haunt you later in your CS curriculum!

As a class, we're going to watch the following two videos; afterwards, you and your group will write a question for the last part of your worksheet. 

<iframe width="560" height="315" src="https://www.youtube.com/embed/sTu3LwpF6XI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

<iframe width="560" height="315" src="https://www.youtube.com/embed/wvJc9CZcvBc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>




# Notation Reference Table

Here is a reference table for some of the notation we'll talk about throughout the lab. 

| Name | Mathematics | Java | What it Does |
| ---- | ---- | ---- | ---- |
| AND | ∧ | `&&` | Returns 'True' if both sides are True |
| OR | ∨ | `||` | Returns 'True' if either side is True | 
| NOT | ¬ | `!` | Returns opposite |
| IF-THEN | → | `if () {}` | See below |
| IF AND ONLY IF (IFF) | ⇔ | `==` | See below | 

IF-THEN and IFF don't have as direct connections in computer science as they do in propositional mathematical logic. For our purposes, you can think of IF-THEN as similar to an `if` statement, and `IFF` as similar to `==`, but they are _not_ the same like AND, OR, and NOT. 