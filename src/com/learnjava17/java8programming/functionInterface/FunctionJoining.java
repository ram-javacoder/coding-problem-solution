package com.learnjava17.java8programming.functionInterface;

import java.util.function.Function;

//andThen(),compose()
public class FunctionJoining {

	public static void main(String[] args) {

		Function<Integer, Integer> doubleNum = d -> 2 * d; // Multiplying by 2
		Function<Integer, Integer> squareNum = s -> s * s; // Sqaure the Number

		System.out.println(doubleNum.apply(5));
		System.out.println(squareNum.apply(5));

		System.out.println("Double the Number and square of it :");
		System.out.println(doubleNum.andThen(squareNum).apply(2));
		System.out.println("Sqaure the Number double it :");
		System.out.println(doubleNum.compose(squareNum).apply(4));// Square the number 4 and then double it

	}
}
