package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 34, 56, 21, 44,12,44);

		Integer secondLargest = numbers.stream().distinct() // Optional: Remove duplicates
				.sorted((a, b) -> b.compareTo(a)) // Sort in descending order
				.skip(1) // Skip the first element (largest)
				.findFirst().orElse(null);

		/*
		 * Alternative approach:
		 * 
		 * Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(
		 * 1).findFirst() .ifPresentOrElse(num ->
		 * System.out.println("Second largest element : " +num), () ->
		 * System.out.println("No Second Largest element"));
		 */
		
		
		if (secondLargest != null) {
			System.out.println("Second largest number: " + secondLargest);
		} else {
			System.out.println("No second largest element found.");
		}
	}
}
