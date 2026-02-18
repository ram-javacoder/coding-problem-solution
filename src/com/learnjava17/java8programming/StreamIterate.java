package com.learnjava17.java8programming;

import java.util.stream.Stream;

public class StreamIterate {

	public static void main(String[] args) {

		Stream.iterate(0, i -> i + 2).limit(7).forEach(System.out::println);

		// 0 2 4 6 8 10 12
	}
}
