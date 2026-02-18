package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

//Print Subarray of Size k with Maximum Sum:
public class FindMaxSumSubArrayUsingSlidingWindow {

	public static void main(String[] args) {

		int arr[] = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		System.out.println("Input : " + Arrays.toString(arr));
		findMaxSumSubArray(arr, k);

	}

	private static void findMaxSumSubArray(int[] arr, int k) {
		int windowSum = 0, maxSum = 0;
		int start = 0;
		for (int i = 0; i < k; i++) {

			windowSum += arr[i];

		}

		maxSum = windowSum;
		for (int i = k; i < arr.length; i++) {

			windowSum += arr[i] - arr[i - k];
			if (windowSum > maxSum) {
				maxSum = windowSum;
				start = i - k + 1;
			}

		}

		System.out.println("Maximum sum: " + maxSum);
		System.out.println("Maximum sum sub array: " + Arrays.toString(Arrays.copyOfRange(arr, start, start + k)));

	}

}
