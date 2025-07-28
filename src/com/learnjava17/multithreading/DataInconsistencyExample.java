package com.learnjava17.multithreading;

public class DataInconsistencyExample extends Thread {

	private static StringBuilder sb = new StringBuilder();

	public static void appendA() {

		for (int i = 0; i < 10; i++) {
			sb.append("a");
		}

	}

	public static void appendB() {

		for (int i = 0; i < 10; i++) {
			sb.append("b");
		}

	}

	@Override
	public void run() {
		appendA();
	}

	

	public static void main(String[] args) throws Exception {

		
	}

}
