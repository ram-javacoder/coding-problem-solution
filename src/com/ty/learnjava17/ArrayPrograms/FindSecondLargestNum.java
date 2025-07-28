package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Optional;

public class FindSecondLargestNum {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 0, 111, 4, 2 };
		Optional<Integer> findSecondLargestNum = Arrays.stream(arr).boxed().distinct().sorted((a, b) -> b - a).skip(1)
				.findFirst();

		if (findSecondLargestNum.isPresent()) {

			System.out.println("Second Largest number : " + findSecondLargestNum.get());

		} else {

			System.out.println("There is no second largest number!");
		}
	}
}
