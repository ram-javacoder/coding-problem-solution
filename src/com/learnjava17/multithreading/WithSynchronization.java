package com.learnjava17.multithreading;

class Table1 {
	synchronized void printTable(int n) {// synchronized method
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThreadA extends Thread {
	Table1 t;

	MyThreadA(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThreadB extends Thread {
	Table1 t;

	MyThreadB(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class WithSynchronization {

	public static void main(String[] args) {

		Table1 obj = new Table1();// only one object
		MyThreadA t1 = new MyThreadA(obj);
		MyThreadB t2 = new MyThreadB(obj);
		t1.start();
		t2.start();
	}
}
