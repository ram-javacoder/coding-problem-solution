package com.ty.learnjava17.ArrayPrograms;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Currency;

public class FindSubArrayWithSum {

	public static void main(String[] args) {

		int originalArray[] = { 1, 2, 3, 7, 5 };
		int target = 12;

		System.out.println("Original Array :" + Arrays.toString(originalArray));
		System.out.println("target : " + target);
		System.out.println("Subarrays with matching sum:");
		findSubArrayWithSpecifiedSum(originalArray, target);

	}

	private static void findSubArrayWithSpecifiedSum(int[] originalArray, int target) {

		boolean isTargetFound = false;
		for (int i = 0; i < originalArray.length; i++) {

			int currentSum = 0;

			for (int j = i; j < originalArray.length; j++) {

				currentSum += originalArray[j];
				if (currentSum == target) {

					isTargetFound = true;
					System.out.println(Arrays.toString(Arrays.copyOfRange(originalArray, i, j + 1)));
				}
			}
		}
		if (!isTargetFound) {
			System.out.println("No subarray matches the target sum " + target);
		}

	}
}
