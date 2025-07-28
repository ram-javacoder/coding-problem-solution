package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;

public class SecondLastCharacterEachString {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Sachin", "Virot", "Dhoni", "A", "");

		list.stream().filter(s -> s.length() >= 2) // To avoid exceptions
				.map(s -> s.substring(s.length() - 2, s.length() - 1)) // Get second last char
				.forEach(System.out::println);
	}

}