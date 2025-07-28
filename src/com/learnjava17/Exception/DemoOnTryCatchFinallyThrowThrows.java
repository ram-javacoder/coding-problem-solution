package com.learnjava17.Exception;

public class DemoOnTryCatchFinallyThrowThrows {

	public static void main(String[] args) {

		try {
			String welcomeMsg = welcomeMessage(null);
			System.out.println("The returned welcome message : " + welcomeMsg);

		} catch (NullPointerException e) {

			System.out.println(e.toString());
		}

		catch (ArrayIndexOutOfBoundsException n) {
			System.out.println(n.toString());
		}

		finally {
			System.out.println("finaly block contain importan code, it is always executed!...");
		}

	}

	private static String welcomeMessage(String string) throws NullPointerException {

		if (string == null) {

			throw new NullPointerException();
		}

		String welcomeMsg = "Welcome" + string;

		return welcomeMsg;
	}

}
