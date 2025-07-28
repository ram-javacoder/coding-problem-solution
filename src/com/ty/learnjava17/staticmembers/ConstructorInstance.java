package com.ty.learnjava17.staticmembers;

/* Implement a program with constructors to initialize instance variables.
  */

public class ConstructorInstance {
	  private String name;
	  private int age;

	  // Constructor to initialize the name and age of the person
	  public ConstructorInstance(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }

	  // Method to get the name of the person
	  public String getName() {
	    return name;
	  }

	  // Method to get the age of the person
	  public int getAge() {
	    return age;
	  }

	  // Main method to test the Person class
	  public static void main(String[] args) {
	    // Create a new Person object with the name "John Doe" and the age 30
	    ConstructorInstance person1 = new ConstructorInstance("John Doe", 30);

	    // Print the name and age of the person
	    System.out.println("Name: " + person1.getName());
	    System.out.println("Age: " + person1.getAge());
	  }
	}