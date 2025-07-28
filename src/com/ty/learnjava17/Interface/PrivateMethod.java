package com.ty.learnjava17.Interface;

interface ClassA {
	
	default void print() {
		
		System.out.println("This is default method of A interface!...");
		displayMsg();
		details();
	
	}
	
	private void displayMsg() {
		
		System.out.println("This is private method!...");
	}
	
	private static void details() {
		
		System.out.println("This is private static method!...");
	}
}


public class PrivateMethod implements ClassA {

	public static void main(String[] args) {
		
		ClassA obj=new PrivateMethod();
		obj.print();
		
	}

}
