package com.ty.learnjava17.stringprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxAlphapetSubString2 {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input:");
		String input = br.readLine();
		int result = maxAlphabetSubString(input);
		System.out.println("Maximum number of Alphabet sub String: " + result);
	}
//GFDABCPOEFG
	public static int maxAlphabetSubString(String input) {
		int totalAlphabet = 0;
		int count = 1;
		int startIndex = 0; 

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) - input.charAt(i - 1) == 1) {
				count++;
			} else {
				if (count >= 2) {
					System.out.println("Sequence: " + input.substring(startIndex, i) + " | Start index: " + startIndex);
					totalAlphabet += count;
				}
				count = 1;
				startIndex = i; 
			}
		}

		
		if (count >= 2) {
			System.out.println("Sequence: " + input.substring(startIndex) + " | Start index: " + startIndex);
			totalAlphabet += count;
		}

		return totalAlphabet;

	}
}
