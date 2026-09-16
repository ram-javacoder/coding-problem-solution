package com.javalearn17.collection.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestFrequencyElementUsingList {

	public static char findHighestFrequencyChar(List<Character> charList) {
		Map<Character, Integer> frequencyMap = new HashMap<>();

		for (char ch : charList) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}

		char maxChar = '\0';
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxChar = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		return maxChar;
	}

	public static void main(String[] args) {
		List<Character> charList = List.of('a', 'b', 'c', 'a', 'b', 'a', 'd', 'e', 'e', 'e', 'e');
		char result = findHighestFrequencyChar(charList);
		System.out.println("Character with the highest frequency: " + result);
	}

}
