package com.javalearn17.collection.map.treemap;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeOperation {

	public static void main(String[] args) {

		// Comparator<Employee> assending = (e1, e2) -> (e1.getRollno() -
		// e2.getRollno());
		// Comparator<Employee> reverseOrder2 =
		// Collections.<Employee>reverseOrder(assending);

		Comparator<Employee> sortByRoll_no = new SortByRollno();
		TreeMap<Employee, Integer> treeMap = new TreeMap<Employee, Integer>(sortByRoll_no);
		
		treeMap.put(new Employee(121, "Ram", "Bengalore"), 5);
		treeMap.put(new Employee(151, "Mohan", "Chennai"), 1);
		treeMap.put(new Employee(111, "Lakshman", "Chennai"), 2);
		treeMap.put(new Employee(141, "Lokesh", "Chennai"), 3);

		System.out.println("TreeMap Keys sorted in descending order of the Roll no: ");

		for (Entry<Employee, Integer> entry : treeMap.entrySet()) {

			System.out.println("Key : (" + entry.getKey() + "), Value : " + entry.getValue());
		}

	}

}
