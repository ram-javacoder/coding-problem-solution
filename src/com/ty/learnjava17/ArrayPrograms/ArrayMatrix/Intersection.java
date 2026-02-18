package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

import java.util.ArrayList;
import java.util.Arrays;
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

		/*
		 * System.out.print("Output: ["); for (int i = 0; i < output.size(); i++) {
		 * int[] interval = output.get(i); System.out.print("[" + interval[0] + "," +
		 * interval[1] + "]"); if (i < output.size() - 1) System.out.print(", "); }
		 * System.out.println("]");
		 */
	
		System.out.print("[ ");
		for (int[] i : output) {
			
			System.out.print(Arrays.toString(i));
		}
		System.out.print(" ]");
		
	}
}




/*
 * You are given two lists of intervals (A and B), and you need to find all
 * overlapping intervals between them.
 * 
 * A = { [1,3], [4,6], [8,10] }
 * 
 * B = { [2,4], [5,8], [9,11] }
 * 
 * 
 * i → pointer for list A
 * 
 * j → pointer for list B
 * 
 * result → stores the overlapping intervals
 * 
 * 
 * 
 * How it Works:
 * 
 * We start comparing intervals A[i] and B[j].
 * 
 * Find overlap start → start = max(A[i][0], B[j][0]) This means the overlap
 * starts at the later start point.
 * 
 * Find overlap end → end = min(A[i][1], B[j][1]) This means the overlap ends at
 * the earlier end point.
 * 
 * If start <= end, then we have an actual overlap, so we add [start, end] to
 * our result.
 * 
 * 
 * 
 * Moving Forward:
 * 
 * After checking one pair, we move the pointer whose interval ends first,
 * because that interval cannot overlap with future intervals anymore.
 * 
 * if (A[i][1] < B[j][1]) { i++; } else { j++; }
 * 
 * 
 * 
 * Example Walkthrough:
 * 
 * Step 1: Compare [1,3] (A) and [2,4] (B)
 * 
 * start = max(1,2) = 2
 * 
 * end = min(3,4) = 3
 * 
 * ✅ Overlap → [2,3]
 * 
 * Since 3 < 4, move i → now A points to [4,6].
 * 
 * 
 * Step 2: Compare [4,6] (A) and [2,4] (B)
 * 
 * start = max(4,2) = 4
 * 
 * end = min(6,4) = 4
 * 
 * ✅ Overlap → [4,4] (just touching at point 4)
 * 
 * Since 6 > 4, move j → now B points to [5,8].
 * 
 * 
 * 
 * step 3 an step 4 ...
 * 
 */



