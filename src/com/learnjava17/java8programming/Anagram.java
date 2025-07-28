package com.learnjava17.java8programming;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {

		s1 = s1.toLowerCase().replaceAll("\\s", "");
		s2 = s2.toLowerCase().replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			return false;
		}

		Map<Character, Long> map1 = s1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		Map<Character, Long> map2 = s2.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		return map1.equals(map2);
	}

	public static void main(String[] args) {

		String s1 = "Race Car";
		String s2 = "Car Race";

		if (isAnagram(s1, s2)) {
			System.out.println(s1 + " and " + s2 + " are Anagrams.");
		} else {
			System.out.println(s1 + " and " + s2 + " are NOT Anagrams.");
		}

	}
}
