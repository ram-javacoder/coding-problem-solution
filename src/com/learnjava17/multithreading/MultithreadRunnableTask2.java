package com.learnjava17.multithreading;

class MyThreadCLass implements Runnable {
	@Override
	public void run() {
		// Job of thread
		for (int i = 0; i <= 10; i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+ " ");
		}
	}

}


public class MultithreadRunnableTask2 {

	public static void main(String[] args) {
		
		MyThreadCLass m = new MyThreadCLass();
		// m.start(); CTE because no start() in Mythread class
		Thread t = new Thread(m);
		t.start(); // Creating thread by calling run()
//		for (int i = 0; i <= 5; i++) {
//
//			System.out.println("Main Thread...");
//		}

	}

}
