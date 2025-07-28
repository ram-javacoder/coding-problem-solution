package com.ty.learnjava17.stringprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {
		
		Map<String, List<String>> map = new HashMap<>();

		
		for (String str : strs) {
			
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);

			// If the sorted string is not present in the map, add it with an empty list
			map.putIfAbsent(sortedStr, new ArrayList<>());

			// Add the original string to the list of anagrams
			map.get(sortedStr).add(str);
		}

		
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> groupedAnagrams = groupAnagrams(strs);

		System.out.println(groupedAnagrams);

	}
}
