package com.javalearn17.enumeration;

public class DeclaringEnumInsideClass {

	public static void main(String[] args) {

		enum Color {

			RED, GREEN, YELLOW
		}

		Color c = Color.RED;

		System.out.println("Accessing single constant value : " + c);
		System.out.println("Accessing all constant values ");

		Color c1[] = Color.values();

		for (Color color : c1) {

			System.out.println(color);
		}

	}
}
