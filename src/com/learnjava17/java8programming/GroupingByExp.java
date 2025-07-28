package com.learnjava17.java8programming;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExp {

	public static void main(String[] args) {
		
		List<String> fruits = List.of("apple","banana","apricot");
		Map<Character, List<String>> map =  fruits.stream().collect(Collectors.groupingBy(w -> w.charAt(0)));
		System.out.println(map);
		
	}
}
