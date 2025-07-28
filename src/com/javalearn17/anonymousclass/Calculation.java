package com.javalearn17.anonymousclass;

public class Calculation {
	public static void main(String[] args) {

		// Anonymous class with method overloading
		MyClass myClass = new MyClass() {
			@Override
			public void display() {
				System.out.println("Overridden display method");
			}

			// Method overloading
			public void display(String message) {
				System.out.println("Overloaded display method: " + message);
			}

		};

		myClass.display(); // Calls overridden display method
		myClass.display("Hello, World!"); // Calls overloaded display method

	}
}

// Interface with a method
interface MyClass {
	void display();

	void display(String name);
}