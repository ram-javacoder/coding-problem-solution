package com.ty.learnjava17.staticmembers;

/* Develop a Java program with multiple instances of a class and instance methods to perform specific actions.
 */

public class ClassInstances {
	private int x;
	private int y;

	public ClassInstances(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void printXY() {
		System.out.println("x = " + x + ", y = " + y);
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public static void main(String[] args) {
		ClassInstances myClass1 = new ClassInstances(1, 2);
		ClassInstances myClass2 = new ClassInstances(3, 4);

		myClass1.printXY(); // prints "x = 1, y = 2"
		myClass2.printXY(); // prints "x = 3, y = 4"

		myClass1.move(10, 20);

		myClass1.printXY(); // prints "x = 11, y = 22"
		myClass2.printXY(); // prints "x = 3, y = 4"
	}
}