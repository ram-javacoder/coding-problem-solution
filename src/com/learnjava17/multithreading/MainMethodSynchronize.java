package com.learnjava17.multithreading;

public class MainMethodSynchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNumberSynchronize pn=new PrintNumberSynchronize();
		PrintCharacterSynchronize pc=new PrintCharacterSynchronize();
		MyThreadPrintNumber t=new MyThreadPrintNumber(pn);
		MyThreadPrintCharacter t1=new MyThreadPrintCharacter(pc);
		t.start();
		t1.start();
	}



}
