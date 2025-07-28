package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ContainDuplicateReturnTRUE {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 1, 4, 5, 2 };

		boolean allUnique = Arrays.stream(arr).mapToObj(n -> n)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()))
				.entrySet().stream().anyMatch(entry -> entry.getValue() > 1);
				
		if (allUnique) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		

	}
}
