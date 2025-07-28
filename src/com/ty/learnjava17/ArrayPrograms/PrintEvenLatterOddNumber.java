package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class PrintEvenLatterOddNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 4, 7, 8, 11, 20 };
		int result[] = new int[arr.length];
		
		int m = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				result[m++] = arr[i];
			}

		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {

				result[m++] = arr[i];
			}

		}
		System.out.println(Arrays.toString(result));

	}

}
