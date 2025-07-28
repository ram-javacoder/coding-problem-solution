package com.javalearn17.enumeration;

import java.util.Scanner;

enum Size {

	SMALL("the Size is Small"), MEDIUM("The Size is Medium"), LARGE("The Size is Large"),
	EXTRALARGE("The Size is Extra Large");

	private final String pizzaSize;

	private Size(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public String getSize() {

		return pizzaSize;
	}

}

public class EnumConstructor {

	public static void main(String[] args) {
		
		Size s = Size.SMALL;
		System.out.println(s.getSize());
	}
}
