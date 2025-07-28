package com.learnjava17.java8programming.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BIpredicateEvenNumber {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		BiPredicate<Integer, Integer> EvenNumber = (i, j) -> i % j == 0;

		for (Integer integer : number) {

			if (EvenNumber.test(integer,2)) {

				System.out.print(integer+ " ");
			}
		}

	}

}

//Output : 2 4 6 8 10
