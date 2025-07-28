package com.ty.learnjava17.Interface;

import java.util.Scanner;

interface shap {
	public void draw();

	public double getArea();
	
}

class Rectangle implements shap {
	private int length, breath;

	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}

	public int getBreath() {
		return breath;
	}

	public void draw() {
		System.out.println("Drawing Rectangle!...");

	}

	public double getArea() {

		return length * breath;
	}

}

class Square implements shap {

	private int size;

	public Square(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void draw() {
		System.out.println("Drawing Square!...");

	}

	public double getArea() {

		return size * size;
	}

}

public class AbstractionTest {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Area of Rectangle and Square :\n");
		System.out.println("Enter the Length of Rectangle :");
		int l=sc.nextInt();
		System.out.println("Enter the breath of Rectangle :");
		int b=sc.nextInt();
		System.out.println("Enter the size of square :");
		int s=sc.nextInt();
		
		Rectangle r=new Rectangle(l,b);
		Square square=new Square(s);
		
		r.draw();
		System.out.println("Area of Rectangle :" +r.getArea());
		
		System.out.println("********************");
		square.draw();
		System.out.println("Area of Square :" +square.getArea());
		
		
	}

}
