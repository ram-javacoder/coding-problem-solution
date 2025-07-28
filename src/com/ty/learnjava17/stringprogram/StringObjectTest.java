package com.ty.learnjava17.stringprogram;

public class StringObjectTest {

	public static void main(String[] args) {

		String s = "Java";
		String s3 = "Java ";
		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s2 == s);
		System.out.println(s == s3);
		System.out.println(s.equals(s2));
		System.out.println(s == s3);

		s = s.concat(s3);
		String b =s.strip();
		System.out.println(b);
		/*
		 * In your Java code, you're trying to concatenate s with s3 using the concat()
		 * method. The concat() method returns a new string that represents the
		 * concatenation of the invoking string with the parameter string, but it does
		 * not modify the original string.
		 */

		System.out.println(s == s3);

	}

}
