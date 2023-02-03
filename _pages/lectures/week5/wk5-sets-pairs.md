---
title: Week 5 Day 3 - Sets and Tuples
permalink: /lectures/w5-d3
toc: true
toc_label: "Table of Contents"
toc_icon: "cog"
---

Find code from class [here](https://github.com/alackles/CMSC-150-WT-23/tree/main/_pages/lectures/week5).

# Sets and Tuples

The purpose of today's class is to introduce you to two data structures in Java which are similar to arrays, but have slightly different properties. One is a _set_, which contains no duplicates; the other is a _tuple_, which unlike an array cannot be modified once created.

**By the end of today's class, you should be able to answer the following questions:**
- How is a set different than an array? Than a tuple?
- In what circumstances might you want to create a set instead of an array? 
- How do you traverse the elements of a set? 

## Java Utils

For all of the following, you will have to have at the top of your Java file:

```java
import java.util.*
```

This imports all necessary utils for these structures.

## Sets

Sets are data structures which cannot contain duplicate elements. That is, while an array could look something like this:

```java
int[] arr = {2, 2, 2, 4, 5};
```

the array's corresponding _set_ would contain only the elements (2, 4, 5). 

In Java, to create such a set, you would have to do the following:

```java
Set<int> arrSet = new HashSet<int>(Arrays.asList(arr));
```

You can see that this is a bit wordy and not very intuitive, so usually what we do is create an empty set and add elements as needed.

```java
Set<int> mySet = new HashSet<int>();
```

Now this looks more like what we've been doing before, except that the type is in angled brackets.

Then, to add to a set, you can do:

```java
mySet.add(0);
mySet.add(2);
```

You could do this over the entire array:

```java
for (int i = 0; i < arr.length; i++) {
    mySet.add(arr[i]);
}
```

### Checking for Presence in Set

It's important to note that `.add()` works in-place and also _returns_ a value: true if the element is actually added, and false if the element is already inside the set. 

Therefore, we could create a set and find out whether there are any duplicate elements at the same time. 

```java
int[] nums = {4, 2, 2, 2, 5, 6, 4};
Set<int> numSet = new HashSet<int>();
for (int i = 0; i < nums.length; i++) {
    if (numSet.add(nums[i] == false) {
        System.out.println("Duplicate:" + nums[i]);
    }
}
System.out.println(numSet.toString());
```

### Ordered Sets

The above set "under the hood" includes some complicated mapping which makes it hard to sort. 

If you want a set that is sorted, either numerically or alphabetically, you can use the alternative construction `SortedSet`, which works the same way except in how it is declared.

```java
SortedSet<int> sortSet = new TreeSet<int>();
```

## Tuples

Tuples in Java are created by specifying the number of elements you wish to include. 

To create a pair, or a _2-tuple_:

```java
Pair<String, Integer> pair = new Pair<String,Integer>("Example", 1);
```

To create a triplet, or a _3-tuple_:

```java
Triplet<Integer, Integer, Integer> coords = new Triplet<Integer, Integer, Integer>(4, 2, 5);
```

Note the capital types; this will make more sense next week when we read about immutable objects and primitive types. For now, I'm just introducing tuples to you to get a sense that you can have more than just arrays.

## Enhanced For Loop

The "enhanced for loop" is a way to iterate over an array or a set or a tuple which grabs each _element_ of the array, but _not_ its index. 

It is the best way to loop over a set, because other ways involve more complicated requirements.

```java
int[] arr = {2, 4, 5, 5, 1, 800, 800, 3}
SortedSet<int> sortSet = new TreeSet<int>();
for (elem : arr) {
    sortSet.add(elem);
}
for (elem: sortSet) {
    System.out.println(elem);
}
```
