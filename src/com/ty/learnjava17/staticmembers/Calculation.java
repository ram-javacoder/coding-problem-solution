package com.ty.learnjava17.staticmembers;

/* Implement a Java program that uses static methods to perform common mathematical operations.
 */
import java.util.Scanner;

public class Calculation {

	public static int add(int a, int b) {
		return a + b;

	}

	public static int mul(int a, int b) {
		return a * b;

	}

	public static double mod(int a, int b) {
		return a % b;

	}

	public static int sub(int a, int b) {
		return a - b;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second number :");
		int b = sc.nextInt();

		System.out.println("Addition of two number :" + Calculation.add(a, b));
		System.out.println("Subtraction of two number :" + Calculation.sub(a, b));
		System.out.println("Multiplication of two number :" + Calculation.mul(a, b));
		System.out.println("Modulus of two number :" + Calculation.mod(a, b));

	}

}

/*
Enter the first number :
12
Enter the second number :
21
Addition of two number :33
Subtraction of two number :-9
Multiplication of two number :252
Modulus of two number :12.0

*/