---
title: Week 7 Day 1 - Classes
permalink: /lectures/w7-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week7/code).

# Classes

It's finally time to talk about classes! Classes are really at the core of object-oriented programming, so this is where we'll start to build more complex programs that can handle difficult tasks, as well as start thinking about how to implement these ideas into your final projects. 

# Questions from the Reading

> One more time, what is the difference between an object (or an instance of a class) and a class itself (or a definition of a class)?

> What is encapsulation?

> How many constructors do I need? 

> How does a value constructor set values?

> How do you access classes in other classes?

> Why use private variables and not public? What's the point? 


# Lecture/Live-Code

Last class we talked about mutable objects. These objects were _templated off of_ or _instantiated from_ classes, which were defined for us. But we can define our own classes, too, and this lets us greatly expand the capabilities of our programs. 

## VSCode and Java Projects

Before we get started talking about classes, we're going to take some time in class to set up a new project file in VSCode. 

The short version of how we're going to do this is by closing all your current projects on VSCode and starting a new Java project in whatever folder we are interested in. If you miss class, try following [this guide](https://code.visualstudio.com/docs/java/java-tutorial) and then let me know if you need additional help. 

## Creating Classes

So far when we made new Java programs we just created new methods to deal with all the different pieces we wanted to make. But now, we're going to actually create separate classes whenever we want to represent a new kind of object. 

> A note: The decision to make new classes vs new methods might feel confusing and blurry. You might be unsure whether to create a whole new class or a new method on a class. There is no wrong way to organize your code. In fact, it is common to start out one way and then need or want to make changes to the organizational structure of your code later on. These kinds of structural changes are called _refactoring_.

We're going to build a `Date` class to demonstrate some of the capabilities and limitations of classes. 

### Constructors

We can start a class the way we always have.

```java
public class Date {
    public static void main(String[] args) {
        System.out.println("Date class.");
    }
}
```

There is nothing special about this. We could build methods into this class too. 

```java
public class Date {

    public static void printDate(int month, int day, int year) {
        System.out.println(month + "/" + day + "/" + (year % 2000))
    }
    public static void main(String[] args) {
        System.out.println("Date class.");
        printDate(2, 13, 2023)
    }
}
```

And if we wanted to access this from another file, we try to do so. 

```java
public class Report {
    public static void main(String[] args) {
        String weather = "cold";
        System.out.println("Today's date is " + Date.printDate(2, 13, 2023));
        System.out.println("The weather is " + weather);
    }
}
```

But maybe the "Date" class we wrote up above feels a bit cobbled together. It's not like it actually has some inherent features, and if we want to individually access the day, month, and year, it might be hard to do so.

This is where _constructors_ and _instance variables_ come in. These features are how we turn classes into an actual collection of related objects. 

Let's change our Date class so that we have a few new features: an empty constructor, a value constructor, and an actual `printDate()` method that works with our instance variables. 

```java
public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {
        this.month = 1;
        this.day = 1;
        this.year = 1970;
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public euroDate(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void printDate() {
        System.out.println(this.month + "/" + this.day + "/" + (this.year % 2000))
    }
    public static void main(String[] args) {
        System.out.println("Date class.");
        Date newDate = new Date(2, 14, 2023);
        newDate.printDate();
    }
}
```

## Use in Other Classes

Now we can use this class in another class: 

```java
public class Report {
    public static void main(String[] args) {
        String weather = "cold";
        Date date = new Date(2, 13, 2023);
        System.out.println("Today's date is " + date.printDate());
        System.out.println("The weather is " + weather);
    }
}
```

## Getters and Setters

The other important thing to know is that private variables aren't accessible by default. However, it's good to make these variables private, usually; one major reason is you might want to change how something is implemented "under the hood" without changing how those methods are used.

In the above example, we could add to our `Date` class:

```java
public int getMonth() {
    return this.month
}
```

Then to access the month in `Report`, we could do

```java
int m = date.getMonth();
```

Note that this is different from `date.month`; `.month` is a private variable and can't be accessed.

Can you think of a public variable we've worked with before? 

The opposite of a getter is a setter, which lets us do the same operation in reverse. 

```java
public void setMonth(int month) {
    this.month = month;
}
```

We will continue talking about classes in depth in future sessions, but these are the bare-bones of what you need to know to start working with designing your own classes in Java. 