---
title: Week 2 Day 2 - Methods w/ Returns
permalink: /lectures/w2-d3
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week2).

## Methods with Returns

The goal of today's class is to extend our understanding of methods from something that simply prints information to something that can return, or save, a value. 

**By the end of today's class, you should be able to answer the following questions:**
- How do you _return_ a value from a method in Java? 
- When might you want to return a value instead of print it?
- How do you set the type of the value to be returned from a method?
- What happens if you try to return a value
- Does the type of the value that is returned have to match the value(s) used as parameter(s)?
 
## Questions from the Reading

> Why do you ever need a method stub? What does it do?

```java
public static double distance(double x1, double y1, double x2, double y2) {
    return 0.0; // stub
}
```

> What is the difference between returning and printing? Doesn't a void method return something with `System.out.println()`?


## Lecture/Live-Code

The main difference between the material for this class and the material from last class is that our methods can now _return_ values instead of just printing them. Consider the difference between these two methods: 

### Returns

```java
public static void helloVoid() {
    System.out.println("Hello! (1)");
}
public static void helloReturn() {
    return "Hello! (2)";
}
```

They would both be called in simlar ways, but `helloReturn()` won't actually print `"Hello"` by itself.

```java
public static void main(String[] args) {
    helloVoid();
    helloReturn();
}
```

This makes some sense; remember that we are basically just running whatever code is in the method when we call it, so calling a method that doesn't have a print statement won't print anything. So what does it do? 

You can think of it as the method name is directly replaced by whatever is in the `return` statement. In this case, `helloReturn()` will be a string. 

```java
public static void main(String[] args) {
    helloVoid();
    String b = helloReturn();
    System.out.println(b);
}
```

### Calculations with Methods

It's easier to see why we might want to do this if we are instead performing some kind of intermediate computation. 

```java
import java.util.Scanner;

public static double diameter(double radius) {
    double diameter = radius*2;
    return diameter;
}

public static double area(double d) {
    double area = d*Math.PI;
    return area;
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double r = in.nextDouble();
    double d = diameter(r);
    double a = area(d);
    System.out.println("Circle area is: " + a);
}
```

You can see how this allows us to save intermediate steps. 

### Printing and Returning

Note that if we wanted to print something as well as return it, that is fine, and it will print at the point in the code where the method is called. 

```java
import java.util.Scanner;

public static double diameter(double radius) {
    double diameter = radius*2;
    return diameter;
}

public static double area(double d) {
    double area = d*Math.PI;
    System.out.println("Area calculated.")
    return area;
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double r = in.nextDouble();
    System.out.println("radius: " + r)
    double d = diameter(r);
    System.out.println("diameter: " + d)
    double a = area(d);
    System.out.println("Circle area is: " + a);
}
```

### Returns are Final

Once you return something, the method immediately stops executing. This is because it _returns_ you back to the main method. 

```java
import java.util.Scanner;

public static double diameter(double radius) {
    double diameter = radius*2;
    return diameter;
}

public static double area(double d) {
    double area = d*Math.PI;
    return area;
    System.out.println("Hello!");
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double r = in.nextDouble();
    double d = diameter(r);
    double a = area(d);
}
```

### Composing Methods

You can call methods within other methods and use their returned values. You are already doing this in `main`, but you can do it in other methods, too. 

```java
import java.util.Scanner;

public static double diameter(double radius) {
    double diameter = radius*2;
    return diameter;
}

public static double area(double radius) {
    double area = diameter(radius)*Math.PI;
    return area;
    System.out.println("Hello!");
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double r = in.nextDouble();
    double a = area(r);
}
```

## In-Class Exercise

The quadratic formula is a simple way to find the roots of a polynomial function of the form

$$f(x) = ax^2 + bx + c$$

That is, if we set `f(x) = 0` and solve the equation for `x`, we get:

$$ x = \frac{-b \pm \sqrt{b^2-4ac}}{2a} $$

The part of the quadratic formula under the radical (square root sign) is called the _discriminant_. 

Write a program with two methods called `discriminant()` and `quadratic()`. 

The method `discriminant()` should take in three arguments, `a`, `b`, and `c` and return the discriminant (`b^2 - 4ac`).


The method `quadratic()` should take in three arguments, `a`, `b`, and `c`, call the `discriminant()` method somewhere in its body, and return the _positive_ root of the polynomial with those coefficients.

As an example, the inputs `a=1, b=-2, c=-8` should return `2.0`. 

Hints: 

- Recall that you can square a number by simply multiplying it by itself
- Remember that to do a square root operation, you will have to import the `Math` module. 
- Right now, you don't have to worry about equations with imaginary roots (where the discriminant is negative). Just make sure it works on the example input.



