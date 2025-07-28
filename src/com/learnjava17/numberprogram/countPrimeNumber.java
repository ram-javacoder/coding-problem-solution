package com.learnjava17.numberprogram;

import java.util.Scanner;

public class countPrimeNumber {

	static Scanner sc = new Scanner(System.in);

	public static void displayPrimes(int num) {

		if (num == 0 || num == 1) {

			System.out.println("There is no prime number below :" + num);

		} else if (num == 2) {
			System.out.print("Prime numbers below " + num + " : " + num);

		}

		else {
			System.out.print("Prime numbers below " + num + " : ");
			for (int i = 2; i < num; i++) {

				boolean flag = false;
				for (int j = 2; j < i; j++) {

					if (i % j == 0) {

						flag = true;

					}

				}

				if (flag == false) {

					System.out.print(i + " ");

				}

			}
		}

	}

	public static void main(String args[]) {

		System.out.println("Enter the number -> ");

		int num = sc.nextInt();

		displayPrimes(num);

	}

}