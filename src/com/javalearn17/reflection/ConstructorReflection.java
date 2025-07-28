package com.javalearn17.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class Dog_cons {

	public Dog_cons() {

	}

	private Dog_cons(int age) { // private Constructor with Single parameter

	}

}

public class ConstructorReflection {

	public static void main(String[] args) {

		Dog_cons d = new Dog_cons();

		Class c = d.getClass();

		Constructor[] constructor = c.getDeclaredConstructors();

		for (Constructor cons : constructor) {

			System.out.println("Constructor name : " +cons.getName());
			System.out.println("Modifier of Constructor : " +Modifier.toString(cons.getModifiers()));
			System.out.println("No of parameter of Constructor : " +cons.getParameterCount());
			System.out.println(" ");

		}
	}
}
