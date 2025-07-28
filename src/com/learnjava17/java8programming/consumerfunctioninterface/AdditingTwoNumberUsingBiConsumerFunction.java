package com.learnjava17.java8programming.consumerfunctioninterface;

import java.util.function.BiConsumer;

public class AdditingTwoNumberUsingBiConsumerFunction {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> add = (i, j) -> System.out.println(i + " + " + j + " = " + (i + j));
		add.accept(1, 2);
		add.accept(3, 4);
		add.accept(5, 6);
		add.accept(7, 8);
		add.accept(9, 10);
	}

}
