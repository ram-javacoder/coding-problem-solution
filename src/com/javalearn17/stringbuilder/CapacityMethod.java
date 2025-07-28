package com.javalearn17.stringbuilder;

//public int capacity();

public class CapacityMethod {

	public static void main(String[] args) {

		StringBuilder emptyString = new StringBuilder();
		int a = emptyString.capacity();

		StringBuilder string = new StringBuilder("Java Programming");
		int b = string.capacity();

		StringBuilder stringCapacity = new StringBuilder(" ");
		int c = stringCapacity.capacity();

		StringBuilder setCapacity = new StringBuilder(65);
		int d = setCapacity.capacity();

		System.out.println("Empty String capacity :" + a);
		System.out.println("String capacity of \'Java Programming\'" + b);
		System.out.println("Capacity of Empty String double colon :" + c);
		System.out.println(d);
	}
}
