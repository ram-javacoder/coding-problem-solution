package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintElementDescendingOrder {

	public static void main(String[] args) {

		       int[] numbers = {5, 2, 8, 1, 6};
		       
		  
		       
		       Arrays.stream(numbers)
		              .boxed()  // Convert int to Integer (we can also use mapToObj(n -> n))
		              .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
		              .forEach(System.out::println);
		    }
		

	}

