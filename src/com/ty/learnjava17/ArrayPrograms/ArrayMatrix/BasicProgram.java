package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class BasicProgram {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the row size :");
		int row = sc.nextInt();
		System.out.println("Enter the column size :");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		System.out.println("Enter the Array elements :");
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {
				
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		
		
		

	}

}
