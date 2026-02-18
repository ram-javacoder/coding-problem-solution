package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorOperation {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 7, 3, 5);

		System.out.println("Input: " +numbers);
		
		// Collectors.minBy()
		Optional<Integer> minimumElement = numbers.stream().collect(Collectors.minBy(Comparator.comparingInt(c -> c)));
		System.out.println("Minimum element: " + minimumElement.orElse(null));

		// Collectors.maxBy()

		int maximumEle = numbers.stream().collect(Collectors.maxBy(Comparator.comparingInt(n -> n))).orElse(null);
		System.out.println("Maximum element: " + maximumEle);

		// counting

		Long totalEle = numbers.stream().collect(Collectors.counting());
		System.out.println("Total number of element: " + totalEle);
		
		

	}
}
