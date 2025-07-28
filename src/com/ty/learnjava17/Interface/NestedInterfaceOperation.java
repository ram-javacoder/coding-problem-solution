package com.ty.learnjava17.Interface;

import java.util.Scanner;

interface ShapeAreaOuterInterface {
	//static int a = 10;
	double area();    

	interface InnerInterface {
		double PI = 3.147;

		default void print() {
			System.out.println("This is default method of Inner Interface!...");

		}

	}

}

class RectangleAreacal implements ShapeAreaOuterInterface {
	private double length;
	private double breath;

	public RectangleAreacal(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public double area() {
		return length * breath;
	}

}

class Circle implements ShapeAreaOuterInterface.InnerInterface {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double area() {
		return PI * radius * radius;

	}
}

public class NestedInterfaceOperation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the Length of Rectangle :");
		double l = sc.nextDouble();
		System.out.println("Enter the Breath of Rectangle :");
		double b = sc.nextDouble();
		System.out.println("Enter the Radius of Circle :");
		double ra = sc.nextDouble();
		RectangleAreacal r = new RectangleAreacal(l, b);
		Circle c = new Circle(ra);
		System.out.println("Area of Rectangle :" + r.area());
		System.out.println("Area of Circle :" + c.area());
		c.print();

	}

}
