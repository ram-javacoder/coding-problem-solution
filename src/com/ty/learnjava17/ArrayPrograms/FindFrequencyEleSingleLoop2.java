package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FindFrequencyEleSingleLoop2 {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 4, 5, 5, 7, 7 };
		System.out.println("Input: " + Arrays.toString(arr));
		Arrays.sort(arr);
		frequencyElement(arr);
	}

	private static void frequencyElement(int[] arr) {
		int count = 1;
		int i;
		for (i = 1; i < arr.length; i++) {

			if (arr[i] == arr[i - 1]) {
				count++;

			} else {

				System.out.println(arr[i - 1] + " -> " + count);
				count = 1;
			}

		}

		System.out.println(arr[arr.length - 1] + " -> " + count);

	}

}
