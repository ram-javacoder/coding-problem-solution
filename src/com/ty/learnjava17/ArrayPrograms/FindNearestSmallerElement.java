package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FindNearestSmallerElement {

	public static void main(String[] args) {

		int arr[] = { 4,5,2,10,8,1};
		int result[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				result[i] = -1;

			} else {

				for (int j = i; j > 0; j--) {

					if (arr[i] > arr[j - 1]) {

						result[i] = arr[j - 1];
						break;
					}
					result[i] = -1;
				}

				
			}

		}

		System.out.println(Arrays.toString(result));
	}

}
