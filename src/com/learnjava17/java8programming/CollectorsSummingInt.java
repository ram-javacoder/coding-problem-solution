package com.learnjava17.java8programming;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSummingInt {

	public static void main(String[] args) {

		List<Integer> nums = List.of(1, 2, 3, 4, 5);
		IntSummaryStatistics sums = nums.stream().collect(Collectors.summarizingInt(Integer::intValue));

		System.out.println("Total sum of elements: " + sums.getSum());
		System.out.println("Average of elements: " + sums.getAverage());
		System.out.println("Minimum Element: " + sums.getMin());
		System.out.println("Maximum Element: " + sums.getMax());
		System.out.println("Number of elements: " + sums.getCount());

		/*
		 * What is IntSummaryStatistics? It's a utility class that gives you:
		 * 
		 * getSum() → Total of all elements
		 * 
		 * getAverage() → Average value
		 * 
		 * getMin() → Minimum
		 * 
		 * getMax() → Maximum
		 * 
		 * getCount() → Number of elements
		 */

	}
}
