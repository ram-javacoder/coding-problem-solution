package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FindTopKFrequent {

	/*
	 * K Most Frequent Words Return top-k frequent words Sort by Higher frequency
	 * first
	 * 
	 * If frequency same → Lexicographically smaller word first
	 */

	public static List<String> topKFrequent(String[] words, int k) {

		// Step 1: Count frequency
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		// Step 2: Min Heap
		PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
			if (map.get(a).equals(map.get(b))) {
				return b.compareTo(a); // reverse lexicographical ==> Lexicographically smaller word first
			}
			return map.get(a) - map.get(b); // lower frequency first
		});

		// Step 3: Maintain size k
		for (String word : map.keySet()) {
			pq.offer(word);
			if (pq.size() > k) {
				pq.poll();
			}
		}

		// Step 4: Build result
		List<String> result = new ArrayList<>();
		while (!pq.isEmpty()) {
			result.add(pq.poll());
		}

		// Reverse to get highest frequency first
		Collections.reverse(result);
		return result;
	}

	public static void main(String[] args) {
		String[] words = { "i", "love", "java", "i", "love", "coding", "java", "java" };
		int k = 2;

		List<String> output = topKFrequent(words, k);
		System.out.println("Top " + k + " frequent words: " + output);
	}
}
