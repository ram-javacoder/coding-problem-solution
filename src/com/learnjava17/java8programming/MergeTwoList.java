package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

	// Merge two list and find minimum and maximum number

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
		
		
		/*
		 * Alternative approach - > List <List<Integer>> numbersIntegers =
		 * List.of(list1, list2,list3);
		 * 
		 * int ans = numbersIntegers.stream().flatMap(List :: stream).max(Integer::
		 * compare).get();
		 */

		List<Integer> mergeList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		Integer max = mergeList.stream().max(Integer::compare).get();

		// Integer max1 = mergeList.stream().max((a, b) -> a - b).get();

		Integer min = mergeList.stream().min(Integer::compare).get();
		
		System.out.println("List 1 :" + list1);
		System.out.println("List 2 :" + list2);

		System.out.println("After merging two list : " + mergeList);
		System.out.println("Maximum value :" + max);
		System.out.println("Minimum value :" + min);

	}
}
