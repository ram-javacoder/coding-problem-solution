package com.ty.learnjava17.staticmembers;

/*  
 * Create a Java program that uses the 'this' keyword to distinguish between instance variables and parameters.

 */

public class ThisKeyword {

	private int value;

	public ThisKeyword(int value) {
		this.value = value; // Assign the parameter value to the instance variable
	}

	public void printValue() {
		System.out.println("The value is: " + this.value); // Use the 'this' keyword to refer to the instance variable
	}

	public static void main(String[] args) {
		ThisKeyword myClass = new ThisKeyword(5);
		myClass.printValue(); 
	}
}