package com.ty.learnjava17.Constructor;

/* Implement a class where 'this' is used to distinguish between instance variables and method parameters.
 */

class PersonClass {
	String name;
	int age;

	// Parameterized constructor
	public PersonClass(String name, int age) {
		this.name = name; // 'this.name' refers to the instance variable 'name'
		this.age = age; // 'this.age' refers to the instance variable 'age'
	}

	// Method to display person information
	public void displayInfo(String name) {
		System.out.println("Name (method parameter): " + name);
		System.out.println("Name (instance variable): " + this.name);
		System.out.println("Age (instance variable): " + this.age);
	}
}

public class ThisKeyword2 {
	public static void main(String[] args) {
		// Creating an object using the parameterized constructor
		PersonClass person = new PersonClass("Ramkumar", 25);

		// Displaying person information using the object's method
		person.displayInfo("John");
	}
}
