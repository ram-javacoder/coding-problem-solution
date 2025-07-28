package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;

public class FindSecondSmallestElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 8, 1, 3, 7, 4, 6);

		numbers.stream().distinct() // Optional: Remove duplicates
				.sorted().skip(1) // Skip the first element (smallest)
				.findFirst().ifPresentOrElse(num -> System.out.println("Second smallest number -> " + num),
						() -> System.out.println("No second smallest element found."));

	}
}
