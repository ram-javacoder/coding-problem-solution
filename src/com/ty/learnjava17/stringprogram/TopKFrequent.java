package com.ty.learnjava17.stringprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {

	public static List<String> topKFrequent(String[] words, int k) {
		
		Map<String, Integer> freqMap = new HashMap<>();
		for (String word : words) {
			freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
		}

		
		List<String> wordList = new ArrayList<>(freqMap.keySet());
		Collections.sort(wordList, (a, b) -> {
			int freqCompare = freqMap.get(b).compareTo(freqMap.get(a)); // descending frequency
			if (freqCompare == 0) {
				return a.compareTo(b); // ascending lexicographical
			}
			return freqCompare;
		});

		// Step 3: Return top k
		return wordList.subList(0, k);
	}

	public static void main(String[] args) {
		String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
		int k = 2;
		System.out.println(topKFrequent(words, k));
	}
}
