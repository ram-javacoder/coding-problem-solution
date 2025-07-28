package com.ty.learnjava17.oops.Abstract_Class;

// Java Program to Illustrate Abstract classes
// Can also have Final Methods

// Class 1
// Abstract class
abstract class BaseClass {

	final void fun() {
		System.out.println("Base fun() called");
	}
}

// Class 2
class DerivedClass extends BaseClass {

}

// Class 3
// Main class
class GFG {

	// Main driver method
	public static void main(String args[]) {
		{
			// Creating object of abstract class

			BaseClass b = new DerivedClass();
			// Calling method on object created above
			// inside main method

			b.fun();
		}
	}
}