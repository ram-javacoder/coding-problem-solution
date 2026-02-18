package com.javalearn17.codetest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CodeTest {

	public static void main(String[] args) throws IOException {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		currentMatrix(arr);
		findSaddlePoint(arr);

	}

	private static void findSaddlePoint(int[][] arr) {
		List<Integer> result = new ArrayList<Integer>();
		int minRowVal = Integer.MAX_VALUE;
		
		int maxColVal = Integer.MIN_VALUE;
		int minRowPoint = 0;
		int row = 0;
		int n = arr.length;
		while (row < n) {

			for (int i = 0; i < n; i++) {

				int min = Math.min(minRowVal, arr[row][i]);
				if (minRowVal > min) {
					minRowVal = min;
					minRowPoint = i;
				}

			}

			for (int j = 0; j < n; j++) {

				int max = Math.max(maxColVal, arr[j][minRowPoint]);
				if (maxColVal < max) {
					maxColVal = max;
				}

			}

			if (minRowVal == maxColVal) {
				result.add(minRowVal);
			}
			minRowVal = Integer.MAX_VALUE;
			maxColVal = Integer.MIN_VALUE;

			row++;

		}
		System.out.println("Output:\n" +result);

	}

	private static void currentMatrix(int[][] arr) {
		System.out.println("Input: ");
		for (int[] i : arr) {

			System.out.println(Arrays.toString(i));

		}

	}

}
