package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrderListofLists {

	

	    public static void main(String[] args) {
	        List<List<Integer>> listOfLists = new ArrayList<>();
	        listOfLists.add(List.of(3, 1, 4, 1, 5));
	        listOfLists.add(Arrays.asList(9, 2, 6, 5, 3));
	        listOfLists.add(Arrays.asList(5, 8, 9, 7, 9));

	        // Display the original list of lists
	        System.out.println("Original List of Lists:");
	        displayListofLists(listOfLists);

	        // Print all numbers in ascending order
	        System.out.println("\nAll Numbers in Ascending Order:");
	        List<Integer> ascendingOrderList = getAscendingOrderList(listOfLists);
	        System.out.println(ascendingOrderList);
	    }

	    private static void displayListofLists(List<List<Integer>> listOfLists) {
	        for (List<Integer> sublist : listOfLists) {
	            System.out.println(sublist);
	        }
	    }

	    private static List<Integer> getAscendingOrderList(List<List<Integer>> listOfLists) {
	        return listOfLists.stream()
	                .flatMap(List::stream)
	                .sorted()
	                .collect(Collectors.toList());
}
	}

