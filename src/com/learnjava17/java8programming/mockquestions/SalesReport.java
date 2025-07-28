package com.learnjava17.java8programming.mockquestions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*1️. Generate Category-wise Sales Report
You are tasked with generating a category-wise product sales report for the last 24 hours, with multiple filtering rules:

Consider only orders with a total value  ₹500.

Exclude any products marked as "out of stock".

Group the filtered products by category.

Calculate the total quantity sold per category.

Return a result sorted by quantity in descending order.

*/

public class SalesReport {

	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(
				new Order(Arrays.asList(new Product("Laptop", "Electronics", false, 2, 40000),
						new Product("USB Cable", "Electronics", false, 5, 200),
						new Product("Book", "Books", false, 3, 150)), LocalDateTime.now().minusHours(5)),

				new Order(Arrays.asList(new Product("TV", "Electronics", false, 1, 30000),
						new Product("Notebook", "Books", true, 10, 50)), LocalDateTime.now().minusHours(2)), // OutofStock

				new Order(Arrays.asList(new Product("Rice", "Grocery", false, 10, 60),
						new Product("Pulses", "Grocery", false, 8, 70)), LocalDateTime.now().minusHours(26)) // Older
																												// than
																												// 24
																												// hours
		);

		Map<String, Integer> report =  orders.stream().filter(order -> order.getTotalValue() >= 500)
		
		// Step 1: Filter orders by total value and last 24 hours
		.filter(order -> order.getOrderTime().isAfter(LocalDateTime.now().minusHours(24)))
		
		
		.flatMap(order -> order.getProduct().stream())
		
		 // Step 2: Flatten products
		.filter(product -> !product.isOutOfStock())
		
		// Step 4: Group by category and sum quantity
		.collect(Collectors.groupingBy(Product::getCategory, Collectors.summingInt(Product::getQuantity)))

		// Step 5: Sort by quantity descending

				.entrySet().stream()
				
				.sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
				
				.collect(Collectors.toMap(
						Map.Entry::getKey, 
						Map.Entry::getValue, 
						(a, b) -> a, LinkedHashMap::new
						));
		
		
		report.forEach((category, totalQty) -> 
			
				System.out.println(category+ " -> " +totalQty+ " unit sold"
						
						));

	}
}
