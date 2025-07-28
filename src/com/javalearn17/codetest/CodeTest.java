package com.javalearn17.codetest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodeTest {
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
		int[] prices = { 7, 4, 5, 3, 6, 1 };
		System.out.println("Maximum Profit: " + maxProfit(prices));
	}
}
