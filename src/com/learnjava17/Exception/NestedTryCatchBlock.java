package com.learnjava17.Exception;

public class NestedTryCatchBlock {

	public static void main(String[] args) {

		try {

			try {
				int arr[] = new int[4];
				arr[4] = 5;

			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			int a = 10, b = 0, c;
			c = a / b;

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
