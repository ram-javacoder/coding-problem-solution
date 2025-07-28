package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class MoveElementLeftRemoveTen {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 5, 10, 3, 10 };
		int index = 0;
		System.out.println("Original Array : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 10) {
				arr[index++] = arr[i];

			}

		}

		while (index < arr.length) {

			arr[index] = 0;
			index++;
		}

		System.out.println("After shifting : " + Arrays.toString(arr));

	}
}
