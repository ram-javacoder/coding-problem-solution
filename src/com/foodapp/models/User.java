package com.foodapp.models;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String username;
	private String password;
	private List<Order> orderHistory = new ArrayList<Order>();

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;

	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public List<Order> getOrderHistory() {
		return orderHistory;
	}

	public void addOrder(Order order) {
		orderHistory.add(order);
	}

}
