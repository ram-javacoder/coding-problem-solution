package com.learnjava17.multithreading;

class Bucket {
	private int data;
	private boolean hasData = false;

	// Producer puts data into the bucket
	public synchronized void produce(int value) throws InterruptedException {
		while (hasData) {
			wait(); // wait until the consumer takes the data
		}
		data = value;
		System.out.println("Produced: " + data);
		hasData = true;
		notify(); // notify consumer
	}

	// Consumer takes data from the bucket
	public synchronized void consume() throws InterruptedException {
		while (!hasData) {
			wait(); // wait until producer puts data
		}
		System.out.println("Consumed: " + data);
		hasData = false;
		notify(); // notify producer
	}
}

public class WaitNotifyExample {

	public static void main(String[] args) {
		Bucket bucket = new Bucket();

		// Producer Thread
		Thread producer = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					bucket.produce(i);
					Thread.sleep(500); // simulate delay
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// Consumer Thread
		Thread consumer = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					bucket.consume();
					Thread.sleep(1000); // simulate delay
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producer.start();
		consumer.start();
	}
}
