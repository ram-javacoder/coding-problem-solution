package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroSums {
	public static void main(String[] args) {

		int arr[] = { -9, -8, -5, 0, 5, 8, 15 };

	Arrays.asList(arr).stream().forEach(System.out::println);
		
		List<List<Integer>> zeroSums = new ArrayList<List<Integer>>();
		int k = 0;
		boolean flag = false;
		for (int i = 1; k < arr.length - 1; i++) {

			flag = false;
			if (arr[k] + arr[i] == 0) {

				if (!zeroSums.contains(List.of(arr[k], arr[i]))) {

					zeroSums.add(List.of(arr[k], arr[i]));
					flag = true;
					k = k + 1;
					i = k;
				}

			}
			if (flag == false && i == arr.length - 1) {

				k = k + 1;
				i = k;
			}
		}

		System.out.println("Pair of zero sums : " + zeroSums);

	}

}
