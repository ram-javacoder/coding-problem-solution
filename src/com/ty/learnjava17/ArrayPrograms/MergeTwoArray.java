package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 6, 7, 8 };

		int mergeArr[] = new int[arr1.length + arr2.length];

		for (int i = 0, a = 0, b = 0; i < mergeArr.length; i++) {

			if (a < arr1.length) {

				mergeArr[i] = arr1[a++];
			} else if (b < arr2.length) {

				mergeArr[i] = arr2[b++];
			}
		}

		System.out.println(Arrays.toString(mergeArr));
	
	}

}
