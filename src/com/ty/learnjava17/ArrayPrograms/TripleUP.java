package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

/* 
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
*/



public class TripleUP {
	public static void main(String[] args) {

		int arr[] = {5,3, 2, 3, 4 };

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			if (i == arr.length - 2) {

				flag = false;
				break;
			}

			if ((arr[i] + 1 == arr[i + 1])) {

				if (arr[i + 1] + 1 == arr[i + 2]) {

					flag = true;
					break;
				}
			}

		}

		System.out.println("Original elements : " + Arrays.toString(arr));
		System.out.println("Output : " + flag);

	}

}
