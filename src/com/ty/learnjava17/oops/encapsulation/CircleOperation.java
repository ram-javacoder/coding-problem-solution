package com.ty.learnjava17.oops.encapsulation;

class Circle {

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {

		return Math.PI * radius * radius;

	}

	public double getCircumference() {

		return 2 * Math.PI * radius;

	}

}

public class CircleOperation {

	public static void main(String[] args) {

		int r = 7;
		Circle c = new Circle(r);
		c.setRadius(r);

		System.out.println("The Radius of Circle :" + c.getRadius());
		System.out.println("the Area of the circle is :" + c.getArea());
		System.out.println("The Circumference of Circle is :" + c.getCircumference());

		System.out.println(" ");
		int r1 = 12;
		c.setRadius(r1);
		System.out.println("The Radius of Circle :" + c.getRadius());
		System.out.println("the Area of the circle is :" + c.getArea());
		System.out.println("The Circumference of Circle is :" + c.getCircumference());

		// TODO Auto-generated method stub

	}

}
