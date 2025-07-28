package com.ty.learnjava17.stringprogram;

import java.util.Scanner;

public class Palindrome {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			res = res + str.charAt(i);

		}

		if (str.equalsIgnoreCase(res)) {

			System.out.println("The given String is Palindrome");
		} else {

			System.out.println("The given String is not Palindrome");
		}

	}

} 
