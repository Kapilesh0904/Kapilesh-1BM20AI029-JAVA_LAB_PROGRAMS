## Getting Started

This repository contains the codes for the Java Lab Cycle Programs.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources or java programs
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files (classes) will be generated in the `bin` folder by default.

## List of Programs

1 a. Design and create a class named Retail Item that holds data about an item in a retail store. The class should have the following fields:
• Description - The description field references a String object that holds a brief description of the item.
• Units - The units field is an int variable that holds the number of units currently in inventory.
• Price - The price field is a double that holds the item’s retail price.
Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, and accessor methods that return the values in these fields. Write the main method which creates three Retail Item objects and invokes appropriate methods.

1b.Write a class named Car that has the following data members:
• model. The model field is an int that holds the car’s year.
• make. The make field references a String object that holds the make of the car.
• speed. The speed field is an int that holds the car’s current speed.
The class should have the following constructor and other methods.
• The constructor should accept the car’s year model, make and speed as arguments.
• Accessor methods should get the values stored in an object’s year, Model, make, and speed fields.
• Accelerate method should add 5 to the speed field each time it is called.
• Brake method should subtract 5 from the speed field each time it is called.
Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. After each call to the accelerate method, get the current speed of the car and display it. Call the brake method five times. After each call to the brake method, get the current speed of the car and display it.

2a. Identify the type of inheritance in the given diagram. Create a class A with two integer member
variables that are private, two float variables that are protected and two integer variables that are public.
Let class B inherit class A and class C and Class D are inherited from class B. Write appropriate
methods to illustrate the following
i) Usage of super keyword
ii) Function overriding
iii) Default constructors
iv) Parameterized constructors
v) How to we make a method not to be over ridden and a class not be inherited further
