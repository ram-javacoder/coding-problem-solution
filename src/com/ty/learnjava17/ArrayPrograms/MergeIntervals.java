package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public static int[][] merge(int[][] intervals) {
		if (intervals.length == 0)
			return new int[0][];

		// Step 1: Sort intervals by start time
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

		List<int[]> result = new ArrayList<>();

		// Step 2: Iterate through intervals
		int[] current = intervals[0];
		result.add(current);

		for (int[] interval : intervals) {
			
			int currentEnd = current[1];
			int nextStart = interval[0];
			int nextEnd = interval[1];

			if (nextStart <= currentEnd) {
				// Overlap → merge
				current[1] = Math.max(currentEnd, nextEnd);
			} else {
				// No overlap → move current
				current = interval;
				result.add(current);
			}
		}

		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args) {
		int[][] intervals1 = { {1,3},{2,6},{8,10},{15,18} }; // {{1,3},{2,6},{8,10},{15,18}}
		int[][] intervals2 = { { 1, 4 }, { 4, 5 } };

		System.out.println("Merged 1: " + Arrays.deepToString(merge(intervals1)));
		System.out.println("Merged 2: " + Arrays.deepToString(merge(intervals2)));
	}

}
