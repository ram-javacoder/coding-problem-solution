package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class MergeAndSortEvenOdd {

	public static void main(String[] args) {

		int arr_1[] = { 2, 6, 4 };
		int arr_2[] = { 5, 1, 3 };

		int mergeArr[] = new int[arr_1.length + arr_2.length];

		for (int i = 0, m = 0, n = 0; i < mergeArr.length; i++) {

			if (m < arr_1.length) {

				mergeArr[i] = arr_1[m];
				m++;
			} else if (n < arr_2.length) {

				mergeArr[i] = arr_2[n];
				n++;
			}

		}
		System.out.println("After merging two array : " + Arrays.toString(mergeArr));

		for (int i = 0; i < mergeArr.length - 2; i++) {

			if (i % 2 == 0) {

				if (mergeArr[i] > mergeArr[i + 2]) {
					int temp = mergeArr[i + 2];
					mergeArr[i + 2] = mergeArr[i];
					mergeArr[i] = temp;
					i = -1;
				}
			}

			else {

				if (mergeArr[i] < mergeArr[i + 2]) {

					int temp = mergeArr[i + 2];
					mergeArr[i + 2] = mergeArr[i];
					mergeArr[i] = temp;
					i = -1;

				}

			}

		}

		System.out.println("Output : " + Arrays.toString(mergeArr));

	}
}
