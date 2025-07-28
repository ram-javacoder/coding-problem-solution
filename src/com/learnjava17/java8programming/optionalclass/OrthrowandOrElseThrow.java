package com.learnjava17.java8programming.optionalclass;

import java.util.NoSuchElementException;
import java.util.Optional;

//orThrow() , orElseThrow()
public class OrthrowandOrElseThrow {

	public static void main(String[] args) {

		Optional<String> string1 = Optional.of("value");
		Optional<String> name = Optional.empty();

		
		String exception = string1.orElseThrow(() -> new NoSuchElementException("Value is not present")); // exception
		String value = name.orElseThrow(() -> new IllegalStateException("No value present"));
																										// provided
																											// exceptionSupplier

	}
}
