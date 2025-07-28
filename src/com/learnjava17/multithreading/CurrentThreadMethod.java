package com.learnjava17.multithreading;

public class CurrentThreadMethod {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println("The name of current Thread is :" + t.getName());
	}

}
