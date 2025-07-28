package com.ty.learnjava17.Constructor;

/* an example of a class with a parameterized constructor in Java  */
class Car {
	String make;
	String model;
	int year;

	// Parameterized constructor
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Method to display car information
	public void displayInfo() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
}

public class ParameterizedConstructor {
	public static void main(String[] args) {
		// Creating an object using the parameterized constructor
		Car myCar = new Car("Toyota", "Corolla", 2022);

		// Displaying car information using the object's method
		myCar.displayInfo();
	}
}
