package com.ty.learnjava17.stringprogram;

public class Punctuation {

	public static void main(String[] args) {

		String str = "Hi... Welcome to Testyandra!";
		int count = 0;

		System.out.print("Punctuation in this String : ");
		for (int i = 0; i < str.length(); i++) {

			/*
			 * if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' ||
			 * str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||
			 * str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
			 * 
			 * count++; System.out.print(str.charAt(i) + " ");
			 * 
			 * }
			 */

			if (!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i) != ' ') {

				count++;
				System.out.print(str.charAt(i) + " ");

			}

		}

		System.out.println("\nTotal number of Punctuation :" + count);

	}

}
