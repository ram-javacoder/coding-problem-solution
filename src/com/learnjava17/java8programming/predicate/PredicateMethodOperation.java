package com.learnjava17.java8programming.predicate;

import java.util.function.Predicate;

public class PredicateMethodOperation {

	public static void pred(int number, Predicate<Integer> predicate) {

		if (predicate.test(number)) {

			System.out.println("Number :" + number);
		}

	}

	public static void main(String[] args) {

		// 1. test(T t) : Evaluates this predicate on the given argument.boolean test(T
		// t)

		// Create Predicate
		Predicate<Integer> lesserthan = i -> (i < 18); // Check value is lesser than 18 or not
		System.out.println(lesserthan.test(10)); // True

		// 2. Check condition using 'and' Operator

		Predicate<Integer> greaterthanTen = g -> (g > 10);
		Predicate<Integer> lesserthanTwentyFive = l -> (l < 25);
		System.out.println(greaterthanTen.and(lesserthanTwentyFive).test(12)); // true

		// 3. Predicate in to Function
		pred(10, (i)-> i>7); //Check 10 is greater than 7 
	
		//4.
		
	}

}
