# Generics Lab

## Learning Goals

- Create and work with static generic methods.

## Introduction

You'll be solving two problems to understand generics better. There are starter
code samples in this lab's repository.

## Problem 1: Convert generic array to String array

Declare a static method called `convertToString` in the `GenericPractice` class
that accepts a generic array and returns the elements of the input array as a
String.

## Problem 2: Return the first element of a generic array

Building on the same foundation as the previous problem, in the same
`GenericPractice` class, declare a static method called `getFirstElement` that
accepts a generic array and returns the first element of the input array or
`null` if the array is empty.

## Sample Code

Consider the following sample code to help get you started and the driver class
to test your code on both of the problems above:

```java
public class GenericPractice {

    // Write the method convertToStringArray here

    // Write the method getFirstElement here
}
```

```java
public class GenericDriver {
  public static void main(String[] args) {
    Integer[] inputInt = { 1, 2, 3 };
    Integer[] inputEmpty = new Integer[5];
    String[] inputStr = { "Cake", "Donut", "Cupcake" };

     System.out.println(GenericPractice.convertToStringArray(inputInt)); // [1, 2, 3]
     System.out.println(GenericPractice.convertToStringArray(inputStr)); // [Cake, Donut, Cupcake]

     System.out.println(GenericPractice.getFirstElement(inputInt)); // 1
     System.out.println(GenericPractice.getFirstElement(inputEmpty)); // null
     System.out.println(GenericPractice.getFirstElement(inputStr)); // Cake
  }
}
```

## Sample Output

The driver class should produce the following output if the methods were written
correctly:

```plaintext
[1, 2, 3]
[Cake, Donut, Cupcake]
1
null
Cake
```
