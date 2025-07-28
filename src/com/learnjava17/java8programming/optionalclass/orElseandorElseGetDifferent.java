package com.learnjava17.java8programming.optionalclass;

import java.util.Optional;

public class orElseandorElseGetDifferent {

	public static void main(String[] args) {

		Optional<String> language = Optional.empty();

		String str1 = language.orElse("Default Value");

		String str2 = language.orElseGet(()->"Default Value");

		System.out.println(str1);
		System.out.println(str2);
	}

}
