package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

// input : I LOVE JAVA PROGRAMMING
// output : PROGRAMMING JAVA LOVE I

public class ReverseArrayElement {

	public static void main(String[] args) {

		String str = "I LOVE JAVA PROGRAMMING";

		String reverseArr = Arrays.stream(str.split(" "))
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list.stream();
				})).collect(Collectors.joining(" "));

		System.out.println("Original String : " + str);
		System.out.println("String after reversing : " + reverseArr);

	}

}
