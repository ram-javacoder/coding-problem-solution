package com.ty.learnjava17.Constructor;

/* Create a program demonstrating the use of 'this' within different methods.
 */

class Rectangle {
	int length;
	int width;

	// Parameterized constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// Method to calculate area
	public int calculateArea() {
		return this.length * this.width; // Using 'this' to refer to instance variables
	}

	// Method to check if the rectangle is a square
	public boolean isSquare() {
		return this.length == this.width; // Using 'this' to refer to instance variables
	}

	// Method to display rectangle details
	public void displayDetails() {
		System.out.println("Length: " + this.length); // Using 'this' to refer to instance variables
		System.out.println("Width: " + this.width); // Using 'this' to refer to instance variables
		System.out.println("Area: " + this.calculateArea()); // Using 'this' to call another method
		System.out.println("Is it a square? " + this.isSquare()); // Using 'this' to call another method
	}
}

public class ThisKeyword3 {
	public static void main(String[] args) {
		// Creating an object using the parameterized constructor
		Rectangle rectangle = new Rectangle(5, 5);

		// Displaying rectangle details using the object's method
		rectangle.displayDetails();
	}
}
