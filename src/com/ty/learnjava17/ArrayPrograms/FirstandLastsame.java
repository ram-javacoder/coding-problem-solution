package com.ty.learnjava17.ArrayPrograms;

/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
 */

public class FirstandLastsame {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 5, 7, 8, 6, 4, 1 };
		int i = 0;

		if (arr[i] == arr[arr.length - 1]) {

			System.out.println("TRUE ! first and last element same");
		} else {
			System.out.println("FALSE ! first and last element not same");
		}

	}

}
