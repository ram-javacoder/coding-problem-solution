package com.learnjava17.java8programming.methodreference;

import java.util.function.BiFunction;

public class StaticMethodMultiply {

	public static int multiplyNum(int a, int b) {

		return a * b;

	}

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> biFun = StaticMethodMultiply::multiplyNum;
		int mul = biFun.apply(12, 5);
		System.out.println("Multiplication two number : " + mul);

	}

}
