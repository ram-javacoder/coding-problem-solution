package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertingArrayToStreamObj {

	public static void main(String[] args) {

		int[] arr1 = { 45, 12, 56, 15, 24, 75, 31, 89, 93, 11, 29, 37 };
		
		List<Integer> minThreeEle = Arrays.stream(arr1).boxed().sorted().limit(3).collect(Collectors.toList());
		List<Integer> maxThreeEle = Arrays.stream(arr1).boxed().sorted((a,b) -> b.compareTo(a)).limit(3).collect(Collectors.toList());
	
		System.out.println("First three minimum elements : " +minThreeEle);
		System.out.println("Last three maximum elements : " +maxThreeEle);
	}
}
