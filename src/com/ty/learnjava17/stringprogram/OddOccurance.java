package com.ty.learnjava17.stringprogram;

import java.util.Iterator;

public class OddOccurance {

	public static void main(String[] args) {
		String str = "java programming";
		System.out.println("Original String :" +str);
		System.out.println("Odd Occurances :");
		int occurance[] = new int[256];

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (c != ' ') {

				occurance[str.charAt(i)]++;

			}

		}

		for (int i = 0; i < occurance.length; i++) {

			if (occurance[i] % 2 != 0) {

				System.out.println((char) i + " : " + occurance[i]);
			}
		}

	}

}
