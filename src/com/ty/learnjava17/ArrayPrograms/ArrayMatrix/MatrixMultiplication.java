package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
	
	//Another matrix to store the Sum of the matrix
		int c[][]=new int [3][3]; //3 rows 3 columns
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				c[i][j]=a[i][j] * b[i][j];
				System.out.print(c[i][j]+ " ");
				
			}
			System.out.println();
			
		}
	
		
		
	}

}
