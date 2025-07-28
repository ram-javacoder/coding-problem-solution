package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethod {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(5, 9, 6, 2, 4, 10, 8, 3, 7);

		System.out.println("Elements which are present in the Collection");
		System.out.println(number + " ");

		List<Integer> square = number.stream().map(m -> m * m).collect(Collectors.toList());
		System.out.println("Square values of the Elements");
		System.out.print(square + " ");
		
		System.out.println("\nEven Numbers ");
		List<Integer> even=number.stream().filter(m -> (m%2==0)).collect(Collectors.toList());
		System.out.println(even+ " ");
		
		System.out.println("|nElements after Sorting");
		List<Integer>sort=number.stream().sorted().collect(Collectors.toList());
		System.out.println(sort+ " ");
		
		System.out.println("Demonstrate of forEach method");
		List<Integer>odd=number.stream().filter(o -> (o%2==1)).collect(Collectors.toList());
		System.out.println("Displaying Odd Numbers only ");
		odd.forEach(y -> System.out.println(y));
		
		 int evenNum 
         = number.stream()
           .filter(x -> x % 2 == 0)
           .reduce(0, (ans, x) -> ans + x);

       System.out.println("Sum of Even Numbers : " +evenNum);
		
	}
	

}
