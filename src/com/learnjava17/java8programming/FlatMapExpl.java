package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Example of flatMap() and char() in stream

public class FlatMapExpl {

	public static void main(String[] args) {

		List<String> names = Stream.of(Arrays.asList("Ram", "Raj", "John"),
				Arrays.asList("Mohan", "Lokesh", "Lakshman"), Arrays.asList("Mango", "Apple", "Banana"))
				.flatMap(List::stream).collect(Collectors.toList());
		for (String string : names) {
			System.out.println(string);
		}

		// char()
		String str = "Ramkumar";
		str.chars().mapToObj(c -> (double) c).forEach(System.out::println);

	}
}
