package com.ty.learnjava17.ArrayPrograms;

public class FindMaxProfit {

	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {
			if (price < minPrice) {
				minPrice = price; // update the minimum price
			} else {
				int profit = price - minPrice;
				if (profit > maxProfit) {
					maxProfit = profit; // update the maximum profit
				}
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4,9 };
		System.out.println("Maximum Profit: " + maxProfit(prices));
	}
}
