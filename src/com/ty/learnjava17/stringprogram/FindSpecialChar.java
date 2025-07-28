package com.ty.learnjava17.stringprogram;

public class FindSpecialChar {

	 static int count=0;
	public static void main(String[] args) {

		String str = "J@$A&^V#A";
		String specialChar = findingSpecialCharacter(str);
		System.out.println("Input :" + str);
		System.out.println("Special Character which are present in String :" + specialChar+ " Total :" +count) ;

	}

	private static String findingSpecialCharacter(String str) {

		String ans = "";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (!Character.isLetterOrDigit(ch)) {
				count++;
				ans = ans + ch;
			}

		}

		return ans;
	}

}
