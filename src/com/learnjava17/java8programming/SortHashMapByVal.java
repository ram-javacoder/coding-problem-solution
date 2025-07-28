package com.learnjava17.java8programming;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByVal {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 30);
		map.put("Banana", 15);
		map.put("Mango", 20);
		map.put("Graph", 10);
		System.out.println("Before sorting :");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("After sorting :");
		map.entrySet().stream().sorted((a, b) -> a.getValue() - b.getValue())
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

	}
}
