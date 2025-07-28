package com.javalearn17.randomaccessinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

class CustomList implements RandomAccess {

	private List<Integer> data;

	// Constructor to initialize the data list
	CustomList() {
		data = new ArrayList<>();
	}

	// Method to add an element to the custom list
	public void add(int element) {
		data.add(element);
	}

	// Method to get an element at a specified index
	public int get(int index) {
		return data.get(index);
	}
}

// Main class to demonstrate random access with CustomList
public class RandomAccessInterfaceDemo {

	public static void main(String[] args) {
		// Create an instance of CustomList
		CustomList customList = new CustomList();
		// Populate the custom list with one million integers
		for (int i = 0; i < 1000000; i++) {
			customList.add(i);
		}
		// Measure the start time
		long startTime = System.nanoTime();
		// Access elements using random indices
		for (int i = 0; i < 100000; i++) {
			// Generate a random index within the range of the custom list
			int index = new Random().nextInt(1000000);
			// Retrieve an element at the random index
			customList.get(index);
		}
		// Measure the end time
		long endTime = System.nanoTime();
		// Calculate the duration (time taken)
		long duration = endTime - startTime;
		// Print the time taken with RandomAccess
		System.out.println("Time taken with RandomAccess: " + duration + " ns");
	}
}
