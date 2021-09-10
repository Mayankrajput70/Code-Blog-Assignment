# Code-Blog-Assignment
SOLID is a collection of important programming practices that were developed by Robert C. Martin.

## SOLID consists of 5 coding practices:

SRP - Single responsibility principle

OCP - Open/close principle

LSP - Liskov substitution principle

ISP - Interface segregation principle

DIP - Dependency inversion principle

## LSP - Liskov substitution principle
Functions that use pointers or references to base classes must also be able to use class objects that inherit from the base classes without having a thorough knowledge of these objects.

## Goal
This principle aims to enforce consistency so that the parent Class or its child Class can be used in the same way without any errors.

## ISP - Interface segregation principle
ISP says: "Many dedicated interfaces are better than one overall".

The interface should give a specific shape to the class, and the methods that must be implemented within the class should be common to all implementation classes.

## Goal
This principle aims at splitting a set of actions into smaller sets so that a Class executes ONLY the set of actions it requires.

## DIP - Dependency inversion principle
High-level modules should not depend on low-level modules.
Both should depend on abstractions.

Abstractions should not depend on details.
Details should depend on abstractions.

Usually by abstraction, we mean an abstract class or interface. Essentially, this means that we are introducing a certain abstraction, which allows us to exchange individual elements of the program with other ones more suitable for a specific task.

We try not to enter into classes depending on its smaller parts.

## Goal
This principle aims at reducing the dependency of a high-level Class on the low-level Class by introducing an interface.
