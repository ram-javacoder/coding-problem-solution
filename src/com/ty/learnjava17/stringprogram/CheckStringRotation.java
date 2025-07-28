
package com.ty.learnjava17.stringprogram;

//Check String 1 is Rotation of String 2
//Rotation String Exp: 12345678 ->78123456

public class CheckStringRotation {

	public static void main(String[] args) {

		String s1 = "tiger";

		String s2 = "ertig";  //Check this String rotation version of s3      

		String s3 = s1 + s1;
		

		if (s1.length() != s2.length()) {
			System.out.println("s2 is not rotated version of s1");
		} else if (s3.contains(s2)) {

			System.out.println("s2 is a rotated version of s1");

		} else {
			System.out.println("s2 is not rotated version of s1");
		}
	}

}
