package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindVowelsInString {

	public static void main(String[] args) {

		String arr[] = { "hello", "sky", "cloud" };

		System.out.println("Original elements : " + Arrays.toString(arr));

		Arrays.stream(arr).forEach(s -> {

			String string = s.toLowerCase();

			String vowels = string.chars().mapToObj(c -> (char) c).filter(c -> isVowles(c)).map(String::valueOf)
					.collect(Collectors.joining(","));

			System.out.println(string + " -> " + (vowels.isEmpty() ? "No vowels" : vowels));

		});

	}

	public static boolean isVowles(char c) {

		return "AEIOUaeiou".indexOf(c) != -1;

	}

}
