package com.learnjava17.multithreading;

public class MyThreadPrintNumber extends Thread {

	PrintNumberSynchronize pn;

	public MyThreadPrintNumber(PrintNumberSynchronize pn) {

		this.pn = pn;
	}

	@Override
	public void run() {

		pn.printnum();

	}

}
