package com.ty.learnjava17.stringprogram;

public class ValidPIN {

	public static String checkValidPINOrNot(String validPIN) {
		if ((validPIN.length() == 4 || validPIN.length() == 6) && (!validPIN.matches(".*[a-zA-Z]+.*"))) {

			return "This is valid PIN";

		}

		return "This is not valid PIN";

	}

	public static void main(String args[]) {

		String validPIN = "891111";
		String result = checkValidPINOrNot(validPIN);
		System.out.println(result);

	}

}
