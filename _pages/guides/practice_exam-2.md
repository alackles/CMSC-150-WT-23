---
title: Practice Exam
permalink: /guides/exam2-prac/
toc: false
---

The idea of this practice exam is to give you a sense of the kind of problem you will be asked to solve for the exam. The amount of information and detail given below reflects the kind of information you will be given on the real exam. 

If you want to take this as a true practice exam, try the following:
- Set a timer for 70 minutes
- Only use VS Code and the Java documentation
- Work to the end of the timer, even if you get stuck, without consulting any outside resources

Doing this will allow you to understand where you might be stuck and what you need more practice with.

# Practice Exam

Create a program called `FlipCoin.java` that takes two **command line arguments**, _n_ and _m_. The program should flip _n_ coins, print the result, and display a `"You win!"` message if the user got at least _m_ heads. 

To support your `FlipCoin.java` program, you should have a separate `Coin` class which implements the coin flip as a class method. 

Here is an example:

Program call:

```
java FlipCoin 10 4
```

Output:

```
HHTHTTTHTT
You win!
```

Alternate output:

```
TTTTTTTHTH
Try again.
```

Note: This problem is not autograded, so don't worry about following the print statements exactly. 

## Turn In

Turn this problem in on Gradescope under Practice Exam. 

## Assessment

### Mastery

- [ ] `Coin` class is implemented separately from `FlipCoin.java` program.
- [ ] `flip()` is implemented as a class method, not a method in `FlipCoin.java`
- [ ] A `Coin` object can be directly printed (e.g. `System.out.println(myCoin)` outputs either `H` or `T`).
- [ ] Arguments are handled via command line arguments
- [ ] Program produces the correct output for valid integer inputs
- [ ] Program has consistent style, spacing, and is well organized throughout

### Proficiency

- [ ] Program produces the correct output but is missing one of the other mastery requirements, **OR**
- [ ] Program does not produce the correct output or is not complete, but you write up a short (3-4 sentence) explanation of where you got stuck and include a sample output for your code vs. what it should be outputting, **OR**
- [ ] Program does not produce the correct output or is not complete, but you give a plain-English explanation of the algorithm you would write but cannot figure out how to write in Java

