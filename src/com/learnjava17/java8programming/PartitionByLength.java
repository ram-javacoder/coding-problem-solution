package com.learnjava17.java8programming;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Partition strings by length: short (<5), medium (5-10), long (>10)
public class PartitionByLength {

	public static void main(String[] args) {
		
		List<String> words = List.of("apple", "banana", "cherry", "date", "fig", "grapefruit", "kiwi");
		partitionByLength(words);
			
	}

	private static void partitionByLength(List<String> words) {
		
		words.stream()
        // Takes a classification function to decide the key which is either "short", "medium" or "long"
        // Uses a downstream collector (second argument, optional). If not provided, defaults to Collectors
        // .toList().
        .collect(Collectors.groupingBy(word -> {
            if (word.length() < 5) return "short";
            else if (word.length() <= 10) return "medium";
            else return "long";
        }))
        .forEach((key, value) -> System.out.println(key + ": " + value));

		
	
	}
	
}
