package com.foodapp.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class FoodOrderApp {

	private static final Scanner sc = new Scanner(System.in);
	private static final Map<String, User> users = new HashMap<String, User>();
	private static final List<Restaurant> restaurants = new ArrayList<Restaurant>();

	// Admin credential
	private static final String ADMIN_USERNAME = "admin";
	private static final String ADMIN_PASSWORD = "admin123";

	private static User currentUser = null;

	public static void main(String[] args) {

		loadSampleData();
		while (true) {

			System.out.println("\n1.Register\n2. Login\n3. Admin Login\n4. Exit");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				register();
				break;
			case "2":
				logic();
				break;
			case "3":
				adminLogin();
				break;
			case "4":
				System.exit(0);
			default:
				System.out.println("Invalid choice");

			}

		}

	}

	private static void adminLogin() {
		System.out.println("Enter admin username: ");
		String username = sc.nextLine();
		System.out.println("Enter admin password: ");
		String password = sc.nextLine();

		if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
			System.out.println("Welcom Admin!");
			adminMenu();

		} else {

			System.out.println("Invalid admin credentials. ");
		}
	}

	private static void adminMenu() {

		while (true) {

			System.out.println("\n--- Admin Panel---");
			System.out.println("1. Add Restaurant");
			System.out.println("2. Add food Item to Restaurant");
			System.out.println("3. View all Restaurant and Menus");
			System.out.println("4. Logout");

			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				addRestaurant();
				break;
			case "2":
				addFoodItemToRestaurant();
				break;
			case "3":
				viewAllRestaurantsAndMenus();
				break;
			case "4":
				return;
			default:
				System.out.println("Invalid choice");

			}

		}

	}

	private static void addRestaurant() {

		System.out.println("Enter the Restaurant name: ");
		String name = sc.nextLine();
		restaurants.add(new Restaurant(name));
		System.out.println("Restaurant added.");
	}

	private static void viewAllRestaurantsAndMenus() {
		if (restaurants.isEmpty()) {
			System.out.println("No Restaurants available");
			return;
		}

		for (Restaurant restaurant : restaurants) {
			System.out.println("\nRestaurant: " + restaurant.getName());
			for (FoodItem item : restaurant.getMenu()) {
				System.out.println(" " + item);
			}

		}
		
		
		

	}
	
	
	private static void addFoodItemToRestaurant() {
	
		if (restaurants.isEmpty()) {
			
			System.out.println("No Restaurants Found");
			return;
		}
		
		for (int i = 0; i < restaurants.size(); i++) {
			
			System.out.println((i+1)+ ". "+restaurants.get(i).getName());
		}
		
		System.out.println("Select restaurant: ");
		int choice = Integer.parseInt(sc.nextLine());
		
		if (choice < 1 || choice > restaurants.size()) {
			System.out.println("Invalid selection");
			return;
		}
		
		Restaurant restaurant =  restaurants.get(choice - 1);
		System.out.println("Enter food ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the food name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter food price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		restaurant.addFoodItem(new FoodItem(id, name, price));
		System.out.println("Food item added.");
		
	}

	private static void register() {

		System.out.println("Enter username: ");
		String username = sc.nextLine();
		if (users.containsKey(username)) {
			System.out.println("Username already exists!");
			return;
		}

		System.out.println("Enter password: ");
		String password = sc.nextLine();
		users.put(username, new User(username, password));
		System.out.println("Registered successfully. ");

	}

	private static void logic() {
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		System.out.println("Enter password: ");
		String password = sc.nextLine();

		User user = users.get(username);
		if (user != null && user.getPassword().equals(password)) {
			currentUser = user;
			System.out.println("Logged in successfully");
			userMenu();

		}
		else {
			
			System.out.println("Invalid credentials.");
		}

	}

	private static void userMenu() {
		while (true) {

			System.out.println("\n1. View Restaurants\n2. View Order history\n3. Logout");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				viewRestaurant();
				break;
			case "2":
				viewOrderHistory();
				break;
			case "3":
				currentUser = null;
				return;

			default:
				System.out.println("Invalid choise");

			}

		}

	}

	private static void viewRestaurant() {

		for (int i = 0; i < restaurants.size(); i++) {

			System.out.println((i + 1) + ". " + restaurants.get(i).getName());

		}
		System.out.println("Select Restaurant");
		int choice = Integer.parseInt(sc.nextLine());
		if (choice < 1 || choice > restaurants.size()) {
			System.out.println("Invalid restaurant.");
			return;
		}
		browseMenu(restaurants.get(choice - 1));

	}

	private static void browseMenu(Restaurant restaurant) {

		List<FoodItem> menu = restaurant.getMenu();
		for (FoodItem foodItem : menu) {
			System.out.println(foodItem);
		}

		List<FoodItem> cart = new ArrayList<FoodItem>();
		while (true) {

			System.out.println("Enter the item id to add cart (0 to place order )");
			int id = Integer.parseInt(sc.nextLine());
			if (id == 0) {
				break;
			}
			Optional<FoodItem> selected = menu.stream().filter(i -> i.getId() == id).findFirst();
			if (selected.isPresent()) {

				cart.add(selected.get());
				System.out.println("Added to cart.");
			} else {

				System.out.println("Invalid ID.");
			}

		}

		if (!cart.isEmpty()) {
			double total = cart.stream().mapToDouble(FoodItem::getPrice).sum();
			Order order = new Order(cart, total);
			currentUser.addOrder(order);
			System.out.println("Order placed successfully!\n" + order);

		}

	}

	private static void viewOrderHistory() {

		List<Order> history = currentUser.getOrderHistory();
		if (history.isEmpty()) {
			System.out.println("No Order yet. ");
		} else {

			for (Order order : history) {
				System.out.println(order + "\n----------------------");
			}
		}

	}

	private static void loadSampleData() {
		Restaurant r1 = new Restaurant("Spicy Bites");
		r1.addFoodItem(new FoodItem(1, "Paneer Butter Masala ", 150));
		r1.addFoodItem(new FoodItem(2, "Veg Biriyani", 120));

		Restaurant r2 = new Restaurant("Sweet tooth");
		r2.addFoodItem(new FoodItem(3, "Chocolate Cake", 200));
		r2.addFoodItem(new FoodItem(4, "Gulab Jamun", 60));

		restaurants.add(r1);
		restaurants.add(r2);

	}

}
