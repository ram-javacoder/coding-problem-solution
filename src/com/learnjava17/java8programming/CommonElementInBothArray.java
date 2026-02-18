package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementInBothArray {

	public static void main(String[] args) {

		int arr_1[] = { 1, 3, 4 };
		int arr_2[] = { 3, 4 };

		List<Integer> result = Arrays.stream(arr_1).boxed().distinct().
				filter(e1 -> Arrays.stream(arr_2).anyMatch(e2 -> e1 == e2)).
				collect(Collectors.toList());
		System.out.println(result);

// (OR)		
//		List<Integer> result2 = Arrays.stream(arr_1).boxed()
//				.flatMap(e1 -> Arrays.stream(arr_2).boxed().filter(e2 -> e2 == e1)).collect(Collectors.toList());
//		System.out.println(result2);
	
	
	
	
	}
}
