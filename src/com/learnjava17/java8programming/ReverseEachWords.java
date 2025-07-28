package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWords {

	public static void main(String[] args) {

		String str = "I LOVE JAVA PROGRAMMING";

		String strArray[] = str.split(" ");
		List<String> reverse = Arrays.stream(strArray).map(m -> new StringBuilder(m).reverse().toString())
				.collect(Collectors.toList());
		System.out.println("Before reversing :" + str);
		System.out.println("After reversing :" + reverse);
	}
}
