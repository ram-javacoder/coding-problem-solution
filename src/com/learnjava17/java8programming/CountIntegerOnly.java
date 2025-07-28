package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountIntegerOnly {

	public static void main(String[] args) {

		Object num[] = { 1, 'a', 2, 3, 'b', 1, 2, 4, 'c', 3 };

		Map<Integer, Long> numbers = Arrays.stream(num).filter(n -> n instanceof Integer).map(n -> (Integer) n)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		System.out.println("Frequency of numbers : " + numbers);
	}
}

