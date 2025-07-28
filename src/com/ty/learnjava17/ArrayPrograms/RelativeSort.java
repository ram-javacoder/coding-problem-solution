package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class RelativeSort {

	public static void main(String[] args) {

		int arr1[] = { 3, 2, 1, 2, 4, 5, 4, 6 };
		int arr2[] = { 5, 3, 4, 6 };
		System.out.println("Array-1 elements : " + Arrays.toString(arr1));
		System.out.println("Array-2 elements : " + Arrays.toString(arr2));

		int result[] = relativeSort(arr1, arr2);
		System.out.println("Relative sorted Array :" + Arrays.toString(result));
	}

	private static int[] relativeSort(int[] arr1, int[] arr2) {
		int k = 0;
		for (int i = 0; i < arr2.length; i++) {
			int temp = 0;
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					temp = arr1[k];
					arr1[k] = arr1[j];
					arr1[j] = temp;
					k = k + 1;

				}

			}

		}

		for (int i = k; i < arr1.length; i++) {
			int temp = 0;
			for (int j = k; j < arr1.length - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {
					temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}

		}

		return arr1;

	}

}
