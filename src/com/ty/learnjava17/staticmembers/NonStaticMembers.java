package com.ty.learnjava17.staticmembers;

public class NonStaticMembers {

	// This is a non-static variable
	int number = 10;

	// This is a non-static method
	public void display() {
		System.out.println("The number is: " + number);
	}

	public static void main(String[] args) {

		// Create an object of the NonStaticMembers class
		NonStaticMembers obj = new NonStaticMembers();

		// Call the non-static method
		obj.display();
	}
	// TODO Auto-generated method stub

}
