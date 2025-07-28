package com.javalearn17.enumeration;

enum color {

	RED, GREEN, YELLOW;

	private color() {
		System.out.println("Constructor called for :" + this.toString());

	}

	public void colorInfo() {

		System.out.println("Universal color");
	}

}

public class EnumWithMethod {

	public static void main(String[] args) {

		color c = color.YELLOW;
		c.colorInfo();
	}

}
