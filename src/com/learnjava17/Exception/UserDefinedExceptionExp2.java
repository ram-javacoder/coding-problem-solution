package com.learnjava17.Exception;

import java.util.Scanner;

class UserDefinedException extends RuntimeException {

	
	UserDefinedException(String msg) {
		super(msg);

	}

}

public class UserDefinedExceptionExp2 {

	public static void checkEligible(int age) throws UserDefinedException {
		if (age < 18) {
			throw new UserDefinedException("Age must be greater than 18");

		} else {
			System.out.println("Your are eligible for vote");
		}

	}

	public static void main(String args[]) {

		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Enter your age.");
			int age = sc.nextInt();
			checkEligible(age);
		} catch (UserDefinedException e) {

			System.out.println("Exception occure: " + e.getMessage());
		} finally {

			System.out.println("Hi, I am finally block always executed");
		}
	}

}
