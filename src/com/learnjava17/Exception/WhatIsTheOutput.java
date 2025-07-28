package com.learnjava17.Exception;

public class WhatIsTheOutput {
	public static void main(String[] args) {
		System.out.println(testMethod());

	}

	public static int testMethod() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

}
