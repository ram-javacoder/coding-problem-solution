package com.learnjava17.Exception;

public class UserdefinedException extends Exception {

	private static int accNumber[] = { 1001, 1002, 1003, 1004, 1005 };
	private static String names[] = { "Ram", "John", "david", "Daniel", "Smith" };
	private static double bal[] = { 12000, 14000, 16000, 600, 999 };

	UserdefinedException() {

	}

	UserdefinedException(String str) {

		super(str);
	}

	public static void main(String[] args) {

		try {
			System.out.println("Account Number :" + " Customer :" + " Balance ");

			for (int i = 0; i < accNumber.length; i++) {

				System.out.println(accNumber[i] + " " + names[i] + " " + bal[i]);

				if (bal[i] < 1000) {

					UserdefinedException me = new UserdefinedException("Balance is lessthan 1000");
					throw me;
				}

			}

		} catch (UserdefinedException e) {
			e.printStackTrace();
		}

	}

}
