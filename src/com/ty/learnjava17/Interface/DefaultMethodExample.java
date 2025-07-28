package com.ty.learnjava17.Interface;

import java.util.Scanner;

interface Area {

	void calculateArea();

	default void print() {
		System.out.println("This is default method!...");

	}
	public static void display() {
		System.out.println("This is static method of Area!...");
		
	}
	
}

class Rectanglearea implements Area {
	private int length;
	private int breath;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public void calculateArea() {
		System.out.println("Area of Rectangle :" + (length * breath));

	}

}

public class DefaultMethodExample {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		Rectanglearea r = new Rectanglearea();
		r.print();
		Area.display();
		System.out.println("Enter the Length of Rectangle :");
		int l = s.nextInt();
		r.setLength(l);
		System.out.println("Enter the Breath of Rectangle :");
		int b = s.nextInt();
		r.setBreath(b);
		System.out.println("Area of Rectangle :" + (r.getLength() * r.getBreath()));
	}

}
