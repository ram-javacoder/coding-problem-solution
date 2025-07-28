package com.ty.learnjava17.ArrayPrograms;

import java.util.Scanner;

public class LeftRotation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ele[] = { 1, 2, 3, 4, 5, 6 };
		System.out.print("Array Elements before left rotation : ");

		for (int i = 0; i < ele.length; i++) {

			System.out.print(ele[i] + " ");

		}

		System.out.println("\nEnter the index value at which position want to rotate :");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int j, first = ele[0];
			for (j = 0; j < ele.length - 1; j++) {

				ele[j] = ele[j + 1];

			}
			ele[j] = first;

		}
		
		System.out.print("Elements after left roration :");
		for (int ans = 0; ans < ele.length; ans++) {

			System.out.print(ele[ans] + " ");

		}

	}
}
