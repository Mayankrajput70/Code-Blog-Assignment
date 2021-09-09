# Code-Blog-Assignment
SOLID is a collection of important programming practices that were developed by Robert C. Martin.

## SOLID consists of 5 coding practices:

SRP - Single responsibility principle

OCP - Open/close principle

LSP - Liskov substitution principle

ISP - Interface segregation principle

DIP - Dependency inversion principle

## SRP - Single responsibility principle
SRP - says that each method / class should be responsible for one specific activity. Inserting everything into one method does not meet the basic assumptions of objectivity, but also makes it difficult to read, repair or expand programs.

This principle is very noticeable when we write an application that begins to grow with time. It is enriched with new functionalities. Then we want to use already existing classes and their capabilities. However, it turns out, that the class that A should do is also do B, C and D, which is not desired by the currently created implementation. Then the problem arises because we can no longer use the given class. In this situation, you can avoid sticking to the SRP.

## OCP - Open/close principle
The OCP principle says that the classes that we create are open to extensions and closed to modifications.

The application that we create must be ready for extensions, because the systems are changing very quickly these days. Thanks to the OCP principle, we are able to repeatedly use our classes for various tasks, which promotes reusability of the code, but also makes it easy to understand.

## LSP - Liskov substitution principle
Functions that use pointers or references to base classes must also be able to use class objects that inherit from the base classes without having a thorough knowledge of these objects.

## ISP - Interface segregation principle
ISP says: "Many dedicated interfaces are better than one overall".

The interface should give a specific shape to the class, and the methods that must be implemented within the class should be common to all implementation classes.

## DIP - Dependency inversion principle
High-level modules should not depend on low-level modules.
Both should depend on abstractions.

Abstractions should not depend on details.
Details should depend on abstractions.

Usually by abstraction, we mean an abstract class or interface. Essentially, this means that we are introducing a certain abstraction, which allows us to exchange individual elements of the program with other ones more suitable for a specific task.

We try not to enter into classes depending on its smaller parts.

## Goal
This principle aims to enforce consistency so that the parent Class or its child Class can be used in the same way without any errors.
