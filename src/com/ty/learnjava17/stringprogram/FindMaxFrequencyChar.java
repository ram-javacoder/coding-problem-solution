package com.ty.learnjava17.stringprogram;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FindMaxFrequencyChar {

	public static void main(String[] args) {

		String str = "ADDDCCDCCC";
		System.out.println("Input : " + str);
		maxRepeatingChar(str);

	}

	private static void maxRepeatingChar(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : str.toCharArray()) {

			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		Collection<Integer> values = map.values();
		boolean numOffrequency = values.stream().distinct().count() == 1;

		if (numOffrequency) {
			System.out.print("Output : ");
			for (Character key : map.keySet()) {

				System.out.print(key + ",");

			}
		} else {


			int maxCount = map.values().stream().max(Integer :: compare).orElse(0);
	 
			System.out.print("Output : ");
	        map.entrySet().stream()
	            .filter(entry -> entry.getValue() == maxCount)
	            .forEach(entry -> System.out.print(entry.getKey() + " "));	
		}
		

	}

	} 

