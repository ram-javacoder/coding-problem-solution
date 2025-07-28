package com.ty.learnjava17.stringprogram;

public class RemoveCharacter {

	public static void main(String[] args) {

		String str = "CloudTech";

		// Alternative method --> str= str.replace("C", "");

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'C' || str.charAt(i) == 'c') {

				String ch = String.valueOf(str.charAt(i));
				str = str.replaceAll(ch, "");

			}

		}
		System.out.println(new String(str));

	}

}
