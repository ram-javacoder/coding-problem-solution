package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberListOperations {

	public static void main(String[] args) {

		List<List<Integer>> listOfLists = new ArrayList<>();
		listOfLists.add(Arrays.asList(1, 2, 3, 4, 5));
		listOfLists.add(Arrays.asList(6, 7, 8, 9, 10));
		listOfLists.add(Arrays.asList(11, 12, 13, 14, 15));

		// Display the original list of lists
		System.out.println("Original List of Lists:");
		displayListofLists(listOfLists);

		// Sum of All list
		System.out.println("\nSum of all list ");
		sumOfAllList(listOfLists);

		// Calculate and display the sum of each sublist
		System.out.println("\nSum of Each Sublist:");
		calculateAndDisplaySum(listOfLists);

		// Calculate and display the average of each sublist
		System.out.println("\nAverage of Each Sublist:");
		calculateAndDisplayAverage(listOfLists);
	}

	private static void sumOfAllList(List<List<Integer>> listOfLists) {

		int sum = listOfLists.stream().flatMapToInt(list -> list.stream().mapToInt(Integer::intValue)).sum();
		System.out.println(sum);
	}

	private static void displayListofLists(List<List<Integer>> listOfLists) {
		for (List<Integer> sublist : listOfLists) {
			System.out.println(sublist);
		}
	}

	private static void calculateAndDisplaySum(List<List<Integer>> listOfLists) {
		for (List<Integer> sublist : listOfLists) {
			int sum = sublist.stream().mapToInt(n -> n).sum();
			System.out.println("Sum: " + sum);
		}
	}

	private static void calculateAndDisplayAverage(List<List<Integer>> listOfLists) {
		for (List<Integer> sublist : listOfLists) {
			double average = sublist.stream().mapToInt(Integer::intValue).average().orElse(0);
			System.out.println("Average: " + average);
		}
	}
}