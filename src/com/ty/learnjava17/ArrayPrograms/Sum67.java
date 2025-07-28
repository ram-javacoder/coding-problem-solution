package com.ty.learnjava17.ArrayPrograms;

/*

Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6
and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4

*/

import java.util.Arrays;

public class Sum67 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 6, 99, 99, 7, 2, 8 };

		int sixIndex = 0;
		int sevenIndex = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 6) {
				sixIndex = i;

			} else if (arr[i] == 7) {
				sevenIndex = i;
			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (i < sixIndex || i > sevenIndex) {
				sum = sum + arr[i];
			}
		}
		System.out.println("Original Array Elements : " + Arrays.toString(arr));
		System.out.println("Sum of Elements : " + sum);

	}
}
