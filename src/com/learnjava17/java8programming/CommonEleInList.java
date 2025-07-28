package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonEleInList {

	public static void main(String[] args) {
		
		List<Integer> list_1 = Arrays.asList(5,1,3,2);
		List<Integer> list_2 = Arrays.asList(2,7,10,5);
		
		List<Integer> commonElements = list_1.stream().filter(list_2::contains).collect(Collectors.toList());
		System.out.println("List 1 : " +list_1+ " List 2 : " +list_2);
		
		System.out.println("Common elements : " +commonElements);

	}
}
