package com.learnjava17.covariantreturntypes;

class P {

	public int m1(int a, int b) {
		return a + b;
	}

}

class Q extends P {

	@Override
	public int m1(int a, int c) {
		return a *c ;

	}

}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
