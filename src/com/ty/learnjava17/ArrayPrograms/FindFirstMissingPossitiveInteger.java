package com.ty.learnjava17.ArrayPrograms;

public class FindFirstMissingPossitiveInteger {

	public static int firstMissingPositive(int[] nums) {
		int n = nums.length;

		
		for (int i = 0; i < n; i++) {
			// Only swap when nums[i] is in [1, n] and not already in correct position
			while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
				// Swap nums[i] with nums[nums[i] - 1]
				int temp = nums[i];
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;
			}
		}

		// Step 2: Find the first missing positive
		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}

		return n + 1;
	}

	public static void main(String[] args) {
		int[] nums1 = { 45, 2, 0,1 };
		int[] nums2 = { 3, 4, -1, 1 };
		int[] nums3 = { 7, 8, 9, 11, 12 };

		System.out.println(firstMissingPositive(nums1)); // Output: 3
		System.out.println(firstMissingPositive(nums2)); // Output: 2
		System.out.println(firstMissingPositive(nums3)); // Output: 1
	}

}
