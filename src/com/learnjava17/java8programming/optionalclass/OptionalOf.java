package com.learnjava17.java8programming.optionalclass;

import java.util.Optional;

public class OptionalOf {

	public static void main(String[] args) {
		Optional<String> optional1=Optional.of("I Love Java");
		System.out.println("Optional.of() " +optional1);
		
		Optional<String> optional2=Optional.of(" ");
		System.out.println("Empty Optional :" +optional2);

		Optional<String> optional3=Optional.of(null);
		System.out.println(optional3.get());   //Will throw NullPointerException
		
	}

}
