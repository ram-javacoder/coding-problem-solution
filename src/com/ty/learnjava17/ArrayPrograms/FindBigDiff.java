package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FindBigDiff {

	public static void main(String[] args) {

		int arr[] = { 7, 2, 10, 9, 15 };
		int maxDifferent = findMaxDifferent(arr);
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println("Maximum difference: " + maxDifferent);
	}

	private static int findMaxDifferent(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		for (int i : arr) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}

		}

		return max - min;
	}
}
