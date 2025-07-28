package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

public class TransposeMatrix {

	public static void main(String[] args) {
		int row = 2, col = 3;

		int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 } };

		System.out.println("Before Transpose Matrix :");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print(matrix[i][j] + " ");
			}

			System.out.println(" ");
		}
		System.out.println("After Transpose Matrix :");

		for (int i = 0; i < col; i++) {

			for (int j = 0; j < row; j++) {

				System.out.print(matrix[j][i] + " ");

			}
			System.out.println(" ");
		}

	}

}

/*

Before Transpose Matrix :
2 3 4  
5 6 4  
After Transpose Matrix :
2 5  
3 6  
4 4  

*/