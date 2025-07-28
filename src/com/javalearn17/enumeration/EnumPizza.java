package com.javalearn17.enumeration;

import java.util.Scanner;

enum Pizza {

	SMALL, MEDIUM, LARGE, EXTRALARGE

}

public class EnumPizza {

	Pizza pizzas;

	public EnumPizza(Pizza pizza) {
		this.pizzas = pizza;
	}

	public void orderPizza() {

		switch (pizzas) {
		case SMALL :
			System.out.println("You Ordered small size pizza");
			break;
		case MEDIUM:
			System.out.println("You Ordered medium size pizza");
			break;
		case LARGE:
			System.out.println("You Ordered large size pizza");
			break;
		case EXTRALARGE:
			System.out.println("You Ordered extra large size pizza");
			break;

		default:
			System.out.println("Please enter valid size");
			break;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Pizza");
		String size = sc.nextLine();

		EnumPizza e = new EnumPizza(Pizza.valueOf(size));
		e.orderPizza();
	}

}
