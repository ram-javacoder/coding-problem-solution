package com.ty.learnjava17.ArrayPrograms;

//find the start and end indexes of a contiguous subarray whose elements add up to the target sum.

import java.util.HashMap;

public class FindIndexesSubArray {

	public static void main(String[] args) {
		int[] arr = { 6, 5, 9, 4, 3, 1, 7, 8, 2, 10 };
		int sum = 16;

		HashMap<Integer, Integer> map = new HashMap<>();
		int currentSum = 0;
		int start = 0;
		int end = -1;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];

			if (currentSum == sum) {
				end = i;
				break;
			}

			if (map.containsKey(currentSum - sum)) {
				start = map.get(currentSum - sum) + 1;
				end = i;
				break;
			}

			map.put(currentSum, i);
		}

		if (end == -1) {
			System.out.println("No subarray found with the given sum");
		} else {
			System.out.println("The subarray with the given sum is from index " + start + " to index " + end);
		}
	}
}
