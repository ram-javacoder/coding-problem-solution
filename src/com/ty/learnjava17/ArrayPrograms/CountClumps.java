package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

/*Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
*Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
*/

public class CountClumps {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 1, 1 };
		System.out.println("Original elements : " + Arrays.toString(arr));
		int clump = findNumberOfClump(arr);
		System.out.println("Number of Clump : " + clump);

	}

	public static int findNumberOfClump(int arr[]) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i + 1] == arr[i] && !flag) {
				count++;
				flag = true;
			} else if (arr[i] != arr[i + 1]) {
				flag = false;

			}

		}

		return count;
	}

}
