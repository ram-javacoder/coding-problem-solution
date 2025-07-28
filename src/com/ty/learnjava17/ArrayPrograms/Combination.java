package com.ty.learnjava17.ArrayPrograms;

import java.util.Scanner;

public class Combination {

	// Given two integers n and k , return all possible combinations of k numbers
	// chosen from the range [1,n];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the \'n\' value :");
		int n = sc.nextInt();
		
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {

				System.out.println("[ " + i + "," + j + " ]");

			}
			System.out.println();
		}

	}

}
