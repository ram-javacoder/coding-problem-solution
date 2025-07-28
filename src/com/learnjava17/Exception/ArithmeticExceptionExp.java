package com.learnjava17.Exception;

//Example of UnCheckedException
public class ArithmeticExceptionExp {

	public static void main(String[] args) {

		try {
			int a = 10, b = 0;
			int sum = a / b;
			System.out.println(sum);
		} catch (ArithmeticException a) {

			System.out.println("Arithmetic Exception Occure...");
		}

	}

}
