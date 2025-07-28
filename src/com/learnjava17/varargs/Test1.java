package com.learnjava17.varargs;

public class Test1 {

	public static void fun(int... x) {
		System.out.println("Length of x is :" + x.length);

		for (int i : x) {
			System.out.print(i + " ");
			System.out.println();
		}

	}

	public static void main(String[] args) {

		fun(100);
		fun(1, 2, 3, 4, 5);
		fun();

	}

}
