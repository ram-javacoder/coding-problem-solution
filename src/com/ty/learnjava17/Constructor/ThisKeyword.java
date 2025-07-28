package com.ty.learnjava17.Constructor;

/* Here is a Java program where 'this' is used to differentiate between instance variables and parameters:*/

class ThisKeyword {
	int x = 1;
	int y = 2;

	public void myMethod(int x, int y) {
		this.x = x; // this refers to the instance variable x
		this.y = y; // this refers to the instance variable y
		System.out.println("x = " + this.x); // prints 10
		System.out.println("y = " + this.y); // prints 20
	}

	public static void main(String[] args) {
		ThisKeyword myClass = new ThisKeyword();
		myClass.myMethod(10, 20);
		
	}
}