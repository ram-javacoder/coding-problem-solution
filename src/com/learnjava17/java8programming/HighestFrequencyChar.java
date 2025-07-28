package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Comparator;

public class HighestFrequencyChar {

	public static void main(String[] args) {
		String input = "India Australia USA";

		String result = Arrays.stream(input.split(" "))
				.max(Comparator.comparingInt(word -> (int) word.chars().filter(c -> c == 'i' || c == 'I').count()))
				.orElse("No word found");

		System.out.println("Word with highest occurrence of 'i': " + result);

	}
}
