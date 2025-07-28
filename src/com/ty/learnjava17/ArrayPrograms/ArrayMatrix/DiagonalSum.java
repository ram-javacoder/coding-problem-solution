package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

public class DiagonalSum {

	public static int calculateDiagonalSum(int[][] matrix) {
		int n = matrix.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += matrix[i][i]; 
			sum += matrix[i][n - 1 - i]; 
		}

	
		if (n % 2 != 0) {
			sum -= matrix[n / 2][n / 2];
		}

		return sum;
	}

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Sum of diagonals: " + calculateDiagonalSum(matrix));

	}

}
