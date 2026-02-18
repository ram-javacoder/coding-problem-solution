package com.javalearn17.DataStructureAndAlgorithms;

import java.util.Scanner;

public class BinarySearch {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Enter the Element to be searched :");
		int n = sc.nextInt();
		int firstele = 0;
		int lastele = arr.length - 1;

		while (firstele <= lastele) {

			int mid = (firstele + lastele) / 2;

			if (arr[mid] < n) {

				firstele = mid + 1;
			}

			else if (arr[mid] == n) {

				System.out.println("Element is found at index :" + mid);
				break;

			} else {

				lastele = mid - 1;
			}

			mid = (firstele + lastele) / 2;
		}

		if (firstele > lastele) {

			System.out.println("Element is not found!");
		}

	}

}
