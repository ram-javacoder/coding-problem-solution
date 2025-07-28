package com.learnjava17.Exception;

public class CallStackExample {

	// Method 3 (Throws Exception)
	public static void methodThree() throws Exception {
		throw new Exception("Something went wrong in methodThree!");
	}

	// Method 2 (Calls methodThree)
	public static void methodTwo() throws Exception {
		methodThree(); // ❌ Exception is thrown here
	}

	// Method 1 (Calls methodTwo)
	public static void methodOne() throws Exception {
		methodTwo(); // ❌ Exception propagates up the stack
	}

	public static void main(String[] args) {
		try {
			methodOne(); // ✅ Final caller handles the exception
		} catch (Exception e) {
			System.out.println("Exception handled in main: " + e.getMessage());
		}
	}
}
