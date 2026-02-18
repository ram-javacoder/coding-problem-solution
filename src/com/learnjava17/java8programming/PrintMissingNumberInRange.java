package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintMissingNumberInRange {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		Arrays.sort(arr);
		List<Integer> result = findDisappearedNumbers(arr);
		System.out.println("Missing number: " +result);

		
	}

	private static List<Integer> findDisappearedNumbers(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : arr) {

			set.add(i);
		}

		List<Integer> missingNumbers = IntStream.rangeClosed(arr[0], arr[arr.length - 1]).filter(n -> !set.contains(n))
				.boxed().collect(Collectors.toList());

		return missingNumbers;
	}

	
}
