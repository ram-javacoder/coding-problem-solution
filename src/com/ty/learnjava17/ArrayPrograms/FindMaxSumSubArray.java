package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FindMaxSumSubArray {

	public static void main(String[] args) {

		int[] originalArray = { 2,3,-8,7,-1,2,3};
		System.out.println("Original Array : " + Arrays.toString(originalArray));
		findMaxSumSubArray(originalArray);

	}

	private static void findMaxSumSubArray(int[] originalArray) {

		int max = Integer.MIN_VALUE;
		int maxSumSubArray[] = null;
		for (int i = 0; i < originalArray.length; i++) {

			int currentSum = 0;

			for (int j = i; j < originalArray.length; j++) {

				currentSum += originalArray[j];
				if (currentSum > max) {
					max = currentSum;
					maxSumSubArray = Arrays.copyOfRange(originalArray, i, j + 1);
				}

			}

		}

		System.out.println("Maximum sum of Sub Array : " + Arrays.toString(maxSumSubArray));
		System.out.println("Sum : " + max);
	}
}