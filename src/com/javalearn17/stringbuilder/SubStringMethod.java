package com.javalearn17.stringbuilder;

public class SubStringMethod {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("I Love Java");
		StringBuilder str2 = new StringBuilder("I Love Java Programming");

		System.out.println(str.substring(4));
		System.out.println(str.substring(3, 8));
	}

}
