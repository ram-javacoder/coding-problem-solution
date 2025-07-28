package com.learnjava17.java8programming;

public class CountOfLetter {

	public static void main(String[] args) {

		String str = "I Like to play cricket";
		Long countOfLetter = str.chars().mapToObj(c -> (char) c).filter(c -> Character.toLowerCase(c) == 'i').count();
		System.out.println("No.of letter 'i' : " + countOfLetter);

	}
}
