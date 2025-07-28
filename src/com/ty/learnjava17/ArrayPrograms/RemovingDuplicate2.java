package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class RemovingDuplicate2 {   // or Print unique element only 

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 2, 1, 1, 8, 10,10,10 };
		System.out.println("Array element before sorting :" + Arrays.toString(arr));
		Arrays.sort(arr); // Array Element will be Sorted
		System.out.println("Array element after sortig :" + Arrays.toString(arr));
		int j = 0;
		int temp[] = new int[arr.length];

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {

				temp[j++] = arr[i];
			}

		}
		temp[j++] = arr[arr.length - 1];

		System.out.println("Element after removing duplicate");
		for (int i = 0; i < j; i++) {

			System.out.print(temp[i] + " ");
		}

	}

}
