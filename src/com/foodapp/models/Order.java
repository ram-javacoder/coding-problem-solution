package com.foodapp.models;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

	private List<FoodItem> items;
	private double total;
	private LocalDateTime orderTime;

	public Order(List<FoodItem> items, double total) {
		super();
		this.items = items;
		this.total = total;
		this.orderTime = LocalDateTime.now();
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder("Order on " + orderTime + "\n");
		for (FoodItem foodItem : items) {
			sb.append("- ").append(foodItem.getName()).append(" (Rs.").append(foodItem.getPrice()).append(")\n");
		}
		sb.append("Total: Rs. ").append(total);

		return sb.toString();
	}

}
