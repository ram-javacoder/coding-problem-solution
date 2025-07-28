package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 4, 5, 5, 6 };
		findMissingNumbers(arr);
	}

	private static void findMissingNumbers(int[] arr) {
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i] == arr[i + 1])
				continue;

			int current = arr[i];
			int next = arr[i + 1];

			
			for (int j = current + 1; j < next; j++) {
				result.add(j);
			}
		}

		if (result.isEmpty()) {
			System.out.println("No missing numbers");
		} else {
			System.out.println("Missing numbers: " + result);
		}
	}

}
