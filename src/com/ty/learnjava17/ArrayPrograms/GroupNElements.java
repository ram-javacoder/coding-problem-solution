package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupNElements {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		int n = 3;
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < arr.length; i = i + n) {

			int min = Math.min(i + n, arr.length);
			result.add(Arrays.asList(Arrays.copyOfRange(arr, i, min)));

		}

		System.out.println("Original elements : " + Arrays.toString(arr));
		System.out.println(result);
	}
}
