package com.javalearn17.collection.list;

//Reverse List without using Collections.sort()

import java.util.LinkedList;

public class ReversingObj2 {

	public static void main(String[] args) {

		LinkedList<Integer> obj = new LinkedList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println("Before reversing: " + obj);

		int i = 0;
		int count = obj.size() - 1; // Adjust count to point to the last element
		while (i < count) { // Change condition to i < count
			Integer temp = obj.get(i);
			obj.set(i, obj.get(count));
			obj.set(count, temp);
			i++;
			count--; // Decrement count
		}

		System.out.println("After reversing: " + obj);
	}
}
