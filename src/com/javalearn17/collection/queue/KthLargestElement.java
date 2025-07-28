package com.javalearn17.collection.queue;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static int findKthLargest(int[] nums, int k) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		
		for (int num : nums) {
			minHeap.offer(num); 
			if (minHeap.size() > k) {
				minHeap.poll(); 
			}
		}

		
		return minHeap.peek();
	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 5, 6, 4 ,10};
		int k = 2; //Find the 2nd largest element
		int result = findKthLargest(nums, k);
		System.out.println(k + "th largest element is: " + result);
	}
}
