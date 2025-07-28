package com.learnjava17.Exception;

public class ArrayIndexOutBoundOfExceptionExp {

	public static void main(String[] args) {

		try {

			int arr[] = new int[4];
			int b = arr[4] = 5;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("ArrayIndexOutOfBoundException..." +e.getMessage());

		}

	}
}
