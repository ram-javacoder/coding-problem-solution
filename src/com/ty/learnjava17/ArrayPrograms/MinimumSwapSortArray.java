package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumSwapSortArray {

	public static int minSwaps(int[] arr) {
		int n = arr.length;
		int swaps = 0;

		
		int[][] pair = new int[n][2];
		for (int i = 0; i < n; i++) {
			pair[i][0] = arr[i]; // value
			pair[i][1] = i; // original index
		}

		// Step 2: Sort the array based on value
		Arrays.sort(pair, Comparator.comparingInt(a -> a[0]));

		// Step 3: Track visited positions
		boolean[] visited = new boolean[n];

		// Step 4: Traverse cycles
		for (int i = 0; i < n; i++) {
			if (visited[i] || pair[i][1] == i)
				continue;

			int cycleLength = 0;
			int j = i;

			while (!visited[j]) {
				visited[j] = true;
				j = pair[j][1]; // move to correct index
				cycleLength++;
			}

			swaps += (cycleLength - 1);
		}

		return swaps;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4 };
		System.out.println("Minimum swaps required: " + minSwaps(arr));
	}

	
}
