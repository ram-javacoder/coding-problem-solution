package com.ty.learnjava17.stringprogram;

public class ReverseStringUsingSubStringway2 {

	public static void main(String[] args) {

		String string = "I am a Java Developer";
		String stringArray[] = string.split(" ");
		String reverseString = " ";

		for (int i = 0; i < stringArray.length; i++) {

			String subString = stringArray[i].substring(0, stringArray[i].length());

			for (int j = subString.length()-1; j >=0; j--) {

				reverseString = reverseString + subString.charAt(j);

			}
			reverseString=reverseString+" ";
			
			
		}
		System.out.println("String before reverse :" + string);
		System.out.println("String after reverse :" + reverseString);

	}

}
