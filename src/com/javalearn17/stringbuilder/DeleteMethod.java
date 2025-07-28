package com.javalearn17.stringbuilder;

public class DeleteMethod {

	public static void main(String[] args) {

		StringBuilder deleteSubstring = new StringBuilder("I Love JavaProgramming");
		deleteSubstring.delete(11, deleteSubstring.length());
		System.out.println(deleteSubstring);

//		delete Character at specified Index Position using deleteCharAt() method

		StringBuilder deleteVowels = new StringBuilder("I Love Java Programming");
		System.out.println("Before removing Vowels :" + deleteVowels);
		for (int i = 0; i < deleteVowels.length(); i++) {

			if (deleteVowels.charAt(i) == 'A' || deleteVowels.charAt(i) == 'a' || deleteVowels.charAt(i) == 'E'
					|| deleteVowels.charAt(i) == 'e' || deleteVowels.charAt(i) == 'I' || deleteVowels.charAt(i) == 'i'
					|| deleteVowels.charAt(i) == 'O' || deleteVowels.charAt(i) == 'o' || deleteVowels.charAt(i) == 'U'
					|| deleteVowels.charAt(i) == 'u') {

				deleteVowels.deleteCharAt(i);

			}

		}

		System.out.println("After removing vowels :" + deleteVowels);

	}

}
