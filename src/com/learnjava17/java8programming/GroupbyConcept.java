package com.learnjava17.java8programming;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Frequency of Characters
public class GroupbyConcept {

	public static void main(String[] args) {

		String inputString = "Ramkumar";
		Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c).filter(c -> c != ' ')
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		charCountMap.forEach((character, count) -> System.out.println("Characters :" + character + " Count :" + count));

	}

}
