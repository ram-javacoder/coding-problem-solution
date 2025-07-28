package com.ty.learnjava17.oops.Abstract_Class;

import java.util.Scanner;

abstract class Shape {

	public abstract double area();

	public abstract double perimeter();

}

class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {

		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {

		return 2 * Math.PI * radius;
	}

}

class RectangleShape extends Shape {

	private double length;
	private double breath;

	public RectangleShape(double length, double breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * breath;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (length * breath);
	}

}

public class AbstractMethodImplementation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the radius of Circle :");
		double r = sc.nextDouble();
		System.out.println("Enter the length of Rectangle :");
		double l = sc.nextDouble();
		System.out.println("Enter the breath of Rectangle :");
		double b = sc.nextDouble();

		Circle c = new Circle(r);
		RectangleShape rt = new RectangleShape(l, b);

		System.out.println("Area of Circle :" + c.area());
		System.out.println("Perimeter of Circle :" + c.perimeter());
		System.out.println("Area of Rectangle :" + rt.area());
		System.out.println("Perimeter of Rectangle :" + rt.perimeter());

	}

}

/*
Enter the radius of Circle :
12.6
Enter the length of Rectangle :
32.4
Enter the breath of Rectangle :
15
Area of Circle :498.75924968391547
Perimeter of Circle :79.16813487046278
Area of Rectangle :486.0
Perimeter of Rectangle :972.0
*/