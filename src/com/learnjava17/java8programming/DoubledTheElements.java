package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubledTheElements {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> result = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Doubled Elements :" + result);

	}

}
	