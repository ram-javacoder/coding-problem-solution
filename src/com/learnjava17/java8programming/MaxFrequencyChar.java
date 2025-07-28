package com.learnjava17.java8programming;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxFrequencyChar {
	public static void main(String[] args) {

		String str = "Software Development";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		Optional<Map.Entry<Character, Long>> maxFrequency = map.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry<Character, Long>::getValue).reversed()).findFirst();

		
		maxFrequency.ifPresent(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

	}
}
