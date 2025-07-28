package com.ty.learnjava17.stringprogram;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSubstrings {

	public static void main(String[] args) {
		String input = "poppopo";
		List<String> palindromes = findAllPalindromeSubstrings(input);
		System.out.println(palindromes);
	}

	public static List<String> findAllPalindromeSubstrings(String input) {
		List<String> palindromeSubstrings = new ArrayList<>();
		int n = input.length();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String substring = input.substring(i, j);
				if (isPalindrome(substring)) {
					palindromeSubstrings.add(substring);
				}
			}
		}

		return palindromeSubstrings;
	}

	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

}
