package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static List<int[]> intervalIntersection(int[][] A, int[][] B) {
		List<int[]> result = new ArrayList<>();
		int i = 0, j = 0;

		while (i < A.length && j < B.length) {
			
			int start = Math.max(A[i][0], B[j][0]);
			int end = Math.min(A[i][1], B[j][1]);

			// If there's an overlap, add to result
			if (start <= end) {
				result.add(new int[] { start, end });
			}

			// Move the pointer with the smaller end
			if (A[i][1] < B[j][1]) {
				i++;
			} else {
				j++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] A = { { 1, 3 }, { 4, 6 }, { 8, 10 } };
		int[][] B = { { 2, 4 }, { 5, 8 }, { 9, 11 } };

		List<int[]> output = intervalIntersection(A, B);

		System.out.print("Output: [");
		for (int i = 0; i < output.size(); i++) {
			int[] interval = output.get(i);
			System.out.print("[" + interval[0] + "," + interval[1] + "]");
			if (i < output.size() - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
