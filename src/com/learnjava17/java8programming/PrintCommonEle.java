package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Print all common elements in All three array

public class PrintCommonEle {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 7 };
		int b[] = { 2, 3, 6 };
		int c[] = { 2, 1 };

		printCommonElements(a, b, c);

	}

	private static void printCommonElements(int[] a, int[] b, int[] c) {

		Set<Integer> set_a = IntStream.of(a).boxed().collect(Collectors.toSet());
		Set<Integer> set_b = IntStream.of(b).boxed().collect(Collectors.toSet());
		Set<Integer> set_c = IntStream.of(c).boxed().collect(Collectors.toSet());
		set_a.retainAll(set_b);
		set_a.retainAll(set_c);

		System.out.print("Common Elements : " +set_a);

	}

}
