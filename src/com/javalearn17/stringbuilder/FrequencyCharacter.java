package com.javalearn17.stringbuilder;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1 };
		findFrequency(arr);
	}

	public static void findFrequency(int[] arr) {

		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : arr) {

			// If the element is already present in the map, increment its frequency
			if (frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num) + 1);
			} else {
				// If the element is not present, add it to the map with frequency 1
				frequencyMap.put(num, 1);
			}
		}

		// Print the frequency of each element
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times");
		}

	}
}
