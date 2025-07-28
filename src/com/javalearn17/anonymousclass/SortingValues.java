package com.javalearn17.anonymousclass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingValues {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ram", "Mohan", "Poongavanam", "Lakshman", "Mohan", "Lokesh");

		// Sort the list using an anonymous inner class
		names.sort(new Comparator<String>() {

			public int compare(String o1, String o2) {

				return o1.compareTo(o2);
			}

		});

		// Sort the list using a lambda expression
		// names.sort((a,b) -> a.compareTo(b));

		System.out.println(names);
	}

}
