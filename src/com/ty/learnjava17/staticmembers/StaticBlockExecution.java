package com.ty.learnjava17.staticmembers;

/*
 * Create a program with a static block to initialize static variables and
 * display their values.
 */

public class StaticBlockExecution {

	static int variable;
	
	static {

		System.out.println("This is static Block ");
		
	}

	public static void main(String[] args) {

		System.out.println("Main Method call...");
		System.out.println("Static variable call... variable = " + variable);

	}

}
