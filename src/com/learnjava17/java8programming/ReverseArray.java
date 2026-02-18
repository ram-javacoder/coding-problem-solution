package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.stream.IntStream;

//this is example program for reversing array without using predefined method
public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int[] reversedArray = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();

		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

		// Alternative approach

		//		Integer[] arr = {10, 20, 30, 40, 50};
		//
		//        Integer[] reversed = IntStream.range(0, arr.length)
		//                .mapToObj(i -> arr[arr.length - 1 - i])
		//                .toArray(Integer[]::new);

	}
}
