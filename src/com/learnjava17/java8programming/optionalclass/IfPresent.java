package com.learnjava17.java8programming.optionalclass;

import java.util.Optional;

public class IfPresent {

	public static void main(String[] args) {

		Optional<String> optional1 = Optional.of("I Love Java");
		optional1.ifPresent(opt -> System.out.print("Value present for :" + opt));

		Optional<String> optional2 = Optional.ofNullable(null);
		optional2.ifPresent(opt -> System.out.println("Value is present for :" + opt));

		Optional<String> optional3 = Optional.empty();
		optional3.ifPresent(opt -> System.out.println("value is present for :" + opt));

	}
}
