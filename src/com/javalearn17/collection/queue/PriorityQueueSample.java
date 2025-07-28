package com.javalearn17.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueSample {

	public static void main(String[] args) {


		PriorityQueue<Integer> ele = new PriorityQueue<Integer>();
		ele.add(6);
		ele.add(7);
		ele.add(8);
		ele.add(9);
		ele.add(10);
		ele.add(1);
		ele.add(1); //Duplicate Allowed 
		ele.add(1); //Duplicate Allowed
		ele.add(2);
		ele.add(3);
		ele.add(4);
		ele.add(5);
		
		System.out.println(ele);
		System.out.println(ele.poll());
		System.out.println(ele);
		System.out.println(ele.poll());
		System.out.println(ele);
	

	}

}
