package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class SortElementdecreasing {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 1, 5, 2 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				int temp = 0;
				if (arr[j] < arr[j + 1]) {

					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println("a[" + i + "] = " + arr[i]);
		}

	}

}

/*
 * Output : a[0] = 5 a[1] = 4 a[2] = 3 a[3] = 2 a[4] = 1
 */
