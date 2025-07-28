package trainingPart2Qs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Pizza {
	private String size;
	private static final Map<String, Double> SIZE_PRICES = Map.of("Small", 200.0, "Medium", 300.0, "Large", 400.0);

	private static final Map<String, Double> TOPPING_PRICES = Map.of("Cheese", 50.0, "Onion", 30.0, "Capsicum", 40.0,
			"Paneer", 60.0);

	private List<String> toppings;

	public Pizza(String size) {
		this.size = size;
		this.toppings = new ArrayList<>();
	}

	public void addTopping(String topping) {
		if (TOPPING_PRICES.containsKey(topping)) {
			toppings.add(topping);
		} else {
			System.out.println("Invalid topping: " + topping);
		}
	}

	public double calculateTotalPrice() {
		double basePrice = SIZE_PRICES.getOrDefault(size, 0.0);
		double toppingsPrice = toppings.stream().mapToDouble(TOPPING_PRICES::get).sum();
		return basePrice + toppingsPrice;
	}

	public void displayOrder() {
		System.out.println("Pizza Size: " + size);
		System.out.println("Selected Toppings: " + (toppings.isEmpty() ? "None" : String.join(", ", toppings)));
		System.out.println("Total Price: ₹" + calculateTotalPrice());
	}
}

public class PizzaShopPrizeCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Pizza Shop!");
		System.out.println("Available Sizes: Small, Medium, Large");
		System.out.print("Enter pizza size: ");
		String size = scanner.nextLine();

		Pizza pizza = new Pizza(size);

		System.out.println("Available Toppings: Cheese, Onion, Capsicum, Paneer");
		System.out.print("Enter toppings (comma separated, or press Enter for none): ");
		String toppingsInput = scanner.nextLine();

		if (!toppingsInput.isEmpty()) {
			String[] selectedToppings = toppingsInput.split(",");
			for (String topping : selectedToppings) {
				pizza.addTopping(topping.trim());
			}
		}

		System.out.println("\n--- Your Order Summary ---");
		pizza.displayOrder();

		scanner.close();
	}

}
