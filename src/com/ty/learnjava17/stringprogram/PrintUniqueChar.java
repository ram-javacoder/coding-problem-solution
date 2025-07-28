package com.ty.learnjava17.stringprogram;

import java.util.Iterator;

public class PrintUniqueChar {

	public static void main(String[] args) {
		
		String s="thcehc";
		System.out.println("The Entered String is :" +s);
		String res="";
	for (int i = 0; i < s.length(); i++) {
		
		char ch=s.charAt(i);
		if (res.indexOf(ch)==-1) {
			
			res=res+ch;
		}
	}
	
	System.out.println("After removing all duplicate character :" +res);
	
	}

}

/*
java programming
Unique Character :jav progmin
*/
