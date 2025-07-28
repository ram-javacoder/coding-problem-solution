package com.learnjava17.java8programming.predicate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

//Using 'and()' 'or()' 'negate()'


public class PredicateJoiningOperation {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 52, 31, 47, 15, 6, 77, 84, 92, 101);

		Predicate<Integer> even = e -> e % 2 == 0;
		Predicate<Integer> and = e -> e > 20;
		System.out.println("List of Numbers :" + numbers);
		System.out.println("\nList of even numbers");
		for (Integer evenNum : numbers) {

			if (even.test(evenNum)) {
				System.out.println(evenNum);
			}
		}

		System.out.println("\nList of even numbers that are greater than 20 :");
		for (Integer evenAndgreaterthan20 : numbers) {

			if (even.and(and).test(evenAndgreaterthan20)) {  //Using and()  method
				System.out.println(evenAndgreaterthan20);
			}
		}
		
		

	}
}
