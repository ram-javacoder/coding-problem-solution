package com.learnjava17.java8programming;

import java.util.stream.Collectors;

public class ReplaceChar {

	// replace all occurrences of 'a' with 'o'

	public static void main(String[] args) {

		String str = "Java Program";
		String result = str.chars().mapToObj(c -> (char) c).map(ch -> ch == 'a' || ch == 'A' ? 'o' : ch)
				.map(String::valueOf).collect(Collectors.joining());

		System.out.println("Output : " + result);
	}
}
