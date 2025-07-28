package com.ty.learnjava17.oops.polymorphism;

class OverloadedConstructors {
	int value;

	// Constructor for integer input
	public OverloadedConstructors(int value) {
		this.value = value;
		System.out.println("Constructor with integer value: " + value);
	}

	// Constructor for double input
	public OverloadedConstructors(double value) {
		this.value = (int) value; // Casting double to int
		System.out.println("Constructor with double value: " + value);
	}

	// Constructor for String input
	public OverloadedConstructors(String value) {
		this.value = Integer.parseInt(value); // Parsing String to int
		System.out.println("Constructor with String value: " + value);
	}

	// Method to display value
	public void displayValue() {
		System.out.println("Value: " + value);
	}
}

public class ConstructorOverloading2 {
	public static void main(String[] args) {
		// Creating objects using different constructors
		OverloadedConstructors obj1 = new OverloadedConstructors(10);
		OverloadedConstructors obj2 = new OverloadedConstructors(15.5);
		OverloadedConstructors obj3 = new OverloadedConstructors("20");

		// Displaying values using the objects' method
		obj1.displayValue();
		obj2.displayValue();
		obj3.displayValue();
	}
}
