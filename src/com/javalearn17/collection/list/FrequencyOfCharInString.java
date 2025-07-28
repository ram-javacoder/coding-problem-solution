package com.javalearn17.collection.list;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharInString {

	static int count = 0;

	public static void main(String[] args) {

		String str[] = { "Apple", "Banana", "Cherry"};
		findMaxFrequentChar(str);

	}

	public static void findMaxFrequentChar(String strArray[]) {

		Map<Character, Integer> map = new HashMap<>();

		while (count < strArray.length) {
			for (Character ch : strArray[count].toCharArray()) {

				map.put(ch, map.getOrDefault(ch, 0) + 1);

			}

			int maxCount = 0;
			char maxChar = '\0';

			for (Map.Entry<Character, Integer> entry : map.entrySet()) {

				if (entry.getValue() > maxCount) {

					maxCount = entry.getValue();
					maxChar = entry.getKey();

				}
			}

			System.out.println(strArray[count] + " : " + maxChar);
			map.clear();
			count++;
		}
	}

}
