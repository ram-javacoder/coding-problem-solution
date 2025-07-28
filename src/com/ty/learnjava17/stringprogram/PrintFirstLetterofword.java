package com.ty.learnjava17.stringprogram;

public class PrintFirstLetterofword {

	public static void main(String[] args) {

		String str = "Random Access Memory";
		System.out.println("The given String :" +str);
		String res[] = str.split(" ");
		String firstLetter = "";
		for (int i = 0; i < res.length; i++) {
			char c = res[i].charAt(0);
			firstLetter = firstLetter + c;
		}
		System.out.println("First letter of each word :" +firstLetter);
	}

}
