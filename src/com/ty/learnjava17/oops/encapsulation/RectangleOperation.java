package com.ty.learnjava17.oops.encapsulation;

class Rectangle {

	private int length;
	private int breath;

	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

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

	public double getPerimeter() {

		return 2 * (length * breath);
	}

	public double getArea() {

		return length * breath;
	}

}

public class RectangleOperation {

	public static void main(String[] args) {

		int r1=15,r2=7;
		
		Rectangle r = new Rectangle(r1, r2);
		r.setLength(r1);
		r.setBreath(r2);
		
		System.out.println("The length of Rectangle :" + r.getLength());
		System.out.println("The length of Rectangle :" + r.getBreath());
		System.out.println("The Perimeter of Rectangle :" + r.getPerimeter());
		System.out.println("The Area of Rectangle :" + r.getArea());

		System.out.println(" ");

		int l = 23, b = 11;
		r.setBreath(b);
		r.setLength(l);
		System.out.println("The length of Rectangle :" + r.getLength());
		System.out.println("The length of Rectangle :" + r.getBreath());
		System.out.println("The Perimeter of Rectangle :" + r.getPerimeter());
		System.out.println("The Area of Rectangle :" + r.getArea());

	}

}
