package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sumOfsquare = numbers.stream().mapToInt(n -> n * n).sum();
		System.out.println("Sum of Square :" + sumOfsquare);
	}
}
