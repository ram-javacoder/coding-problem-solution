package com.learnjava17.Exception;

public class ThrowExp {

	static void help() {
		try {
			
			throw new NullPointerException("UnKnow Error");
		} catch (NullPointerException e) {
		
			System.out.println("Caught Inside help");
			throw e;
		}
		
		
	}

	public static void main(String[] args) {

		try {

			help();
		} catch (NullPointerException e) {

			System.out.println("Caught in main error name given below:");
			System.out.println(e);

		}

	}
}
