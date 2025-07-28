package com.ty.learnjava17.stringprogram;

import java.util.Arrays;

public class SetZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 9, 10, 11, 0 }, { 13, 14, 15, 16 } };

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		setZeroes(matrix);

		System.out.println("Matrix after setting zeroes:");
		printMatrix(matrix);
	}

	public static void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean[] rowZero = new boolean[rows];
		boolean[] colZero = new boolean[cols];

		// Step 1: Identify which rows and columns need to be zeroed
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					rowZero[i] = true;
					colZero[j] = true;
				}
			}
		}

		// Step 2: Set the identified rows to zero
		for (int i = 0; i < rows; i++) {
			if (rowZero[i]) {
				for (int j = 0; j < cols; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		// Step 3: Set the identified columns to zero
		for (int j = 0; j < cols; j++) {
			if (colZero[j]) {
				for (int i = 0; i < rows; i++) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}

}
