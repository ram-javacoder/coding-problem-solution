package com.learnjava17.java8programming;

import java.util.Arrays;

public class CheckTwoArrayContainSameElements {

	public static void main(String[] args) {

		int a[] = { 3, 1, 2 };
		int b[] = { 1, 2, 3 };

		checkTwoArrayContainSameElements(a, b);

	}

	private static void checkTwoArrayContainSameElements(int[] a, int[] b) {
		int arr_1[] = Arrays.stream(a).sorted().toArray();
		int arr_2[] = Arrays.stream(b).sorted().toArray();

		if (Arrays.equals(arr_1, arr_2)) {
			System.out.println("Both array contains same elements");

		} else if (arr_1.length != arr_2.length) {
			System.out.println("Both array contains different elements");
		}

		else {

			System.out.println("Both array contains different elements");
		}

	}
}
