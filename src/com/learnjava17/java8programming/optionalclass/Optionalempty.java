package com.learnjava17.java8programming.optionalclass;

import java.util.Optional;

public class Optionalempty {

	public static void main(String[] args) {

		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional); // Optional.empty
		System.out.println(emptyOptional.get()); //NoSuchElementException

	}
}
