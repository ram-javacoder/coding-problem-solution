package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class FindFirstRepeating {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2, 5, 3, 7, 8,1);
		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>();
		Integer firstRepeating = numbers.stream().filter(n -> !num.add(n)).findFirst().orElse(null);
		Integer lastRepeating = numbers.stream().filter(n -> !num.add(n)).reduce((first, last) -> last).orElse(null);

		System.out.println("Original numbers : " + numbers);
		System.out.println("First repeating number : " + firstRepeating);
		System.out.println("last repeating number : " + lastRepeating);
	}

}
