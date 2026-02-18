package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSumAndFactorialMultipleWays {

	private static void findFactorial(int[] arr_1, int[] arr_2) {

		// Way -1
		int fact1 = Stream.of(arr_1, arr_2).flatMapToInt(Arrays::stream).reduce(1, (n1, n2) -> n1 * n2);
		System.out.println("Factorial of all number - way-1:  " + fact1);

		// way-2
		int sums1 = Stream.of(arr_1, arr_2).flatMapToInt(Arrays::stream).sum(); // this sum of number
		System.out.println("Sum of all number way-1: " + sums1);

		/*
		 * Stream.of(arr_1, arr_2) → creates a Stream<int[]>
		 * 
		 * flatMapToInt(Arrays::stream) → flattens it to a single IntStream
		 * 
		 * sum() → adds all elements
		 * 
		 */

		// way-2
		int fact2 = IntStream.concat(Arrays.stream(arr_1), Arrays.stream(arr_2)).reduce(1, (n1, n2) -> n1 * n2);
		System.out.println("Factorial of all number way-2: " + fact2);

		/*
		 * Arrays.stream(...) → converts arrays to IntStream
		 * 
		 * IntStream.concat() → merges both streams
		 * 
		 * sum() → adds them up
		 */

		// way -3
		int sums2 = IntStream.concat(Arrays.stream(arr_1), Arrays.stream(arr_2)).sum();
		System.out.println("Sum of all numbers way-2: " + sums2);

	}

	public static void main(String[] args) {
		int arr_1[] = { 3, 1, 2, 4 };
		int arr_2[] = { 1, 2, 4 };

		findFactorial(arr_1, arr_2);

	}

}