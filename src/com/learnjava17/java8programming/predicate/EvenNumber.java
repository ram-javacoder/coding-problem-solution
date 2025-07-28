package com.learnjava17.java8programming.predicate;

import java.util.function.Predicate;

public class EvenNumber {

	public static void main(String[] args) {

		Predicate<Integer> even = e -> e % 2 == 0;
		System.out.println(even.test(10));// true
		System.out.println(even.test(13));// false
		System.out.println(even.test(4)); // true
		System.out.println(even.test(7)); // false

		//Check whether String length is greater than 7
		Predicate<String> checkLength=l -> l.length()>7;
		System.out.println(checkLength.test("Ramkumar")); //true
		
	}
}
