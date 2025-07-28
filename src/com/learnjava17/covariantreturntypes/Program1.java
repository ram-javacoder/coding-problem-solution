package com.learnjava17.covariantreturntypes;

class A {

}

class B extends A {

}

class Base {

	// Return type of this class A class
	A fun() {
		System.out.println("Base fun()");
		return new A();
	}

}

class Derived extends Base {

	B fun() {

		System.out.println("Derived fun()");
		return new B();

	}

}

public class Program1 {

	public static void main(String[] args) {

		Base b = new Base();
		b.fun();

		Derived d = new Derived();
		d.fun();

	}

}
