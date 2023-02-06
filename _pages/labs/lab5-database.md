---
title: Lab 5 - Designing a Database
permalink: /labs/lab5/
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

# Lab Assignment

The purpose of this lab is to give you practice with combining all the skills we've used so far to create a rudimentary database of information.

This lab comes in two parts. In Part I, you will design your own solution to the problem and upload it to GitHub. In Part II, you will download another team's solution, test it out, and make some small suggestions to enhance or generalize functionality. 

## Assessment

For proficiency credit:

- Your database should have all the requested functionality below
- Your review for your classmates should address the questions given in the problem statement

For mastery credit:

Everything for proficiency, plus:

- Your _main()_ method should have very little content; most of your content should be organized into their own encapsulated methods
- Your review for your classmates should provide some suggestions for extended functionality

# Lab Guide

## Part 0: Creating a GitHub Repository

We will do this part of the lab together. Basically, you will need to create a new GitHub repository and add everybody in your group as collaborators to the repository. If you need a refresher on how to do this, see the GitHub lab from last week. 

## Part I: Designing Your Database

Your job is to create a very simple "database" of people's names and their current bank account balance. What this means is that your program should be able to:

1. Allows the user to enter a name and an amount, and save that information somewhere
2. Allows the user to enter a name and display their current amount of money
3. Allows the user to enter a name and add some money to the account
4. Allows the user to enter a name and remove some money from the account

It is up to you and your group members how you want to accomplish these tasks. Here's some sample command-line input for what this could look like, with `>` representing input typed in by the user. 

```
Welcome. 
Please choose an option: [n]ew account, [d]isplay balance, [a]dd money, [w]ithdraw money, [q]uit:
> n
Enter a name and a starting balance, separated by a space
> Acacia 200
New account created for "Acacia" with starting balance of $200.00
Please choose an option: [n]ew account, [d]isplay balance, [a]dd money, [w]ithdraw money, [q]uit:
> d
Please enter the name to see the balance:
> Acacia
Balance for "Acacia" is $200.00
Please choose an option: [n]ew account, [d]isplay balance, [a]dd money, [w]ithdraw money, [q]uit:
> a
Please enter the name and amount to withdraw, separated by a space
> Acacia 100
Balance for "Acacia" is $100.00
```

This is just one possible option of many. 

## Part II: Reviewing Others' Databases

The second part of this lab is to play around with your classmates' databases. First _fork_ their repository to your own account. Then, _clone_ the repository and open it on your own computer. Finally, once you're done with the following steps, push the changes to your GitHub page and create a pull request. 

Do the following, and put the answers to your questions in the text of the pull request.

1. Test out adding a new entry; does it work as intended?
2. Test out displaying an entry; does it work as intended?
3. Test out adding money; does it work as intended?
4. Test out withdrawing money; does it work as intended?
5. Does the code appear _well organized_? Are there places the code could be organized better?

For mastery credit, also do the following:

6. What are some possible changes this team could make to their code to make it more general or better able to handle unexpected input? 

## Turn-In

Turn in a link to your github repository on Canvas under Lab 5. 