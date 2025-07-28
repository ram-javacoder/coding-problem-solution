package com.learnjava17.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		// Create a thread pool with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);

		// Submit 5 tasks
		for (int i = 1; i <= 5; i++) {
			int taskNumber = i;
			executor.execute(() -> {
				System.out.println("Running Task " + taskNumber + " by " + Thread.currentThread().getName());
			});
		}

		// Shutdown executor
		executor.shutdown();
	}
}
