package com.ty.learnjava17.stringprogram;

/*
WAJP to Divide a String in 'N' part -: exp Input : "abcd" Output: ab cd, Input "abcde" 
Output : String can't divide in two part
*/

public class DivideString {

	public static void main(String[] args) {

		String inputString = "abcdefghijkl";
		String outputString = " ";
		if (inputString.length() % 2 != 0) {

			System.out.println("The String can't divide in two part");
		} else {
			outputString = inputString.substring(0, inputString.length() / 2);

			System.out.println("Input :" + inputString);

			System.out.println("Output :\n" + outputString);

			outputString = inputString.substring(inputString.length() / 2, inputString.length());
			System.out.println(outputString);
		}

	}
}
