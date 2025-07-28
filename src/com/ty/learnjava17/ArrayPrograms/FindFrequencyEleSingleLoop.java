package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FindFrequencyEleSingleLoop {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 4 ,5, 5,6 };
		int k = 0;
		int frequency = 1;
		Arrays.sort(arr);
		for (int i = k + 1; i < arr.length; i++) {

			if (arr[k] == arr[i]) {
				frequency++;

			} else {

				System.out.println(arr[k] + " -> " + frequency);
				k = i;
				frequency = 1;
			}

		}
		System.out.println(arr[k] + " -> " + frequency);

	}
}
