package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

public class MatrixMultiplicationOddNum {

	public static void main(String[] args) {

		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
		int b[][] = { { 4, 5, 3 }, { 3, 1, 4 }, { 3, 4, 2 } };

		int result[][] = new int[a.length][b.length];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				int r1 = a[i][j] % 2;
				int r2 = b[i][j] % 2;
				if (r1 != 0 && r2 != 0) {

					result[i][j] = a[i][j] * b[i][j];
				}
			}
		}

		for (int i = 0; i < result.length; i++) {

			for (int j = 0; j < result.length; j++) {

				System.out.print(result[i][j] + " ");

			}
			System.out.println();
		}

	}
}
