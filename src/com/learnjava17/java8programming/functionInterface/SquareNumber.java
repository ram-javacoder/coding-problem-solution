package com.learnjava17.java8programming.functionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SquareNumber {

	public static void main(String[] args) {
		
		List<Integer>number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Function<Integer, Integer> squareNumber=n-> n*n;
		
		System.out.println("List of Numbers :" +number);
		System.out.println("Sqaure number of each number in this list");
		for (Integer sqaureNum : number) {
			
			System.out.println(squareNumber.apply(sqaureNum));
		}
		
	}
}
