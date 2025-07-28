package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {

	private String productId;
	private int quantity;
	private double price;

	public Order(String productId, int quantity, double price) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "productId: " + productId + ", quantity: " + quantity + ", price:" + price;
	}
	
	

}

public class ProductOperation {

	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(new Order("P1", 10, 15.50), new Order("P2", 5, 20.50),
				new Order("P1", 7, 15.50), new Order("P3", 3, 10.50), new Order("P4", 4, 15.50));

		
		Map<String, List<Order>> grouped =  orders.stream().collect(Collectors.groupingBy(Order :: getProductId));
		grouped.forEach((product,orderList) -> {
			
			double totalRevenue = orderList.stream().mapToDouble(o -> o.getPrice() * o.getQuantity()).sum();
			
			double averageQuantity = orderList.stream().mapToInt(Order :: getQuantity).average().orElse(0);
			
			System.out.println("Product : " +product+ " Total revenue: " +totalRevenue+ " Avarage Quantity: " +averageQuantity);
			
			
			
			
		});
		
		
	}
}
