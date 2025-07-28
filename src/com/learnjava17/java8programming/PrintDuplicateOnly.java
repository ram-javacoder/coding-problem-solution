package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateOnly {

	public static void main(String[] args) {

		List<String> ele = Arrays.asList("apple", "mango", "Banana", "apple", "Pineapple", "mango");
		Map<String, Long> duplicate = ele.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		duplicate.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println("Duplicate Elements: " + entry.getKey()));

	}

}

/*
Duplicate Elements: apple
Duplicate Elements: mango

*/