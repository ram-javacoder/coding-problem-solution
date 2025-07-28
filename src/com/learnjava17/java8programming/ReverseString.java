package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Java Program";

		String reveredString = Arrays.stream(str.split(""))
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list.stream();

				})).collect(Collectors.joining(""));

		System.out.println("Output : " + reveredString);
	}
}
