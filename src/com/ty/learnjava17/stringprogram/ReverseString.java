package com.ty.learnjava17.stringprogram;

import java.util.Arrays;

public class ReverseString {

	// Reverse String
	public static void main(String[] args) {

		String str = "I Love Programming";
		System.out.println("String before reversing :" + str);
		String arr[] = str.split(" ");

		System.out.print("String after reversing :");
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + " ");

		}

	}

}
