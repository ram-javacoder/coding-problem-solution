package com.ty.learnjava17.ArrayPrograms;


/* Given a non-empty array of ints, return a new array containing the elements from the original array that come 
 * after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid 
 * in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3] 

*/

import java.util.Arrays;

public class NexttoFour {

	public static void main(String[] args) {

		int arr[] = { 4, 1, 4, 2, 6, 10 };
		int i = 0, count = 0;
		while (i < arr.length) {

			if (arr[i] == 4) {
				count = i;
			}
			i++;

		}
		int increase = count + 1;
		System.out.println("Original elements : " + Arrays.toString(arr));
		if (count == arr.length - 1) {
			System.out.println("No elements present after last 4!");

		} else {

			System.out.println("Elements which are present after last four :");

			while (increase < arr.length) {

				System.out.print(arr[increase] + " ");
				increase++;
			}

		}

	}

}
