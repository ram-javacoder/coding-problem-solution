package com.learnjava17.LambdaExpression;

import com.learnjava17.LambdaExpression.Math.interface1;

class Math {

	interface interface1 {

		int operation(int a, int b); //abstract method 

		default void message() {

			System.out.println("This is default method of Interface 1");
		}

	}

	interface interface2 {

		default void message() {

			System.out.println("This is default method interface 2");
		}
	}

	int calculation(int x, int y, interface1 obj) {
		return obj.operation(x, y);

	}

}

public class MathOperation {

	public static void main(String[] args) {

		interface1 add = (int x, int y) -> x + y ;
		interface1 Mul = (int x, int y) -> x * y;

		Math m = new Math();
		System.out.println("Addition : " + m.calculation(6, 10, add));
		System.out.println("Subtraction :" + m.calculation(23, 22, Mul));
	}

}
