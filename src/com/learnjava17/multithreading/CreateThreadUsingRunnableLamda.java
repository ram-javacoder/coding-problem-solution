package com.learnjava17.multithreading;

public class CreateThreadUsingRunnableLamda {

	public static void main(String[] args) {
		
		 // Creating a thread using Runnable and Lambda expression
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + i);
                
                    try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} // Pause for 500ms
                 
            }
        };

        // Creating and starting the thread
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread is running...");
		
	}
}
