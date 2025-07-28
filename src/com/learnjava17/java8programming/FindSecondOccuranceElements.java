package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindSecondOccuranceElements {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 11, 5, 2, 6, 3, 7, 8, 4, 9);

		Map<Integer, Long> frequencyMap = numbers.stream()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		numbers.stream().filter(n -> frequencyMap.get(n) > 1) // value > 1
		
				.distinct().forEach(number -> System.out.println("Second occurrence of " + number));

		
		/*
		 * for (Map.Entry<Integer, Long> entry : frequencyMap.entrySet()) {
		 * 
		 * if (entry.getValue() > 1) {
		 * 
		 * System.out.println(entry.getKey() + " : " + entry.getValue()); } }
		 */
	}

}
