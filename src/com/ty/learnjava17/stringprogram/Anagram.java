package com.ty.learnjava17.stringprogram;

import java.util.Arrays;
import java.util.Scanner;

//Check two String is Anagram or not

/*an anagram string refers to a pair of strings that contain the same characters, 
but in a different order.*/


public class Anagram {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Check two String is Anagram or not :");
		System.out.println("Enter the first String :");
		String s1 = sc.nextLine();
		System.out.println("Enter the second String :");
		String s2 = sc.nextLine();
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		if (s1.length() != s2.length()) {

			System.out.println("\nThe given String is not Anagram");
		}

		else if ( Arrays.equals(c1, c2)) {

			System.out.println("\nThe given String is Anagram");
		}

		else {
			System.out.println("\nThe given String is not Anagram");
		}

	}

}

/*
 * Check two String is Anagram or not :
 * 
 * Enter the first String : LISTEN Enter the second String : SILENT
 * 
 * The given String is Anagram
 * 
 * 
 * Enter the first String study Enter the Second String dusty The String is
 * Anagram
 */