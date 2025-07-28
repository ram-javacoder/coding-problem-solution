package com.ty.learnjava17.oops.polymorphism;

/* Here is a Java program that showcases method overloading with multiple methods having different parameter types:  */

public class MethodOverloading {

	// Overloaded add() method with two int parameters
	public int add(int a, int b) {
		return a + b;
	}

	// Overloaded add() method with two double parameters
	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Create a new MethodOverloading object
		MethodOverloading overloading = new MethodOverloading();

		// Call the add() method with two int parameters
		int sum = overloading.add(1, 2);
		System.out.println("The sum of 1 and 2 is: " + sum);

		// Call the add() method with two double parameters
		double sum2 = overloading.add(1.5, 2.5);
		System.out.println("The sum of 1.5 and 2.5 is: " + sum2);
	}

}