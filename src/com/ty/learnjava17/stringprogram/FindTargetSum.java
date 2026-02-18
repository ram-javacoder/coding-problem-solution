package com.ty.learnjava17.stringprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTargetSum {

	public static void main(String[] args) {

		int[] arr = { 0, 2, 5, 3, 1, 3, 6 };
		int target = 6;

		Set<Integer> seen = new HashSet<>();
		List<int[]> pairs = new ArrayList<int[]>();

		for (int num : arr) {
			int complement = target - num;

			if (seen.contains(complement)) {
				// System.out.println("Pair found: " + num + " + " + complement + " = " +
				// target);
				pairs.add(new int[] { complement, num });

			}
			seen.add(num);
		}

		if (pairs.size() != 0) {

			for (int[] i : pairs) {

				System.out.println(Arrays.toString(i));
			}

		} else {

			System.out.println("No pair found");

		}

	}

}
