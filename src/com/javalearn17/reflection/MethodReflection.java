package com.javalearn17.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Dog1 {

	public void display() {

		System.out.println("This is Dog class!");
	}

	private void makeSound() {
		System.out.println("Bark... Bark...!");

	}
}

public class MethodReflection {

	public static void main(String[] args) {

		try {
			Dog1 d = new Dog1();

			Class c = d.getClass();

			Method[] method = c.getDeclaredMethods();

			for (Method m : method) {
				System.out.println("Method's name : " + m.getName());
				System.out.println("Access modifier of method : " + Modifier.toString(m.getModifiers()));
				System.out.println("Return type of method : " + m.getReturnType());
				System.out.println(" ");
				

			}

		}

		catch (Exception e) {

			e.printStackTrace();

		}
	}
}
