package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaximumFrequencyCharInString {

	public static void main(String[] args) {
		
		String str[] = {"Apple", "Banana", "Cherry","Ram"};
		
		Arrays.stream(str).forEach(s -> {
			
			String maxFrequencyChar = s.toLowerCase().chars()
					.mapToObj(c -> (char) c)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
					.entrySet().stream().max(Map.Entry.comparingByValue()).filter(entry -> entry.getValue()>1)
					.map(entry -> String.valueOf(entry.getKey()))
					.orElse("No repeating Character");
			
			System.out.println(s+ " -> " +maxFrequencyChar);
			
			
			
		});
		
		
		
	}
}
