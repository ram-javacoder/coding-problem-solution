package com.ty.learnjava17.stringprogram;

public class vowels {

	// Java program to find the total number of vowels present in a string?

	public static void main(String[] args) {

		String str = "TechElevate";

		int count = 0;
		int con = 0;
		String cons = "";
		System.out.println("String :" + str);
		System.out.print("Vowels :");
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e'
					|| str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'u') {

				count++;
				System.out.print(str.charAt(i) + " ");

			}

			else {
				con++;
				cons = cons + str.charAt(i)+ " ";

			}

		}
		System.out.println("\nTotal number of Vowels present in String :" + count);
		System.out.println("Consonents :" + cons);
		System.out.println("Total number of Consonent in String :" + con);

	}

}
