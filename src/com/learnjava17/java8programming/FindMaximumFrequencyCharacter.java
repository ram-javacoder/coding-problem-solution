package com.learnjava17.java8programming;

import java.util.Map;
import java.util.stream.Collectors;

public class FindMaximumFrequencyCharacter {

	public static void main(String[] args) {

		String str = "Software Development";
		System.out.println("Original String : " + str);

		Character frequency = str.chars().mapToObj(c -> (char) c).filter(c -> c != ' ')
				.collect(Collectors.groupingBy(k -> k, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println("Maximum frequency character : " + frequency);
	}
}

