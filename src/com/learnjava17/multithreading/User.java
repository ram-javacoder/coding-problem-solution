package com.learnjava17.multithreading;

class Mythread extends Thread {
	@Override
	public void run() {

		for (char i = 'A'; i <= 'Z'; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);

		}
	}

}

public class User {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Mythread m = new Mythread();
		m.start();
		
//
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("MyThread 2.0 :");
//		}

	}

}
