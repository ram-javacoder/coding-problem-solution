package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find Elements which are contain number 1 as first digit
public class FindElements {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(123, 98, 81, 317, 145, 77, 11);
		List<String> containOne = number.stream().map(String::valueOf).filter(n -> n.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("Numbers which are contain 1 as first digit :" + containOne);
		
		
	}

}
