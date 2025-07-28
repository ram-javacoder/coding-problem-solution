package com.javalearn17.reflection;

class Animal {

	public void display() {
		System.out.println("This is Animal class!");

	}

}

class Dog extends Animal {

	public void display() {

		System.out.println("This is Dog class!");
	}

}

public class ClassReflection {

	public static void main(String[] args) {

		try {
			Dog d = new Dog(); // creating object of Dog class

			Class c = d.getClass();

			System.out.println("Class name : " + c.getName());

			int modifier = c.getModifiers();

			System.out.println("Modifier of class : " + modifier);

			String convertModifier = java.lang.reflect.Modifier.toString(modifier);

			System.out.println("Modifier of the class after converting to String : " + convertModifier);

			Class getSuperClass = c.getSuperclass();

			System.out.println("Super class name : " + getSuperClass);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
