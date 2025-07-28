package com.learnjava17.multithreading;

public class MyThreadPrintCharacter extends Thread {

	PrintCharacterSynchronize pc;

	public MyThreadPrintCharacter(PrintCharacterSynchronize pc) {
		// TODO Auto-generated constructor stub
		this.pc = pc;

	}

	@Override
	public void run() {

		pc.printChar();
	}

}
