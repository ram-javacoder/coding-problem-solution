package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EfficientJanitor {

	public static void main(String[] args) {

		List<Float> weight = Arrays.asList(1.01f, 1.99f, 2.5f, 1.5f);
		System.out.println("List of weights: " + weight);
		int totalTrips = efficientJanitor(weight);
		System.out.println(totalTrips);
	}

	private static int efficientJanitor(List<Float> weight) {
		Collections.sort(weight);
		int left = 0;
		int right = weight.size() - 1;
		int trips = 0;

		while (left <= right) {

			if (weight.get(left) + weight.get(right) <= 3.00f) {
				left++;
			}
			right--;
			trips++;
		}

		return trips;

	}
}
