package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingElement2DList {

	public static void main(String[] args) {

		List<List<Integer>> num = new ArrayList<List<Integer>>();
		num.add(Arrays.asList(3, 1, 4, 1, 5));
		num.add(Arrays.asList(5, 2));
		num.add(Arrays.asList(5, 8, 9, 7, 9, 12, 14, 10));

		System.out.println("List of elements in Asceding order :");
		List<Integer> ascendingOrderList = ascendingOrderEle(num);
		System.out.println(ascendingOrderList);
	}

	private static List<Integer> ascendingOrderEle(List<List<Integer>> num) {

		return num.stream().flatMap(List::stream).sorted().collect(Collectors.toList());

	}

}
