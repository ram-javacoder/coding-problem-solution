package com.ty.learnjava17.Interface;

interface A {
	int a = 20;

}

interface B {

	int a = 10;
}

public class VariableNameConflict {

	public static void main(String[] args) {
		System.out.println(A.a); // System.out.println(a) --> compile error
		System.out.println(B.a);
	}

}
