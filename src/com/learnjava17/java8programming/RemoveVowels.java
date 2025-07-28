package com.learnjava17.java8programming;

import java.util.stream.Collectors;

public class RemoveVowels {

	public static void main(String[] args) {

		String str = "Java Programming";
		String result = removeVowels(str);
		System.out.println("Before removing vowels : " + str);
		System.out.println("After removing vowles : " + result);

	}

	public static String removeVowels(String str) {
		return str.chars().mapToObj(c -> (char) c).filter(c -> !isVowels(c)).map(String::valueOf)
				.collect(Collectors.joining());

	}

	public static boolean isVowels(char c) {

		return "AEIOUaeiou".indexOf(c) != -1;

	}

}
