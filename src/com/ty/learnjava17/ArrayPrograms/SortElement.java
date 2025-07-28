package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class SortElement {

	public static void main(String[] args) {

		int arr[] = { 122, 42, 78, 12, 23, 10 };

		for (int j = 0; j < arr.length; j++) {  //this loop decide how many time loop should iterate -- 7

			for (int i = 0; i < arr.length - 1; i++) {
				int temp = 0;
				if (arr[i] > arr[i + 1]) {

					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(arr));

	}

}
