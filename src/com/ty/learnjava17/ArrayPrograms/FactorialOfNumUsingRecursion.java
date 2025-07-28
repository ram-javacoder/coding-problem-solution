package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FactorialOfNumUsingRecursion {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 2, 1, 6 };
		int result = sumOfnumbers(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("factorial of numbers : " + result);

	}

	public static int sumOfnumbers(int arr[], int n) {

		if (n < 1) {
			return 1;

		}

		int sum = arr[n - 1] * sumOfnumbers(arr, n - 1);

		return sum;
	}

}
