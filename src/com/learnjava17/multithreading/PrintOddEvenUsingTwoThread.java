package com.learnjava17.multithreading;

class PrintNumber {

	int countNumber = 1;
	int max = 10;

	public synchronized void printOdd() throws InterruptedException {

		while (countNumber < max) {
			if (countNumber % 2 == 0) {
				wait();
			}
			System.out.println("Odd: " + countNumber++);
			notify();

		}

	}

	public synchronized void printEven() throws InterruptedException {

		while (countNumber < max) {
			if (countNumber % 2 != 0) {

				wait();
			}
			System.out.println("Even: " + countNumber++);
			notify();

		}

	}

}

public class PrintOddEvenUsingTwoThread {

	public static void main(String args[]) {
		PrintNumber printNumber = new PrintNumber();

		Thread oddNumber = new Thread(() -> {

			try {

				printNumber.printOdd();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		});

		Thread evenNumber = new Thread(() -> {

			try {

				printNumber.printEven();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		});

		oddNumber.start();
		evenNumber.start();

	}

}
