package com.foodapp.models;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	private String name;
	private List<FoodItem> menu = new ArrayList<>();

	public Restaurant(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<FoodItem> getMenu() {
		return menu;
	}

	public void addFoodItem(FoodItem item) {

		menu.add(item);

	}

}
