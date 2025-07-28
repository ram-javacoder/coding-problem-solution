package com.javalearn17.collection.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PeekPollOperation {

	public static void main(String[] args) {

		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(100);

		queue.add(67);
		queue.add(45);
		queue.add(10);
		// queue.add(null);  NullPointerException will occur
		queue.add(45);

		for (Integer integer : queue) {
			System.out.println(integer);
		}

		System.out.println("Returing top element from the queue : " +queue.peek());
		queue.poll();
		System.out.println("Returing top element after Poll : " +queue.peek());
		
	}
}
