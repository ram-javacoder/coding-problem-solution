package com.ty.learnjava17.staticmembers;

/* Write a Java program to demonstrate the basic usage of a static variable.
 */

class MyClass {

	static {

		System.out.println("This is MLSI");
	}
	
	{
		System.out.println("This is MLNSI");
	}

	static int count = 0;

	MyClass() {

		count++;
	}

}

public class StaticVariableProcessing {

	public static void main(String[] args) {

		MyClass obj = new MyClass(); // count =0
		System.out.println(obj.count);
		MyClass obj1 = new MyClass();// count =1
		MyClass obj2 = new MyClass();// count =2
		System.out.println("Count increasing..." + MyClass.count); // count=3

	}

}
