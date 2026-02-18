package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum2 {

	public static void main(String[] args) {

		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int k = 2;
		int target = 0;

		List<List<Integer>> result = kSum(nums, k, target);
		System.out.println("All combinations of " + k + "-sum that equal target " + target + ":");
		result.forEach(System.out::println);

	}

	public static List<List<Integer>> kSum(int[] nums, int k, int target) {
		Arrays.sort(nums); // Sort for two-pointer and duplicate check
		return kSumHelper(nums, 0, k, target);
	}

	private static List<List<Integer>> kSumHelper(int[] nums, int start, int k, int target) {
		List<List<Integer>> result = new ArrayList<>();

		if (k == 2) {
			return twoSum(nums, start, target);
		}

		for (int i = start; i < nums.length - k + 1; i++) {
			// Skip duplicates
			if (i > start && nums[i] == nums[i - 1])
				continue;

			List<List<Integer>> subResults = kSumHelper(nums, i + 1, k - 1, target - nums[i]);
			for (List<Integer> subList : subResults) {
				subList.add(0, nums[i]);
				result.add(subList);
			}
		}

		return result;
	}

	private static List<List<Integer>> twoSum(int[] nums, int start, int target) {
		List<List<Integer>> result = new ArrayList<>();
		int left = start, right = nums.length - 1;

		while (left < right) {
			int sum = nums[left] + nums[right];

			if (sum == target) {
				result.add(new ArrayList<>(Arrays.asList(nums[left], nums[right])));
				left++;
				right--;

				while (left < right && nums[left] == nums[left - 1])   // Handling duplicate
					left++;
				while (left < right && nums[right] == nums[right + 1]) // Handling duplicate 
					right--;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		return result;
	}

}
