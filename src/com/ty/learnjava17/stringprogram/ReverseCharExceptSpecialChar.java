package com.ty.learnjava17.stringprogram;

public class ReverseCharExceptSpecialChar {

	public static void main(String[] args) {

		String str = "asfd$i!mn@u&";
		String result = reverseAlphapets(str);
		System.out.println("Original String : " + str);
		System.out.println("Output : " + result);

	}

	private static String reverseAlphapets(String str) {

		char ch[] = str.toCharArray();
		int left = 0;
		int right = ch.length - 1;

		while (left < right) {

			if (!Character.isLetter(ch[left])) {
				left++;

			} else if (!Character.isLetter(ch[right])) {

				right--;

			} else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}

		}

		return new String(ch);
	}


}
