package com.learnjava17.multithreading;

class Mythread extends Thread {
	@Override
	public void run() {

		for (char i = 'A'; i <= 'Z'; i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.println(i);

		}
	}

}

public class User {

	public static void main(String[] args) throws InterruptedException {

		Mythread m = new Mythread();
		m.start();

	}

}
