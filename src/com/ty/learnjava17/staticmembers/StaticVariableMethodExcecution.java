package com.ty.learnjava17.staticmembers;

/*
 * Develop a program illustrating the differences between static and instance variables/methods.

 */

class StaticVariableMethod {

	static int staticvar = 10; // static variable

	int instanceVar = 20; // Instance variable

	// Static method
	static void staticMethod() {

		System.out.println("This is static method,Inside static method we can call static variable :" + staticvar);

	}

	// Instance Method
	void instanceMethod() {

		System.out.println("This is Instance method :");
		System.out.println("This is Instance variable :" + instanceVar);
		System.out.println("we can call static member inside non-static method :" + staticvar);

	}

}

public class StaticVariableMethodExcecution {

	public static void main(String[] args) {

		System.out.println("Accessing static variable :" + StaticVariableMethod.staticvar);
		// Accessing static method
		StaticVariableMethod.staticMethod();

		StaticVariableMethod obj = new StaticVariableMethod();

		System.out.println("Accessing Instance variable :" + obj.instanceVar);
		// Accessing Instance Method
		obj.instanceMethod();

	}

}

/*
 * Accessing static variable :10 This is static method,Inside static method we
 * can call static variable :10 Accessing Instance variable :20 This is Instance
 * method : This is Instance variable :20 we can call static member inside
 * non-static method :10
 * 
 */