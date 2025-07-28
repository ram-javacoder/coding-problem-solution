package com.learnjava17.java8programming;

import java.util.Map;
import java.util.stream.Collectors;

public class PrintduplicateCharInWord {   //Print duplicate Characters in each String

	public static void main(String[] args) {

		String str = "Ram you are good boy hgddgg";
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			String duplicates = word.toLowerCase().chars().mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
					.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).map(String::valueOf)
					.collect(Collectors.joining(" "));

			if (!duplicates.isEmpty()) {
				result.append("[").append(word).append("] -> ").append(duplicates).append("\n");
			}
		}

		if (result.length() == 0) {
			System.out.println("There are no duplicate characters in any word!");
		} else {
			System.out.println("Duplicate characters in each word:\n" + result);
		}

	}
}
