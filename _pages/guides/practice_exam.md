---
title: Practice Exam
permalink: /guides/exam1-prac/
toc: false
---

The idea of this practice exam is to give you a sense of the kind of problem you will be asked to solve for the exam. The amount of information and detail given below reflects the kind of information you will be given on the real exam. 

If you want to take this as a true practice exam, try the following:
- Set a timer for 70 minutes
- Only use VS Code and the Java documentation
- Work to the end of the timer, even if you get stuck, without consulting any outside resources

Doing this will allow you to understand where you might be stuck and what you need more practice with.

# Practice Exam

You are simulating the movement of a rocket ship from earth up to the moon. Let's say there are `n` "steps" from earth to the moon; it doesn't matter how large a step is. 

Every minute, the rocket moves forwards `x` steps. However, every third minute, the rocket needs to rest and recharge little, which means it drifts backwards `y` steps _instead of_ moving forwards. 

Your job is to create a program that, if given x, y, and n, will print out the _distance to the moon_ at each time step. When it reaches the moon, or would go past the moon, instead print "Moon landing!".

For example, let `n = 20`, `x = 5`, `y = 2` for the fllowing example:

```txt
Time 0: Distance to Moon = 20
Time 1: Distance to Moon = 15
Time 2: Distance to Moon = 10
Time 3: Distance to Moon = 12
Time 4: Distance to Moon = 7
Time 5: Distance to Moon = 2
Time 6: Distance to Moon = 4
Time 7: Moon landing!
```

Note: This problem is not autograded, so don't worry about following the print statements exactly. 

## Turn In

Turn this problem in on Gradescope under Practice Exam. 

## Assessment

### Mastery

- [ ] Program must produce the correct output for any valid positive integer values of n, x, and y. (Program does not need to handle impossible cases or negative numbers)
- [ ] Program must use at least one method besides `main()` 
- [ ] Clear and consistent variable names
- [ ] Clear and consistent spacing

### Proficiency

- 🔲 Program produces the correct output but is missing one of the other mastery requirements, **OR**
- 🔲 Program does not produce the correct output or is not complete, but you write up a short (3-4 sentence) explanation of where you got stuck and include a sample output for your code vs. what it should be outputting, **OR**
- 🔲 Program does not produce the correct output or is not complete, but you give a plain-English explanation of the algorithm you would write but cannot figure out how to write in Java


## Optional Extension

Instead of printing the time and distance to the moon, print a visual simulation simulation of the position of the rocket at each minute that looks something like this.

```
Er-------------------M
E-----r--------------M
E----------r---------M
E--------r-----------M
E-------------r------M
E------------------r-M
E----------------r---M
E-------------------rM
```