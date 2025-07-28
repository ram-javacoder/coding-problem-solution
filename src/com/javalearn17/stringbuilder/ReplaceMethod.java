package com.javalearn17.stringbuilder;

public class ReplaceMethod {

	public static void main(String[] args) {
		
		StringBuilder str1=new StringBuilder("I Love Java Programming");
		System.out.println(str1.replace(7, 11, "Python"));
	}
}
