package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.stream.Collectors;

// Multiple characters having the same maximum frequency, 

public class MaxRepeatedCharInString2 {


	public static void main(String[] args) {
		String str[] = { "Apple", "Ramkumar", "Cherry" };
		Arrays.stream(str).forEach(s -> {

			
			Map<Character, Long> frequencyMap = s.chars().mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			
			 Optional<Long> maxFrequency = frequencyMap.values().stream().max(Comparator.comparingLong(n -> n));

			if (maxFrequency.isPresent()) {
				Long max = maxFrequency.get();
				List<Character> maxChars = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == max)
						.map(Map.Entry::getKey).collect(Collectors.toList());

				System.out.println(s + " -> " + maxChars + " (Frequency: " + max + ")");
			} else {
				System.out.println(s + " -> No Character");
			}

		});
	}

}
