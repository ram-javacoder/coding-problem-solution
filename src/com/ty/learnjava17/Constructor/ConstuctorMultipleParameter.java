package com.ty.learnjava17.Constructor;

class Product {
	String name;
	double price;
	int quantity;

	// Parameterized constructor 1
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Parameterized constructor 2 (with different parameters)
	public Product(String name, double price) {
		this(name, price, 0); // Calling another constructor using 'this'
	}

	// Method to display product information
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Price: $" + price);
		System.out.println("Quantity: " + quantity);
	}
}

public class ConstuctorMultipleParameter {
	public static void main(String[] args) {
		// Creating objects using different constructors
		Product product1 = new Product("Laptop", 999.99, 5);
		Product product2 = new Product("Mouse", 19.99);

		// Displaying product information using the objects' method
		System.out.println("Product 1:");
		product1.displayInfo();

		System.out.println("\nProduct 2:");
		product2.displayInfo();
	}
}
