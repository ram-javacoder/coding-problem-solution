package com.learnjava17.java8programming.optionalclass;

import java.util.Optional;

public class IsPresentExample {

	public static void main(String[] args) {
		
		Optional<String> optional1=Optional.of("I Love Java");
		checkforValue(optional1);
		
		Optional<String> optional2=Optional.ofNullable(null);
		checkforValue(optional2);
		
		Optional<String> optional3=Optional.empty();
		checkforValue(optional3);
		
	}

	private static void checkforValue(Optional<String> optional) {
		if (optional.isPresent()) {
			System.out.println("Optional  Value is Present ");
		} else {

			System.out.println("Value is not Present ");
			//System.out.println(optional);
		}
		
		
	}
}
