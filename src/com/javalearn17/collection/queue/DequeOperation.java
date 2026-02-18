package com.javalearn17.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//Basic implementation
public class DequeOperation {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.addFirst(10);
		deque.addLast(20);
		deque.addFirst(30);
		deque.addLast(40);

		System.out.println("Deque: " + deque);

		deque.removeFirst();  //pollFirst
		deque.removeLast();   //pollLast

		System.out.println("Deque after removing first and last elements: " + deque);

		System.out.println("First element: " + deque.getFirst());
		System.out.println("Last element: " + deque.getLast());

		deque.addFirst(50);
		deque.addLast(60);
		
		System.out.println("Current elements: " +deque);
		
		System.out.println("Elements in decending order:");
		
		
		Iterator<Integer> itr =  deque.descendingIterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		
	}
}
