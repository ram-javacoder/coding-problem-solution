package com.ty.learnjava17.ArrayPrograms;

public class ArraySumRecursion {

	// Recursive method to calculate sum of array elements
	public static int sumOfArray(int[] arr, int n) {

		// Base case: when array is empty or fully processed
		if (n <= 0) {
			return 0;
		}
		// Recursive case: sum of current element and sum of rest

		return arr[n - 1] + sumOfArray(arr, n - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int sum = sumOfArray(arr, arr.length);

		System.out.println("Sum of array elements: " + sum);
	}
}
