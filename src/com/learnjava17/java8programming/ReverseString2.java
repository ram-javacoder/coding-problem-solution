package com.learnjava17.java8programming;

import java.util.stream.IntStream;

//Example program Reverse String without using any predefined Method
public class ReverseString2 {

	public static void main(String[] args) {
		
		String str= "I Love Java";
		
		String reversedString = IntStream.rangeClosed(1, str.length()).mapToObj(i -> str.charAt(str.length()-i))
		.reduce("",(s,c) -> s+c, (s1,s2) -> s1+s2);
		
		System.out.println("Original String: " +str);
		System.out.println("Reversed String: " +reversedString);
	}
}
