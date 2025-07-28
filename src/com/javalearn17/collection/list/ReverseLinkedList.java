package com.javalearn17.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> elements = new LinkedList<>();
		elements.add(1);
		elements.add(2);
		elements.add(3);
		elements.add(4);
		elements.add(5);

		System.out.println("Original Elements : " + elements);
		reverseList(elements);

	}

	public static void reverseList(LinkedList<Integer> list) {

		// LinkedList<Integer> result = new LinkedList<>();

		ListIterator<Integer> li = list.listIterator(list.size());

		while (li.hasPrevious()) {

			System.out.println(li.previous());

		}

	}

}
