package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumber {

	public static void main(String[] args) {

		// Create a list of numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Create a stream from the list
		Stream<Integer> stream = numbers.stream();

		// Filter the stream to only include even numbers

		Stream<Integer> evenNumbers = stream.filter(number -> number % 2 == 0);

		evenNumbers.forEach(System.out::println);

	}

}
