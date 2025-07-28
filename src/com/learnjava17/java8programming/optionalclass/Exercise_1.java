package com.learnjava17.java8programming.optionalclass;

import java.util.Optional;

public class Exercise_1 {

	public static void main(String[] args) {

		String[] names = new String[5];
		names[3] = "java";
		Optional<String> checkEmpty = Optional.empty();
		System.out.println(checkEmpty); // Optional.empty

		Optional<String> checkPresent = Optional.of(names[3]);
		System.out.println(checkPresent.isPresent());// true
		System.out.println(checkPresent.hashCode());// 3254818
		// System.out.println(checkEmpty.get()); java.util.NoSuchElementException
		System.out.println(checkPresent.get()); // java

		/* Optional.ofNullable() */
		Optional<String> str = Optional.ofNullable("Java Programming");
		Optional<String> str1 = Optional.ofNullable(null);
		System.out.println(str); // Optional[Java Programming]
		System.out.println(str1); // Optional.empty

	}

}
