package com.ty.learnjava17.ArrayPrograms;

import java.util.Scanner;

public class SecondOccurancefind {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a[] = { 1, 3, 1, 2, 4, 2, 3 };
		int count = 0;
		System.out.println("Enter the element to find of its second Occurance");
		int n = sc.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (n == a[i]) {
				count++;
				if (count > 1) {
					System.out.println("Second occurance of " + n + " is :" + i + " index position");

					break;
				}

			}

		}
		if (count == 1 || count == 0) {

			System.out.println("There is no Second occurance of this element!...");
		}

	}

}
