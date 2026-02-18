package com.javalearn17.DataStructureAndAlgorithms;

import java.util.Scanner;

public class LinearSearch {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Enter the element which you want to search");
		int n = sc.nextInt();
		boolean flag = false;
		int i;
		for (i = 0; i < arr.length; i++) {

			if (arr[i] == n) {

				flag = true;
				break;
			}

		}

		if (flag == true) {

			System.out.println("Element present at " + i + " index position");
		} else {

			System.out.println("The Entered element not present in Array!");
		}

	}

}
