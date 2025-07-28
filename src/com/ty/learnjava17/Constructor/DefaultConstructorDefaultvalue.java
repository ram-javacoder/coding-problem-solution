package com.ty.learnjava17.Constructor;

/* Implement a class with a default constructor that initializes some default values.
  */

class Student {
	String name;
	int age;
	String course;

	// Default constructor
	public Student() {
		name = "John Doe";
		age = 20;
		course = "Computer Science";
	}

	// Method to display student information
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
	}
}

public class DefaultConstructorDefaultvalue {
	public static void main(String[] args) {
		// Creating an object using the default constructor
		Student defaultStudent = new Student();

		// Displaying student information using the object's method
		defaultStudent.displayInfo();
	}
}
