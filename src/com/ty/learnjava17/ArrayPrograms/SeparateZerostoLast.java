package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class SeparateZerostoLast {

	public static void main(String[] args) {

		// separate all zeros to the last of the array using a single loop
		int arr[] = { 6, 0, 9, 0, 3, 5, 0 };
		System.out.println("Input : " + Arrays.toString(arr));
		int noZeroIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				int temp = arr[i];
				arr[i] = arr[noZeroIndex];
				arr[noZeroIndex] = temp;
				noZeroIndex++;

			}

		}

		System.out.println("Output : " + Arrays.toString(arr));

	}
}
