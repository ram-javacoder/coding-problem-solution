package com.learnjava17.LambdaExpression;

@FunctionalInterface
interface A {

	void m1();

}

interface B {

	void m1(int a);
}

interface c {

	void m1(int a, int b);
}

class Aimpl implements A {

	public void m1() {
		System.out.println("This is M1 method");

	}

}

class Bimpl implements B {
	public void m1(int b) {

		System.out.println("b :" + b);
	}

}

class Cimpl implements c {

	public void m1(int a, int b) {

		System.out.println("a:" + a);
		System.out.println("b :" + b);

	}
}

public class TryLambda {

	public static void main(String[] args) {

		A a = () -> System.out.println();
		a.m1();

		B _b = (b) -> System.out.println("b :" + b);
		_b.m1(10);

		c c = (_a, b) -> System.out.println("c :" + _a + ":" + b);
		c.m1(10, 20);

	}
}
