---
title: Final Project
permalink: /final-project/
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

## Overview

Your final project for this course is either a game or visualization that shows off what you've learned over the entire semester. It will be scored against the course learning objectives, as with our other assignments.
## Due Dates 

| Date | Milestone |
| ----- | ------ |
| 2/20 | Proposal Due |
| 3/3 | Rough Draft Due |
| 3/7 | Peer Feedback Due |
| 3/12 | Last due date for feedback on project |
| 3/15 by 5:30 PM | Final Draft & Reflection Due | 

At any point between these deadlines please feel free to come see me to get additional feedback on your final project, so long as it is before the final feedback date (3/12).
## Guidelines

The final project is meant to be a culmination of _all_ of the skills you have learned in this course, so that in the future you can quickly and easily demonstrate the skills you have mastered by presenting this project. Therefore, your project should contain all of the following:

- **L1: Algorithmic Thinking & Basics**: Your program should contain:
   - Conditional statements and loops
   - Functions you have written yourself
   - Classes and objects instantiated from those classes 
- **L2: Debugging**: Your program should be free of errors, and should handle user-input errors gracefully (e.g. with a message).
- **L4: Style**: Your program should be well-commented and use organized functions. 
- **L5: Code Review**: You will be asked to give peer feedback to your classmates' projects; you should complete this peer feedback for credit. 
- **L6: Collaboration**: Your project should be uploaded to GitHub, where you should be able to see changes between the draft and final version.
- **L7: Reading**: You should have a `.README` file in your repository that explains what your project does and how you created it.
- **L8: Reflection**: You will be asked to submit a final reflection with your project. 

If you hit all of these points, you'll be given full mastery credit. 5-7 will be given Proficiency, and less than 5 will be given Novice. 

One example of how to structure such a project is given [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week7/FightGame/).

## Types of Projects

You have two choices for what kind of final project you'd like to create. 
### Option 1: Game

The first type of project is a computer game. Your game should incorporate some level of actual AI decision making. By this, I mean that the computer should play against you or manage your game in a moderately intelligent way. The computer doesn't have to be that good at it, really! But you should make a concerted effort on this front, meaning that your AI will go above and beyond a simple random strategy. 

Your game can include a true graphic interface, or it can be a terminal-based ASCII program, but should include some degree of feedback for the user. 

Remember that your time is limited, so pick a game that you will be able to implement between now and the end of the term.

### Option 2: Data Interaction

The second type of project is some type of interactive database or data visualization. By "interactive", I really just mean that the user can choose what kind of data should be displayed. It is up to you how to display this data and what kind of data you want to work with, with the caveat that your data should be from some publicly available source. 

We do not cover visualization methods in great depth in this class, so you may have to do some outside work to find your preferred method of visualization. Instead of visualization, you can also create an interactive database as below in the examples. I'm happy to discuss some options with you!

## Proposal and Draft

I will require that you turn in a project proposal and a project draft. The proposal will only go to me; the draft will go to your peers.

### Specifications: Proposal

The project proposal is a simple, ~100 word explanation of what you hope to accomplish for your final project. It should include, at a minimum:

- What game or visualization you intend to make
- What you hope the project will be able to do
- What external packages or data you think you'll need to complete this project (does not have to be exhaustive)
- What uncertainties you have about the project 

Below is an example: 

> For my project, I am going to create a "hot or cold" style game where people will have 10 chances to guess a US state. They will first put in a state name as a guess. Then if they are wrong the program will tell them if they are "Freezing", "Cold", "Warm", or "Hot". When they're right the program will say "Congratulations!" and print out a picture of the state. For this project I don't think I'll need any external packages but I will need some pictures or ASCII templates of the states. I also need some way to tell how far their guess is from the state that is the right answer so I can figure out whether it's hot or cold. I need some help figuring out how to measure that distance.

**I will only accept late proposals up to Friday, 2/24**. If you need an extension beyond this, you **must** contact me or you will get an "Incomplete" for this assignment.

### Specifications: Draft 

The project draft does not have to be a completed version of your project, but you will only receive peer feedback on what you submit. 

**This must be turned in on time (end of the day on Friday, March 3).** Note that this cannot be turned in late because your peers must have time to submit their peer reviews. 

## Specifications: Peer Review

You will be asked to review two of your classmates' project drafts and give feedback on their design and implementation. This will come in the form of a **pull request on GitHub**. A specific feedback rubric will be provided for you (and posted here) at that time.

**This must be completed on time (before lab on Tuesday, March 7).** Note that this cannot be turned in late because your peers must have ample time to revise their projects given your feedback

## Reflection

Your final reflection is a reflection of both your project and the course. It is a short piece of writing that gives you room to reflect on your intro programming journey.

It is not scored, but you will get feedback and it will help me put your semester into context!

### Specifications

- 1 to 2 pages, single spaced ( >= 500 words)
- PDF or Markdown
- Due with your final draft of the project

### Prompts

You do not have to answer all or even any of the following questions; they're just a guideline for what I'm hoping you get out of this reflective portion.

- What grade do you expect to receive in this course? Do you feel like that grade is an accurate reflection of your learning? Why or why not? 
- What was the process of completing a final project like? Is there anything you wish you'd done differently? Anything you'd add or change if you had another week to work on it? Anything you'd subtract? 
- How did the mastery-based grading style of the class impact how you approached the homeworks and labs? Or did not really impact you at all? 
- Was there a time in this class when something finally "clicked" for you after struggling with it for a while? What made it click?
- What can you take forward from this class to other classes? This could be something concerete you learned, an approach that you tried, or something that didn't work at all that you'll consciously avoid next time. 
- Anything else you want to write about that will place your work into context for you and for me.  

## Github Repository

Your project will be turned in as a GitHub repository. Your project will be evaluated on **the version of the project that is on GitHub at 5:30 PM Central on March 15, 2023.** For legal reasons, I **cannot** accept work past this date and time. 

If you want to turn in an earlier draft of the project to receive feedback, you can let me know at any time prior to 11:59 PM on 3/9. This is your last date to receive feedback from me on your project before its final evaluation. 

### Specifications

Your GitHub repository should:

- Have a README.md which outlines the following:
   - What your project does (the game, visualization, etc) in 1-2 sentences.
   - What outside tools (modules, packages, datasets) were used to create your project 
   - What contributions you made to the project in 1-2 sentences
- Have instructions for how to download and run your project, or instructions on how to run your project if web-hosted
- Contain all the code necessary for someone to download and run your project on their own computer without going to any outside source (besides possibly installing python or python modules)
  
## Ideas

This is where I would normally post a curated list of previous years' projects. However, I don't have a previous year for this class.

So here is instead a list of ideas:

### Game Ideas

- [Snake](https://en.wikipedia.org/wiki/Snake_(video_game_genre))
- [Connect Four](https://en.wikipedia.org/wiki/Connect_Four)
- [Mastermind](https://en.wikipedia.org/wiki/Mastermind_(board_game)) (essentially Wordle)
- [Battleship](https://en.wikipedia.org/wiki/Battleship_(game))
- [Monty Hall](https://en.wikipedia.org/wiki/Monty_Hall_problem)

### Visualization Ideas

- Public health maps (e.g. COVID, cancer, environmental health)
- University admissions and retention data, e.g. [Sankey graphs](https://www.data-to-viz.com/graph/sankey.html)
- World population over history 
- Sports team win/loss records or other interesting sports data 

Feel free to approach me with your own ideas as well. These are just to get your thinking started.

_Portions of this document are taken from Dr. Anya Vostinar._