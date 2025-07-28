package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class PrintDuplicateElementOnly {

	public static void main(String[] args) {

		Integer arr[] = { 1,12,0,3,1,12,6,1};
		System.out.println("Array element before sorting :" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("\nArray element after sorting :" + Arrays.toString(arr));
		Integer temp[] = new Integer[arr.length];
		int m = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					boolean isPresent = Arrays.asList(temp).contains(arr[i]);
					if (isPresent == false) {

						temp[m++] = arr[i];
					} else {
						break;
					}

				}
			}
		}
		System.out.println("\nDuplicate element which are present in Array :");

		for (int i = 0; i < m; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
