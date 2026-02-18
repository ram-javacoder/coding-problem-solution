package com.ty.learnjava17.stringprogram;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		// Example usage
		String[] strings = { "flower", "flow", "flight" };
		String result = longestCommonPrefix(strings);
		System.out.println("Longest Common Prefix: " + result);

	}

	private static String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			// Iterate through characters in the current string
			for (int j = 0; j < prefix.length() && j < strs[i].length(); j++) {
				// If the characters don't match, update the prefix
				if (prefix.charAt(j) != strs[i].charAt(j)) {
					prefix = prefix.substring(0, j);
					break;
				}
			}

			// If the prefix becomes empty, no common prefix is found
			
			if (prefix.isEmpty()) {
				break;
			}
		}

		return prefix;
	}

}
