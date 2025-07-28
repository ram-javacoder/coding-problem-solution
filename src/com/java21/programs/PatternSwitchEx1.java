package com.java21.programs;

public class PatternSwitchEx1 {

	public static void main(String[] args) {

		// type:1

		printType("Ram");
		printType(30);
		printType(40000.00);

		// type:2
		System.out.println(classify(null));
		System.out.println(classify("Java"));

		// type:3
		System.out.println(analyseType(5));
		System.out.println(analyseType(12));
		System.out.println(analyseType("Text"));

	}

	private static String analyseType(Object obj) {

		return switch (obj) {
		case Integer i when i < 10 -> "Single digit number: "+(i);
		case Integer i when i > 10 -> "Double digit number: " +(i);
		case String s -> "It is String: " +(s);
		default -> "Unrecognized type";

		};
	}

	private static String classify(Object obj) {

		return switch (obj) {
		
		case null -> "It is null";
		case String s -> "It is String";
		default -> "Something else";
		};
	}

	private static void printType(Object obj) {
		String result = switch (obj) {

		case Integer i -> "It is an Integer: " + (i + 10);
		case String s -> "It is a String: " + s.toUpperCase();
		case Double d -> "It is a double: " + (d);
		default -> "Unknown type";

		};
		System.out.println(result);

	}
}
