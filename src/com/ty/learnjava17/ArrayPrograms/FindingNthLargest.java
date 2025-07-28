package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FindingNthLargest {

	// Finding Nth Largest Element
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int arr[] = { 12, 9, 18, 5, 7,18 };
		// Sorting Array Element
		Arrays.sort(arr);
		System.out.println("Array Element after sorting :" + Arrays.toString(arr));
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		int count = 0;
		for (int i = arr.length - 1; i > 0; i--) {

			if (arr[i] != arr[i - 1]) {

				count++;
				if (count == n) {

					System.out.println(arr[i] + " is " + n + " largest element");
					break;
				}
			}
			if (i - 1 == 0) {

				System.out.println("LENGTH IS MORE THAN THE ELEMENTS");
			}
		}

	}

}

/*
Array Element after sorting :[5, 7, 9, 12, 18]
Enter the N value :
4
7 is 4 largest element

*/