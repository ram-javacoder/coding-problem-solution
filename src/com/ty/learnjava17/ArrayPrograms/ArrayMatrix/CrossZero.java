package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

/*
output : 

0 6 0 
4 0 6 
0 6 0 

*/
public class CrossZero {

	public static void main(String[] args) {

		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
		int c[][] = new int[a.length][b.length];

		for (int i = 0, k = a.length-1; i < a.length; i++, --k) {
			int j;
			for (j = 0; j < b.length; j++) {

				if (i == j) {

					c[i][j] = 0;
				} else {

					c[i][j] = a[i][j] + b[i][j];
				}

			}
			c[i][k] = 0;

		}

		for (int r1 = 0; r1 < c.length; r1++) {

			for (int c1 = 0; c1 < c.length; c1++) {

				System.out.print(c[r1][c1] + " ");
			}
			System.out.println();

		}

	}
}
