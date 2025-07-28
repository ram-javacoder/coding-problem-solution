package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddandEvenNum {

	// Printing Odd and Even Number
	public static void main(String[] args) {

		List<Integer> OddEven = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> Even = OddEven.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

		List<Integer> Odd = OddEven.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

		System.out.println("Even Numbers :" + Even);
		System.out.println("Odd Nubers :" + Odd);

	}

}
