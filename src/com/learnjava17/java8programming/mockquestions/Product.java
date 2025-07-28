package com.learnjava17.java8programming.mockquestions;

public class Product {
	
	private String name;
	private String category;
	private boolean outOfStock;
	private int quantity;
	private double price;
	
	public Product(String name, String category, boolean outOfStock, int quantity, double price) {
		super();
		this.name = name;
		this.category = category;
		this.outOfStock = outOfStock;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public boolean isOutOfStock() {
		return outOfStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	
	
	

}
