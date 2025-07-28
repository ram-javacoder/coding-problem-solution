package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FindBigDiff {

	public static void main(String[] args) {

		int arr[] = { 7, 2, 10, 9,15 };
		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				int diff = arr[i] - arr[j];
				if (diff > max) {
					max = diff;
				}

			}

		}
		System.out.println("Elements in Array : " + Arrays.toString(arr));
		System.out.println("Biggest difference : " + max);

	}
}
