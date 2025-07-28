package com.learnjava17.varargs;

public class Addition {

	static int fact = 1;
	static int addition = 0;

	public static void factorial(int... a) {

		System.out.println("Length of variable is :" + a.length);
		System.out.println("Present elements is :");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\nFactorial of the Number :");

		for (int i : a) {
			fact = fact * i;

		}
		
		System.out.println(fact);
		System.out.println();
	}

	public static void addition(int... a) {
		System.out.println("Present elements is :");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\nAddition of total number :");

		for (int i : a) {

			addition = addition + i;

		}
		System.out.print(addition + " ");
	}

	public static void main(String[] args) {

		factorial(10, 20, 30, 40, 50);
		addition(10, 20, 30, 40, 50);

	}

}
