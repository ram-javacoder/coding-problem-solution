package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {

		int[] arr = {3, 7, 1, 2, 9, 4, 5};

		int n = 8;

		int missing = findMissingNumber(arr, n);

		System.out.println("Missing Number : " + missing);
	}

	private static int findMissingNumber(int[] arr, int n) {

		int expectedSum = n * (n + 1) / 2;

		int actualSum = 0;

		for (int num : arr) {
			actualSum += num;
		}

		return expectedSum - actualSum;
	}
}
