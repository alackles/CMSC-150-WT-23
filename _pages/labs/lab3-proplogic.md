---
title: Lab 3 - Thinking like a Computer Scientist
permalink: /labs/lab3/
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

# Overview

The purpose of this lab is to get you familiar with some of the mathematics behind how computers operate, and the theory upon which computer science as a discipline is built. In this case, we will be looking at **propositional logic**. 

Propositional logic is part of formal mathematics. The reason we're learning about this in your intro to CS class is because a key part of computer science as a field of study will involve not just _writing_ programs, but _proving_ that your programs work, and understanding the _formal mathematics_ behind why those programs work. This is different than mathematics like calculus where you are manipulating numbers; instead, we are manipulating symbols and ideas. 

These concepts are central to MATH 270 (Discrete Math), CMSC 510 (Algorithm Analysis), and CMSC 515 (Theory of Computation). You may also see some of the things we're doing today regarding logic gates pop up in CMSC 435 (Computer Architecture). So if it doesn't make perfect sense today, that's okay; this is meant to be a first taste of something that will recur throughout learning more about Computer Science. 

Throughout the lab, you will see this symbol: ❓. This is a signal to stop and work on the question on your worksheet with your group. **You will turn in your answers to these questions on Gradescope under Lab 3.** You can submit images or files as the answers, so if you want, you can just take a picture of the answers.

## Assessment

For **Proficiency** credit, your answers should be clear (obvious what your final answer is) and correct.

For **Mastery** credit, your answers should **show your work**. That is, it should not just be an answer; you should have some written work showing intermediate steps you and/or your group mates took to get to the answer.

# Lab


Last week, we looked at **logic gates** and **boolean operators**. As a quick refresher, boolean operators take the values TRUE and FALSE and combine them into a new boolean value. 

This may feel pretty mathematical and theoretical. We'll watch this video for some background on why this is something we're bothering with in a computer science class.

<iframe width="560" height="315" src="https://www.youtube.com/embed/sTu3LwpF6XI" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>

Notice that talking about these operators can get a little bit messy because "and", "or", and "not" are also regular English words. 

Mathematics has already come up with some notation for this.

| Name | Mathematics | What it Does |
| ---- | ----  | ---- |
| AND | ∧ | Returns 'True' if both sides are True |
| OR | ∨  | Returns 'True' if either side is True | 
| NOT | ¬ | Returns opposite |


As a refresher, remember that we had multiple ways to represent what these operators do. 

## Definition of an Operator

We could list out all the possible combinations one at a time:

**and:**

TRUE ∧ TRUE = TRUE  
TRUE ∧ FALSE = FALSE  
FALSE ∧ TRUE = FALSE  
FALSE ∧ FALSE = FALSE  

We could also create a table that conveys the same information as above, but is written in a more compact way and uses variables for true and false.

| x | y | **x ∧ y** |
| ----- | ----- | ------ |
| T | T | **T** |
| T | F | **F** |
| F | T | **F** |
| F | F | **F** | 

The two options above are the _definition_ of the AND operator. We have decided that saying "x ∧ y" will be equal to True if both are True, and False otherwise.

We can turn this definition into a _method definition_ in Java, too with `if` statements. We'll talk about `if` statements in more depth tomorrow, but basically they look like this:

```java
if (expression) {
    // some code
}
```

If the part inside the parentheses evaluates to True, then the part inside the brackets will execute. If it is False, the part inside the brackets will do nothing.

So consider the following:

```java
public static boolean and(boolean x, boolean y) {
    if (x) {
        if (y) {
            return True
        }
    }
    return False
}
```

So, if `x` is True, then we go inside the first set of brackets. In there, if y is True, we can return True.

If either case is false, then the "return True" statement will be skipped, and we'll reach the end of the method, where we will return False. 

Try this out on your own computer if you like.


❓ Complete questions 1 and 2 on your worksheet. 

## Notation for an Operator

This operation is common enough that in Java, this method is implemented as a symbol you can use like addition and subtraction. 

You can get the result of x ∧ y in java as follows:

```java
x && y
```

The double & symbol tells Java to evaluate the things on either side of it as booleans. `True && False` will evaluate to False, just like `7 + 4` will evaluate to 11. 

Here are the other operators in Java.

| Name | Mathematics | Java | What it Does |
| ---- | ---- | ---- | ---- |
| AND | ∧ | `&&` | Returns 'True' if both sides are True |
| OR | ∨ | `\|\|` | Returns 'True' if either side is True | 
| NOT | ¬ | `!` | Returns opposite |


## The IMPLIES and IFF Operators

In addition to `&&`, `||`, and `!`, there are two more mathematical logical operators that do not have a direct connection to logical operators in computer science. 

We're still going to learn about them, because they are an important part of thinking rigorously about mathematical statements.  


### IMPLIES

The "IMPLIES" operator, unlike the other operators we've seen so far, is _directional_; what comes first matters. 

| x | y | **x⇒y** |
| ----- | ----- | ------ |
| T | T | **T** |
| T | F | **F** |
| F | T | **T** |
| F | F | **T** | 

Notice that `T ⇒ F` is the only combination that evaluates to False. This may seem confusing; how can False imply True? 

There are two ways to think of it:

One is that this is simply the definition. There is no more meaning to 'why' `F ⇒ T = T` than there is to `1 + 2 = 3`; those are just the conventions we've chosen for what `⇒` means. 

The second way is to imagine a statement like, "if it rains tomorrow, I'm going to take my umbrella with me." If it doesn't rain, you have technically fulfilled the statement regardless of whether you take your umbrella or not. That's why if the first part is false, it doesn't matter what the rest is. 

For now, just know that `⇒` is another logical operator you can work with, just like `∧`; it just doesn't have a direct implementation in Java. 

❓ Complete Question 3 on your worksheet.

### IFF

Finally, there is the mathematical operator "IFF", or if-and-only-if. If both sides are true, the entire operation is true. 

| x | y | **x⇔y** |
| ----- | ----- | ------ |
| T | T | **T** |
| T | F | **F** |
| F | T | **F** |
| F | F | **T** | 

Effectively, this is checking for both sides to be the same. 

Note that in mathematics, we're usually trying to show that _if_ one side is true, _then_ the other side is true. 

❓ Complete Questions 4 and 5 on your worksheet.


## Propositional Logic

The five operators above help us construct what is called _propositional logic_; basic statements of truth built up from smaller statements. 

This kind of propositional logic is part of the underlying structure of your computer. It is also an important piece of mathematical understanding that will come back to haunt you later in your CS curriculum!

As a class, we're going to watch the following video; afterwards, you and your group will write a question for the last part of your worksheet. 


<iframe width="560" height="315" src="https://www.youtube.com/embed/wvJc9CZcvBc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>


# Notation Reference Table

Here is a reference table for some of the notation we'll talk about throughout the lab. 

| Name | Mathematics | Java | What it Does |
| ---- | ---- | ---- | ---- |
| AND | ∧ | `&&` | Returns 'True' if both sides are True |
| OR | ∨ | `||` | Returns 'True' if either side is True | 
| NOT | ¬ | `!` | Returns opposite |