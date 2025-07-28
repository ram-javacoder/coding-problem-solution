package com.ty.learnjava17.oops.finalkeyword;

public class FinalVariableInitialization {

	
	final int maxValue = 100;
	final int minValue;
	final int totalValue;
	static final double PI;

	// Initializing static final variable in static block
	static {
		PI = 3.141592653589793;
		System.out.println("Hi... this is static block");
	}
	// Initializing instance final variable in instance block
	{
		totalValue = 150;
		System.out.println("Hi... This is non static block");
	}

	// Initializing instance final variable in constructor
	public FinalVariableInitialization() {
		minValue = 50;
		System.out.println("Hi... This is Constructor");
	}

	public static void main(String[] args) {
		FinalVariableInitialization ob = new FinalVariableInitialization();
		System.out.println("maxValue = " + ob.maxValue + ",  minValue = " + ob.minValue);
		System.out.println("totalValue = " + ob.totalValue + ",  PI = " + PI);
		
	}
}
