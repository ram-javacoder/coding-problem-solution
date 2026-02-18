package com.javalearn17.DataStructureAndAlgorithms;

/*The goal is to count how many merge operations are needed to end up with one final block.

  The merging uses a greedy strategy using a PriorityQueue (Min-Heap) to always pick the two smallest blocks first.
*/

/*n = 6

Initial blocks: [2, 2, 2, 2, 2, 2]
		
pq = [2, 2, 2, 2, 2, 2]
merges = 0

Step 1
Pick: 2 and 2
Merge → 4
Add back: [2, 2, 2, 2, 4]
merges = 1

Step 2
Pick: 2 and 2
Merge → 4
Add back: [2, 4, 4, 4]
merges = 2

Step 3
Pick: 2 and 4 → Not equal
Put back 4, convert 2 → nextPowerOfTwo(2) = 4
Add back: [4, 4, 4, 4]
merges = 3

Step 4
Pick: 4 and 4
Merge → 8
Add back: [4, 4, 8]
merges = 4

Step 5
Pick: 4 and 4
Merge → 8
Add back: [8, 8]
merges = 5


Step 6
Pick: 8 and 8
Merge → 16
Add back: [16]
merges = 6


Only one block left → DONE!

Input: 6
Output (number of merges): 6
				*/



import java.util.PriorityQueue;

public class CountMerges {

	public static int countMerges(int n) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		
		for (int i = 0; i < n; i++) {
			pq.add(2);
		}

		int merges = 0;

		while (pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();

			if (first == second) {
				pq.add(first * 2); // Merge them
				merges++;
			} else {
				// If not equal, put second back, increment first to next mergeable power
				pq.add(second);
				pq.add(nextPowerOfTwo(first));
				merges++;
			}
		}

		return merges;
	}

	// Helper to get next power of 2 greater than a given value
	private static int nextPowerOfTwo(int x) {
		int power = 2;
		while (power <= x) {
			power *= 2;
		}
		return power;
	}

	public static void main(String[] args) {

		int blocks = 6;

		System.out.println("Input: " + blocks);
		System.out.println("Output (number of merges): " + countMerges(blocks));
	}

}
