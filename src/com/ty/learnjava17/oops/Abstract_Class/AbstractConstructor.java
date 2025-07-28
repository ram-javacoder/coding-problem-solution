package com.ty.learnjava17.oops.Abstract_Class;

//Java Program to Illustrate Abstract Class 
//Can contain Constructors

abstract class Base {

	// Constructor of class 1
	Base() {
		// Print statement
		System.out.println("Base Constructor Called");
	}

	// Abstract method inside class1
	abstract void fun();
}

// Class 2
class Derived extends Base {

	// Constructor of class2
	Derived() {
		System.out.println("Derived Constructor Called");
	}

	// Method of class2
	void fun() {
		System.out.println("Derived fun() called");
	}
}

public class AbstractConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived d = new Derived();
		d.fun();

	}

}

/*

Base Constructor Called
Derived Constructor Called
Derived fun() called

*/