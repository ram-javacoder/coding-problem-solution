package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 
import java.util.stream.IntStream;

public class convertingArrayIntoList {

	public static void main(String[] args) {

		int[] arr1 = { 4, 5, 1, 2, 3 };
		int[] arr2 = { 6, 7, 8, 4, 5 };

		List<List<Integer>> merge = new ArrayList<List<Integer>>();
		merge.add(IntStream.of(arr1).mapToObj(n -> n).collect(Collectors.toList()));
		merge.add(IntStream.of(arr2).mapToObj(n -> n).collect(Collectors.toList()));

		// similar approach -> Arrays.stream(arr1).mapToObj(n ->
		// n).collect(7ctors.toList())

		List<Integer> numbers = merge.stream().flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		System.out.println(numbers);

	}

}
