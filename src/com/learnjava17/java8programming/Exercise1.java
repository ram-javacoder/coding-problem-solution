package com.learnjava17.java8programming;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Exercise1 {

	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		name.add("Ram");
		name.add("Mohan");
		name.add("Lakshman");
		name.add("Poongavanam");
		name.add("Lokesh");
		name.add("nanda");
		// Filter method and Sort method
		System.out.println("Printing all Even number in the List");
		List<Integer> EvenNumber = arr.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());
		EvenNumber.forEach(System.out::println);

		System.out.println("Finding factorial using reduce method :");
		int factorial = arr.stream().reduce(1, (a, b) -> a * b);
		System.out.println(factorial);

		// Map Method
		System.out.println("\nPrinting factorial of the Number after converting Integer to Long");
		long factorial_1 = arr.stream().mapToLong(n -> n).reduce(1L, (a, b) -> a * b);
		System.out.println("Factorial of number using IntStream.rangeClosed method : " + factorial_1);

		// reduce method
		System.out.println("Using reduce method");
		int largest = arr.stream().reduce((n1, n2) -> n1 > n2 ? n1 : n2).orElse(null);
		System.out.println("Largest number is :" + largest);
		System.out.println("\nLargest name");
		Optional<String> largeName = name.stream().reduce((n1, n2) -> n1.length() > n2.length() ? n1 : n2);
		System.out.println(largeName.get());

		System.out.println("\nFinding Sum of Number using reduce method ");
		int sum = arr.stream().reduce(0, (e1, e2) -> e1 + e2);
		System.out.println("Sum of Number is :" + sum);

		System.out.println("\nFinding factorial using reduce method");
		int fact1 = IntStream.range(1, 6).reduce(1, (n1, n2) -> n1 * n2);
		System.out.println(fact1);

		// Collector
		List<Integer> collect = arr.stream().collect(Collectors.toList());
		System.out.println(collect);

		// Convert to UpperCase Letter
		Stream<String> upper = name.stream().map(u -> u.toUpperCase());
		upper.forEach(System.out::println);

		// Getting minimum value
		int min = arr.stream().min(Comparator.comparingInt(n -> n)).get(); // Integer::valueOf is redundant here if
																				// arr is already a List<Integer>.
		System.out.println("Minimum value in Collection is :" + min);

		// int m = Collections.min(arr); ----> shortest and cleanest

		/*
		 * Comparator.comparing(Integer::valueOf): This creates a Comparator that
		 * compares Integer objects based on their natural order (ascending order). It's
		 * equivalent to Comparator.naturalOrder() in this case, as Integer::valueOf
		 * converts Integer objects to Integer values.
		 * 
		 * min: This method is called on the stream and takes a Comparator as its
		 * argument. It returns an Optional containing the minimum element of the stream
		 * according to the specified comparator.
		 */

		// Getting maximum value
		int max = arr.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum value in Collection is :" + max);
		
		
	}

}
