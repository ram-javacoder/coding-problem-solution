package com.learnjava17.Exception;

public class CallerExample {

	    // Method that declares an exception (callee)
	    public static void divideNumbers() throws ArithmeticException {
	        int result = 10 / 0; // ❌ This will throw ArithmeticException
	        System.out.println(result);
	    }

	    // Caller method
	    public static void main(String[] args) {
	        try {
	            divideNumbers(); // ✅ Caller handles the exception
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }
	}


	/*
	 * main() is the caller because it invokes divideNumbers(). Since
	 * divideNumbers() declares throws ArithmeticException, the caller (main()) must
	 * handle it using try-catch.
	 */