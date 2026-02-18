package com.ty.learnjava17.stringprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentUsingStream {

	public static void main(String[] args) {

		String words[] = { "i", "love", "leetcode", "i", "love", "coding" };
		int k = 2;
		findTopFrequencyWord(words, k);

	}

	private static void findTopFrequencyWord(String[] words, int k) {

		Map<String, Long> map = Arrays.stream(words).collect(Collectors.groupingBy(key -> key, Collectors.counting()));

		List<String> topMaxFrequency = map.entrySet().stream()
				.sorted(Comparator.comparing(Map.Entry<String, Long>::getValue).reversed()).limit(k)
				.map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println("Output: " + topMaxFrequency);
	}
}
