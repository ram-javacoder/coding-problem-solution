package com.ty.learnjava17.stringprogram;

import java.util.HashSet;

public class FindLongestSubString {

	public static void main(String[] args) {

		String str = "pwwkew";
		String result = findLongestSubString(str);
		System.out.println("Original String : " + str);
		System.out.println("Longest SubString : " + result + " Length : " + result.length());
	}

	private static String findLongestSubString(String str) {
		
		int maxLen = 0;
		String longest = "";

		for (int end = 0; end < str.length(); end++) {
			HashSet<Character> set = new HashSet<>();
			StringBuilder temp = new StringBuilder();

			for (int j = end; j < str.length(); j++) {
				char ch = str.charAt(j);

				if (set.contains(ch)) {
					break;
				} else {
					set.add(ch);
					temp.append(ch);
				}
			}

			if (temp.length() > maxLen) {
				maxLen = temp.length();
				longest = temp.toString();
			}
		}

		return longest;

	}
}
