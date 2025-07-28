package com.javalearn17.collection.map;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefault {

	public static void main(String[] args) {

		Map<String, Integer> frequencyMap = new HashMap<>();

		frequencyMap.put("apple", 3);
		frequencyMap.put("banana", 2);

		// Using getOrDefault to retrieve the value for a key, if key is not present it
		// will return default value that we provide.
		int appleCount = frequencyMap.getOrDefault("apple", 0);
		int orangeCount = frequencyMap.getOrDefault("orange", 0);

		System.out.println("Count of apples: " + appleCount);
		System.out.println("Count of oranges: " + orangeCount);
	}
}
