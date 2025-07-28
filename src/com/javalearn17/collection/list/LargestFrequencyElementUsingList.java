package com.javalearn17.collection.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestFrequencyElementUsingList {

	public static char findHighestFrequencyChar(List<Character> charList) {
		// Create a HashMap to store the frequency of characters
		Map<Character, Integer> frequencyMap = new HashMap<>();

		// Iterate over the list and count the frequency of each character
		for (char ch : charList) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}

		// Find the character with the highest frequency
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
		// Example list of characters
		List<Character> charList = List.of('a', 'b', 'c', 'a', 'b', 'a', 'd', 'e', 'e', 'e', 'e');

		// Find the character with the highest frequency
		char result = findHighestFrequencyChar(charList);

		
		System.out.println("Character with the highest frequency: " + result);
	}

}
