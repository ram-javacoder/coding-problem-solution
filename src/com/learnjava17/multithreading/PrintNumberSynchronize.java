package com.learnjava17.multithreading;

public class PrintNumberSynchronize {

	synchronized void printnum() {

		for (int i = 1; i <= 26; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);

		}

	}

}
