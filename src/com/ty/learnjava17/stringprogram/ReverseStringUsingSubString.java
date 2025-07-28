package com.ty.learnjava17.stringprogram;

import java.util.Arrays;

public class ReverseStringUsingSubString {

	public static void main(String[] args) {

		String originalString = "I am a JavaDeveloper";
		String stringArray[] = originalString.split(" ");

		for (int i = 0; i < stringArray.length; i++) {

			String subString = stringArray[i].substring(0, stringArray[i].length());
			StringBuilder s = new StringBuilder(subString);
			s = s.reverse();
			stringArray[i] = s.toString();

		}
		System.out.println("Original String :" + originalString.toString());
		System.out.println("Reverse String using subString() :" +Arrays.toString(stringArray));

	}

}
