package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class Pre4 {
	public static void main(String[] args) {

		int arr[] = { 3, 0, 9, 7, 4, 5 };
		int result[] = null;
		int m = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 4) {

				result = new int[i];
				for (int j = result.length; j > 0; j--) {

					result[(result.length) - j] = arr[m++];

				}
				break;

			}

		}
		System.out.println(Arrays.toString(result));

	}
}
