package com.learnjava17.java8programming.mockquestions;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

	private List<Product> product;
	private LocalDateTime orderTime;

	public Order(List<Product> product, LocalDateTime orderTime) {
		super();
		this.product = product;
		this.orderTime = orderTime;
	}

	public List<Product> getProduct() {
		return product;
	}

	public LocalDateTime getOrderTime() {
		return orderTime;
	}

	public double getTotalValue() {

		return product.stream().mapToDouble(product -> product.getPrice() * product.getQuantity()).sum();

	}

}
