package com.learnjava17.Exception;

public class NullPointerExceptionExp {

	public static void main(String[] args) {

		try {

			String str = null;
			int strlength = str.length();
			System.out.println(strlength);

		} catch (NullPointerException e) {

			System.out.println("NullPointer Exception Occure...");
		}

	}

}
