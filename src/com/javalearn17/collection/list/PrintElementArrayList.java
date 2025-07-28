package com.javalearn17.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PrintElementArrayList {

	public static void main(String[] args) {

		List<Integer> integer = new ArrayList<Integer>();
		integer.add(1);
		integer.add(2);
		integer.add(3);
		integer.add(4);
		integer.add(5);

		// Printing the element
		System.out.println(integer);

		// using for loop
		System.out.println();
		for (int i = 0; i < integer.size(); i++) {

			System.out.print(integer.get(i) + " ,");
		}

		// using foreach loop
		System.out.println();
		for (Integer integer2 : integer) {
			System.out.print(integer2 + "");
		}

		// 4.
		System.out.println();
		Iterator<Integer> iterator = integer.iterator();
		while (iterator.hasNext()) {
			// Way-1
			// Integer next=iterator.next();
			// System.out.println(next);
			// way-2
			System.out.println(iterator.next());

		}
		// 5
		ListIterator<Integer> listIterator = integer.listIterator();

		System.out.println();
		while (listIterator.hasNext()) {
			Integer next = listIterator.next();
			System.out.print(next + ", ");
		}

		// 6
		System.out.println();
		while (listIterator.hasPrevious()) {
			Integer previous = listIterator.previous();
			System.out.print(previous + ", ");
		}

		// 7
		System.out.println();
		integer.stream().forEach(e -> System.out.print(e + ", "));

	}

}
