package com.learnjava17.java8programming.methodreference;

//static method using method reference 

@FunctionalInterface
interface sum {

	void add(int a, int b);

}

public class StaticMethodSumTwoNumber {

	public static void addNum(int x, int y) {

		System.out.println("Addition of two Numbers :" + (x + y));

	}

	public static void main(String[] args) {

		sum s = StaticMethodSumTwoNumber::addNum; //Method reference
		s.add(23, 20);

		//If StaticMethodSumTwoNumber class has non-static method we will write like
		//MultiplyNumber m = new MultiplyNumber();
		//MulOfNum i =  m:mul;
		// i.mul(12,12);
		
		
	}
}
