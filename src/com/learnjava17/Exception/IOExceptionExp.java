package com.learnjava17.Exception;

import java.util.Scanner;

public class IOExceptionExp {

	public static void main(String[] args) {

		Scanner s = new Scanner("Hello Java");
		System.out.println("Hi!.. "+ s.nextInt());
		System.out.println("Exception Output :" + s.ioException());
		s.close();

	}

}
