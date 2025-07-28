package com.learnjava17.multithreading;

class ThreadClass extends Thread {

	@Override
	public void run() {

		
			
		for (char i = 'A'; i <= 'Z'; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);

		}
	
	}

}


class RunnableThreadClass implements Runnable {
	@Override
	 public void run() {
		// Job of thread
		for (int i = 0; i <= 10; i++) {
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+ " ");
		}
	}

}



public class ThreadRunnable {

	public static void main(String[] args) {

		RunnableThreadClass r =new RunnableThreadClass();
		Thread t=new Thread(r);
		t.start();
		ThreadClass t1= new ThreadClass();
		
		t1.start();
		
	}

}
