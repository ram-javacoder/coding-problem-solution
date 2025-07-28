package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class ConvertNumberToBinary {

	// Sorting the Number based on number of 1 present in Binary Conversion
	public static void main(String[] args) {

		Integer arr[] = { 14, 2, 28, 9, 10, 2 };

		String binary[] = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {

			String bin = Integer.toBinaryString(arr[i]);
			binary[i] = bin;

		}
		System.out.println("Array Elements :" + Arrays.toString(arr));
		System.out.println("Numbers after converting to Binary :");
		System.out.println(Arrays.toString(binary));

		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int n1 = Integer.bitCount(o1);
				int n2 = Integer.bitCount(o2);
				if (n1 <= n2) {

					return 1;
				} else {

					return -1;
				}
			}
		});

		System.out.println(Arrays.toString(arr));

	}

}
