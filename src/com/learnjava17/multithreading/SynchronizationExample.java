package com.learnjava17.multithreading;

class SynchronizationTest {

	private int count = 0;

	synchronized void increamentCount() { // You will different actual value without using synchronization

		count++;
	}

	int totalCount() {

		return count;
	}

}

public class SynchronizationExample {

	public static void main(String[] args) throws InterruptedException {

		SynchronizationTest syn = new SynchronizationTest();
		Thread t1 = new Thread(() -> { // Even though you're not explicitly using Runnable, the lambda expression
										// automatically creates an instance of Runnable for the Thread constructor.

			for (int i = 0; i < 1000; i++) {

				syn.increamentCount();
			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 0; i < 1000; i++) {

				syn.increamentCount();
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Expected count 1000 : actual count : " + syn.totalCount());

	}

}
