package com.learnjava17.java8programming;

import java.util.List;
import java.util.stream.Collectors;

public class PartitionVowelsConsonants {

	public static void main(String[] args) {
		List<Character> characters = List.of('a', 'b', 'e', 'f', 'i', 'j', 'p', 'u', 'v');
	    partitionVowelsConsonent(characters);
		
	}

	private static void partitionVowelsConsonent(List<Character> characters) {
		characters.stream().collect(Collectors.partitioningBy(ch -> "aeiou".indexOf(Character.toLowerCase(ch)) >= 0 ))
		.forEach((vowel, consonant) -> {
			System.out.println(vowel+ ": " +consonant);
			
		});
		
		
		/*
		 * characters.stream().collect(Collectors.groupingBy(ch -> {
		 * 
		 * if ("aeiou".indexOf(ch)>=0) { return "vowels"; } else { return "consonents";
		 * }
		 * 
		 * })).forEach((key, value) -> System.out.println(key+ ": " +value));
		 * 
		 */
		
		
		
	}
	
}
