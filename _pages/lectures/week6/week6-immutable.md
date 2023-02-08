---
title: Week 6 Day 2 - Mutable Objects
permalink: /lectures/w6-d1
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week6).

# Immutable Objects

The goal of today's class is to start thinking about _objects_ in Java. Java is an _object-oriented_ programming language, which means that the conceptual basis behind the language is to focus on the idea of self-contained objects which contain methods that you can use to interface with them. 


**By the end of today's class, you should be able to answer the following questions:**
- What is the difference between a primitive type and an object?
- How do you create a new object in Java?
- What might be the purpose of wrapper classes vs primitives?
- What are some possible uses of the `null` string?

# In-Class Exercise

The following is a Java program with all the functionality to it written in main.

```java
class Parens {

    public static void main(String[] args) {

        String s = "((3 + 7) * 2)";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }

        System.out.println(count);
    }
}
```
1. Encapsulate this fragment in a method that takes a string argument and returns the final value of count.
2. Test your method with multiple strings, including some that are balanced and some that are not. 
3. Take your string input from the command line **without using Scanner**. 
4. Come up with a way to generalize this code to check for balance of any kind of brackets. How could you do this without writing a ton of different if statements? 

# Questions from the Reading

> Why would I want to create a Point object instead of just an array of two objects? 

> How does the Rectangle work? 

> What is garbage collection, and why would I have to deal with it? 

> What do I do about all these vocab words?

# Lecture/Live-Code

Last class we talked about object-oriented programming as a paradigm for organizing programs. Today we are talking about _mutable objects_, which are the bread and butter that let us impelement that kind of paradigm.

Mutable objects are basically ways to collect similar

## Graphical Objects

The `java.awt` package contains some simple mutable objects that we can play around with. In next week's class, we'll create our own mutable objects; these are just some examples that are helpful to think about. 

### Creating New Objects

Remember that objects are new instances of classes. So to create a new instance of the Point class, which will become a new point object, we can do:

```java
Point coord = new Point(3,4);
```

`coord` here is a reference to the Point object, which contains variables `x` and `y`.

You can access these variables with

```java
int xloc = coord.x;
int yloc = coord.y;
```

You can work with these the same way you'd work with any other integers; they are just tied to the `coord` object which is of type `Point`. 

Think: What do you think would happen if I passed `coord` into a method call? Do you think it would make a copy of the point object, or just a take it as a reference? How could you test this? 

### Returning Objects

One little wrinkle to keep in mind is that when you return an object from a method call, you have to create a _new_ object; that is, you have to explicitly use the keyword `new`. 

```java
public static Point findCenter(Rectangle box) {
    int x = box.x + box.width/2;
    int y = box.y + box.height/2;
    return new Point(x,y);
}
```

This should make sense if we think about how this would actually be called and used in code.

```java
Rectangle box = new Rectangle(0, 0, 100, 100);
Point center = findCenter(box); // gets replaced with whatever is returned 
```

If you replace the `findCenter(box)` call with the returned value, you can see it exactly matches up to how you would usually define a point. 

## Source Code

Let's take a look at the source code for these objects on your computers the way that the book suggests we do. 

On macOS, it’s likely under:

`/Library/Java/JavaVirtualMachines/.../Contents/Home/lib`

On Windows, it’s likely under: 

`C:\Program Files\Java\...\lib`

Remember how to get to these places on your terminal? 