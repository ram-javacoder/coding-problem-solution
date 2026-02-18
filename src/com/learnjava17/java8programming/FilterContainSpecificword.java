package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterContainSpecificword {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple", "banana", "cherry", "graps", "dates");
		List<String> result = words.stream().filter(n -> n.contains("an")).collect(Collectors.toList());
		System.out.println("Fruits which are contain the words of \'an\' -> " + result);
		
	
	}
}
 