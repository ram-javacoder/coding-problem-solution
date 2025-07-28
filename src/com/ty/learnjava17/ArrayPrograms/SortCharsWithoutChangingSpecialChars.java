package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCharsWithoutChangingSpecialChars {

	public static void main(String[] args) {

		String input = "ZaAbBADCbGkjg!@#123Kj";
		String output = sortCharactersOnly(input);
		System.out.println("Input:  " + input);
		System.out.println("Output: " + output);
	}

	public static String sortCharactersOnly(String input) {
		
		List<Character> chars = new ArrayList<>();
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				chars.add(c);
			}
		}

		
		Collections.sort(chars, (c1, c2) -> Character.toUpperCase(c1) - Character.toUpperCase(c2));

		StringBuilder result = new StringBuilder();
		int charIndex = 0;
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				result.append(chars.get(charIndex++));
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

}
