package com.learnjava17.java8programming.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOperation {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(9,8,4,5,1,3,7,6,2,10);
		
		List<Integer> sortedNumber= numbers.stream().sorted(Integer ::compareTo).collect(Collectors.toList());
		System.out.println(sortedNumber);
	}

}
