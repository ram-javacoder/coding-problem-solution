package com.javalearn17.anonymousclass;

abstract class Fruit {

	public abstract void eat();
}

class AnonymousDemo {

	public void display() {

		// Anonymous class
		Fruit f = new Fruit() {

			@Override
			public void eat() {

				System.out.println("Eating mango...");

			}
		};
		f.eat();

	}

}

public class FruitAnonymousClass {

	public static void main(String[] args) {

		AnonymousDemo a = new AnonymousDemo();
		a.display();

	}
}
