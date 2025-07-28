package com.javalearn17.collection.queue;

import java.util.PriorityQueue;

/*This problem is a classic Greedy Algorithm problem 
and is best solved using a Min-Heap (PriorityQueue in Java) 
to always combine the two smallest ropes first.*/

/*Input:[4, 3, 2, 6]
Output:29
Explanation:
Connect 2 + 3 = 5 → cost = 5
New ropes: [4, 5, 6]
Connect 4 + 5 = 9 → cost = 9
New ropes: [9, 6]
Connect 6 + 9 = 15 → cost = 15
Total cost = 5 + 9 + 15 = 29
*/


//Java Program to Connect Ropes with Minimum Cost

public class ConnetRopeWithMinimumCost {


	public static int minCostToConnectRopes(int[] ropes) {
        // Use PriorityQueue as a Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all rope lengths into the min-heap
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // Keep combining two smallest ropes until one rope is left
        while (minHeap.size() > 1) {
            int first = minHeap.poll(); // smallest rope
            int second = minHeap.poll(); // second smallest rope

            int cost = first + second;
            totalCost += cost;

            // Push the combined rope back into the heap
            minHeap.add(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        int result = minCostToConnectRopes(ropes);
        System.out.println("Minimum total cost to connect ropes: " + result);
    
    }
	
}
