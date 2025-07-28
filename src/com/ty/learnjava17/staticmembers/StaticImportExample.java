package com.ty.learnjava17.staticmembers;

import static java.lang.Math.*;

/* Write a Java program that demonstrates the usage of static import for the Math class.
 */

public class StaticImportExample {

	public static void main(String[] args) {

		double a = 6;
		double b = 8;
		double c = sqrt(a * a + b * b);

		System.out.println("The hypotenuse is " + c);

	}

}
