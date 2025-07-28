package com.learnjava17.java8programming.optionalclass;

import java.util.Optional;

public class OptionalOfNullable {

	public static void main(String[] args) {
		
		Optional<String> optional1=Optional.ofNullable("I Love Java");
		System.out.println(optional1.get()); //I Love Java

		Optional<String> optional2=Optional.ofNullable(null);
		System.out.println(optional2); //empty optional
		System.out.println(optional2.get());// It will throw NoSuchElementException
		
	}

}
