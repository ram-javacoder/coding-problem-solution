package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find unique frequency number using Collections.frequency()
// Non-repeated elements 

public class UniqueFrequency {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,6,2, 2, 3, 4, 5,1);
		int uniqueElements = nums.stream().filter(num -> Collections.frequency(nums, num) == 1).findFirst().get();
				//.collect(Collectors.toList());
		System.out.println(uniqueElements);
		
	
	}
}
