package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FindMaxUnSortedSubArray {

	public static int[] findUnsortedSubarray(int[] nums) {
		
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		boolean flag = false;

		// Find the minimum in the unsorted part
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1])
				flag = true;
			if (flag)
				min = Math.min(min, nums[i]);
		}

		flag = false;
		// Find the maximum in the unsorted part
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] > nums[i + 1])
				flag = true;
			if (flag)
				max = Math.max(max, nums[i]);
		}

		
		int left, right;
		for (left = 0; left < nums.length; left++) {
			if (min < nums[left])
				break;
		}
		for (right = nums.length - 1; right >= 0; right--) {
			if (max > nums[right])
				break;
		}

		return right - left < 0 ? new int[0] : Arrays.copyOfRange(nums, left, right + 1);
	}

	public static void main(String args[]) {

		int arr[] = { 1, 3, 2, 4, 5, 7, 6, 8, 9 };
		int result[] = findUnsortedSubarray(arr);

		System.out.println(Arrays.toString(result));

	}

}
