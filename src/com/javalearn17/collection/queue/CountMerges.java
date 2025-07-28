package com.javalearn17.collection.queue;

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
