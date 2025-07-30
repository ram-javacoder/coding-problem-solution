package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringBasedOnLength {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Sunil", "Rishi", "Shivam", "Nitesh", "Joshi","Ram","Lakshman");
		groupStringBasedOnLength(names);

	}

	private static void groupStringBasedOnLength(List<String> names) {

		Map<Integer, List<String>> groupString = names.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.toList()));

		System.out.println("Input: " + names);
		System.out.println("Output: " + groupString);

	}
}
