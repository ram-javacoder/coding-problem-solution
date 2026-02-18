package com.ty.learnjava17.stringprogram;

//Input : aaabbaacce
//Output: a : 3 b : 2 a : 2 c : 2 e : 1

public class InterviewPro1 {

	public static void main(String args[]) {
		String str = "aaabbaggcee";
		countFrequency(str);

		
	}

	public static void countFrequency(String str) {
		int count = 1;
		int i;
		for (i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;

			} else {
				System.out.println(str.charAt(i - 1) + " : " + count);
				count = 1;

			}

		}

		if (count >= 1) {
			System.out.println(str.charAt(i - 1) + " : " + count);

		}

	}

}

//a : 3 b : 2 a : 2 c : 2 e : 1
