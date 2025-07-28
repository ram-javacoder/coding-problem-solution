package com.ty.learnjava17.ArrayPrograms;

/* 
Return a version of the given array where each zero value in the array is replaced by the largest odd 
value to the right of the zero in the array. If there is no odd value to the right of the zero, leave 
the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
*/



import java.util.Arrays;
import java.util.Iterator;

public class ZeroMax {

	public static void main(String[] args) {

		int arr[] = {0, 4, 0, 3 };
		System.out.println("Original Elements : " + Arrays.toString(arr));

		
		for (int i = 0; i < arr.length; i++) {
			
			int max = Integer.MIN_VALUE;
			if (arr[i] == 0) {

				for (int j = i+1; j < arr.length; j++) {

					if (arr[j] % 2 != 0) {

						if (arr[j] > max) {
							max = arr[j];
							arr[i] = max;
						}
						
					}

				}

			}
		}
		System.out.println("After replacing maximum Odd : " + Arrays.toString(arr));

	}
}
