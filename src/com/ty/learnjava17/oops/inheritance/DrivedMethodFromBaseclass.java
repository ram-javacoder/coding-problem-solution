package com.ty.learnjava17.oops.inheritance;

/* Develop a program with a base class and a derived class that overrides a method from the base class.
 */

class Animal {
	public void makeSound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}
}

public class DrivedMethodFromBaseclass {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound(); // Animal sound

		Dog dog = new Dog();
		dog.makeSound(); // Woof!

	}
}