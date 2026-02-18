package com.learnjava17.java8programming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PrintTopMaxOccuranceInFile {

	public static void main(String[] args) throws IOException {

		String fileName = "D:\\sample.txt";
		BufferedReader reder = new BufferedReader(new FileReader(fileName));
		int topN = 10;
		printTop10MaxOccurance(reder, topN);

	}

	private static void printTop10MaxOccurance(BufferedReader reader, int topN) throws IOException {
		Map<String, Long> wordCount = new HashMap<String, Long>();
		String line;

		while ((line = reader.readLine()) != null) {

			String words[] = line.split(" ");

			Arrays.stream(words).filter(word -> !word.isEmpty()).map(String::toLowerCase)
					.forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0L) + 1));

		}
		reader.close();

		wordCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(topN)
				.forEach(entry -> {

					System.out.println(entry.getKey() + " -> " + entry.getValue());

				});

	}

}
