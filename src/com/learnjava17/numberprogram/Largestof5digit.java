package com.learnjava17.numberprogram;

import java.util.Scanner;

public class Largestof5digit {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the 5 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int res = ((a > b && a > c && a > d && a > e) ? a
				: (b > c && b > d && b > e) ? b : (c > d && c > e) ? c : (d > e) ? d : e);

		System.out.println("Largest number is :" + res);
	}

}
