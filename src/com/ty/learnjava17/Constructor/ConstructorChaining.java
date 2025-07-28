package com.ty.learnjava17.Constructor;

class ConstructorChain {
	int value;

	// Constructor with an integer parameter
	public ConstructorChain(int value) {
		this.value = value;
		System.out.println("Constructor with integer value: " + value);
	}

	// Constructor chaining using 'this'
	public ConstructorChain() {
		this(100); // Calls the constructor with an integer parameter
		System.out.println("Default Constructor");
	}

	// Method to display value
	public void displayValue() {
		System.out.println("Value: " + value);
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		// Creating an object using the default constructor
		ConstructorChain obj = new ConstructorChain();

		// Displaying value using the object's method
		obj.displayValue();
	}
}
