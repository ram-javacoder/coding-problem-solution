package com.ty.learnjava17.Constructor;

/* Develop a program with multiple parameterized constructors for a class.
  */

public class ConstructorMutiParamer {
	private int x;
	private int y;

	public ConstructorMutiParamer() {
		this(0, 0);
	}

	public ConstructorMutiParamer(int x) {
		this(x, 0);
	}

	public ConstructorMutiParamer(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void display() {
		System.out.println("x = " + x + ", y = " + y);
	}

	public static void main(String[] args) {
		ConstructorMutiParamer myClass1 = new ConstructorMutiParamer();
		myClass1.display();

		ConstructorMutiParamer myClass2 = new ConstructorMutiParamer(5);
		myClass2.display();

		ConstructorMutiParamer myClass3 = new ConstructorMutiParamer(10, 15);
		myClass3.display();
	}
}