package com.ty.learnjava17.oops.polymorphism;

public class ConstructorOverloading {

	private int myInt;
	private double myDouble;
	private String myString;

	public ConstructorOverloading(int myInt) {
		this.myInt = myInt;
	}

	public ConstructorOverloading(double myDouble) {
		this.myDouble = myDouble;
	}

	public ConstructorOverloading(String myString) {
		this.myString = myString;
	}

	public int getMyInt() {
		return myInt;
	}

	public double getMyDouble() {
		return myDouble;
	}

	public String getMyString() {
		return myString;
	}

	public static void main(String[] args) {

		ConstructorOverloading myIntInstance = new ConstructorOverloading(10);
		ConstructorOverloading myDoubleInstance = new ConstructorOverloading(10.5);
		ConstructorOverloading myStringInstance = new ConstructorOverloading("Hello, world!");

		System.out.println(myIntInstance.getMyInt()); // Prints 10
		System.out.println(myDoubleInstance.getMyDouble()); // Prints 10.5
		System.out.println(myStringInstance.getMyString()); // Prints "Hello, world!"

	}

}
