package com.javalearn17.enumeration;

interface PizzaDisplay {

	public void displaySize();
}

enum SizePizza implements PizzaDisplay {

	SMALL, MEDIUM, LARGE, EXTRALARGE;

	@Override
	public void displaySize() {

		System.out.println("The size of pizza is : " + this);

	}

}

public class EnumInterfaceExa2 {

	public static void main(String[] args) {

		SizePizza.MEDIUM.displaySize();
		
	}
}
