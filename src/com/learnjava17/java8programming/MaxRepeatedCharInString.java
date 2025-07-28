package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeatedCharInString {

	 public static void main(String[] args) {
	        String str[] = {"Apple", "Banana", "Cherry"};
	        Arrays.stream(str).forEach(s -> {
	            Optional<Map.Entry<Character, Long>> maxRepeatedChar = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	                    .entrySet().stream().max(Map.Entry.comparingByValue());

	            System.out.println("Most frequent in \"" + s + "\" -> " + maxRepeatedChar.get().getKey());


	        });
	    }

/*	 if (maxEntry.isPresent()) {
		    System.out.println(maxEntry.get().getKey());
		}

*/	 
/*
 * maxEntry.ifPresent(entry -> System.out.println("Most frequent char: " +
 * entry.getKey()) );
 * 
 */	 
	 
}
