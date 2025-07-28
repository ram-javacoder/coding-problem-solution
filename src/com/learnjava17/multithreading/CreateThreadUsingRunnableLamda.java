package com.learnjava17.multithreading;

public class CreateThreadUsingRunnableLamda {

	public static void main(String[] args) {
		
		 // Creating a thread using Runnable and Lambda expression
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + i);
                try {
                    Thread.sleep(500); // Pause for 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Creating and starting the thread
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread is running...");
		
	}
}
