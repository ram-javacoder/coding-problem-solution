package com.learnjava17.multithreading;

public class PrintCharacterSynchronize {

	synchronized void printChar() {

		for (char i = 'A'; i <= 'Z'; i++) {
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
