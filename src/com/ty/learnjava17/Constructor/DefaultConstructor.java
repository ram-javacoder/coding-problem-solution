package com.ty.learnjava17.Constructor;


/* Sure, here's an example demonstrating the use of a default constructor in Java:

 */
class Person {
	String name;
	int age;

	// Default constructor
	public Person() {
		this.name = "John Doe";
		this.age = 30;
	}

	// Method to display information
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		// Creating an object using the default constructor
		Person person = new Person();

		// Displaying information using the object's method
		person.displayInfo();
	}
}
