package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindAllDuplicateString {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("java", "sql", "css", "python", "java", "javascript", "sql");
		Map<String, Long> occurance = strings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Duplicate String: ");
	
		 occurance.entrySet().stream()
         .filter(entry -> entry.getValue() > 1)
         .forEach(entry -> System.out.println(entry.getKey()));
	}
	

}
