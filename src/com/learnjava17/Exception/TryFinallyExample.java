package com.learnjava17.Exception;

public class TryFinallyExample {

	public static void main(String[] args) {
		try {
			// Some code that may throw an exception
			int result = divideByZero();
			System.out.println("Result: " + result);
		} finally {
			// Code in finally block will always execute
			System.out.println("Finally block executed.");
		}
	}

	public static int divideByZero() {
		int numerator = 10;
		int denominator = 0;

		try {
			return numerator / denominator;
		} catch (ArithmeticException e) {

			System.out.println("Cannot divide by zero." + e.toString());
			return 0;
		}
	}
}
