
package com.ty.learnjava17.stringprogram;

public class WhyStringImmutable {

	public static void main(String[] args) {
		
		String s1 ="Hello";
		String s2 = "world";
		
		s1 =s1+ "world";
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
