package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class InterviewQs2 {

	public static void main(String[] args) {
		int[] arr_1 = { 12, 4, 5, 27, 6, 9 };
		findNextGreaterValue(arr_1);
		System.out.println(Arrays.toString(arr_1));

	}

	public static void findNextGreaterValue(int[] arr_1) {
		for (int i = 0; i < arr_1.length; i++) {
			int greater = -1;
			for (int j = i + 1; j < arr_1.length; j++) {
				if (arr_1[j] > arr_1[i]) {
					greater = arr_1[j];
					break;
				}
			}
			arr_1[i] = greater;
		}
	}

}
