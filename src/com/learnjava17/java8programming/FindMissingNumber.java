package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumber {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 1, 3, 7, 9, 13 };
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());

		List<Integer> missingNumbers = IntStream.rangeClosed(1, 13).filter(i -> !set.contains(i)).boxed()
				.collect(Collectors.toList());

		System.out.println("Input: " + Arrays.toString(arr));
		System.out.println("Output: " + missingNumbers);
	}

}
