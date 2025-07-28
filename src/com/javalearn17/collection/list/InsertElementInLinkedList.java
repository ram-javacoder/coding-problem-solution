package com.javalearn17.collection.list;

import java.util.LinkedList;
import java.util.List;

public class InsertElementInLinkedList {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(12);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);

		int position = numbers.indexOf(6);
		
		if (position != -1) {
			
			numbers.add(position+1, 3);
		}
		
		System.out.println(numbers);
		
	}

}
