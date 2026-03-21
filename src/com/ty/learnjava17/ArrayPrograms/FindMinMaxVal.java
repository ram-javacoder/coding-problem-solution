package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Comparator;

/*Given five positive integers, find the minimum and maximum values that can be calculated by 
summing exactly four of the five integers. Then print the respective minimum and maximum values 
as a single line of two space-separated long integers.

arr = [1,5,3,9,7]

min = 16

max = 24
*/

public class FindMinMaxVal {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 3, 9, 7 };

		long min = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).mapToLong(n -> n).sum();
		long max = Arrays.stream(arr).sorted().mapToLong(n -> n).skip(1).sum();
		System.out.println("Min: " + min + "\nMax : " + max);

	}

}