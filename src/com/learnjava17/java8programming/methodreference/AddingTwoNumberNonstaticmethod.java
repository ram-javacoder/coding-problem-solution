package com.learnjava17.java8programming.methodreference;

interface sumofNum {

	void adding(int x, int y);
}

public class AddingTwoNumberNonstaticmethod {

	public void add(int x, int y) {

		System.out.println("Addition of Numbers :" + (x + y));
	}

	public static void main(String[] args) {

		AddingTwoNumberNonstaticmethod a = new AddingTwoNumberNonstaticmethod();
		sumofNum s = a::add; // Method reference for Non Static method
		s.adding(20, 14);
	}

}
