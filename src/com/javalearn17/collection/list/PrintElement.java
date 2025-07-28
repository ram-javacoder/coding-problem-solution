package com.javalearn17.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PrintElement {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("SQL");
		list.add("Pyhon");
		list.add("Java Script");
		list.add("HTML");

		// printing
		System.out.println(list);

		// for loop
		System.out.println();
		System.out.println("Printing element using forLoop:");
		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + " ");
		}

		// Printing element using foreach

		System.out.println("\nPrinting element using forEach:");

		for (String string : list) {
			System.out.print(string + " ");
		}

		// Printing object using iterator
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);

		}
		// Printing element using List Iterator
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();

			System.out.println(string);
		}

		// 6 Previous method
		System.out.println();
		while (listIterator.hasPrevious()) {
			String previous = listIterator.previous();
			System.out.print(previous + ", ");

		}

	}

}
