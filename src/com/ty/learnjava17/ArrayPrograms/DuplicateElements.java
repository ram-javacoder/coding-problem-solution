package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElements {

	public static void main(String args[]) {

		int arr[] = { 1, 5, 3, 1, 3, 4, 5 };

		System.out.println("Element present in Array :" + Arrays.toString(arr));
		HashSet<Integer> val = new HashSet<Integer>();

		System.out.println("Duplicate elements :");
		for (int i : arr) {

			if (!val.add(i)) {
				System.out.print(i + " ");

			}

		}
	}
}
