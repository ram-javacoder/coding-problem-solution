package com.learnjava17.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 1; i <= 5; i++) {
			int taskId = i;
			executor.submit(() -> {
				System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000); // Simulate work
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Task " + taskId + " is completed");
			});
		}

		executor.shutdown();
	}

}
