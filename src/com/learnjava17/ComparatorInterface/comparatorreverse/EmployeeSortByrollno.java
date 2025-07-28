package com.learnjava17.ComparatorInterface.comparatorreverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSortByrollno {

	public static void main(String[] args) {

// SortByroll byroll = new SortByroll();

// Set<Employee> list = new TreeSet<Employee>(byroll); (OR)

//		Set<Employee> list = new TreeSet<Employee>();
//
//		list.add(new Employee(131, "aaaa", "nyc"));
//		list.add(new Employee(141, "bbbb", "london"));
//		list.add(new Employee(121, "cccc", "jaipur"));
//		list.add(new Employee(111, "cccc", "jaipur"));

// 		Comparator<Employee> sortByRoll = (r1,r2) -> r2.getRollno() - r1.getRollno();

		Comparator<Employee> sortByroll = new SortByroll();

		Set<Employee> decending = new TreeSet<Employee>(sortByroll);

		decending.add(new Employee(131, "aaaa", "nyc"));
		decending.add(new Employee(141, "bbbb", "london"));
		decending.add(new Employee(121, "cccc", "jaipur"));
		decending.add(new Employee(111, "cccc", "jaipur"));

		System.out.println("Displaying Employee details in decending order based on roll no :");

		for (Employee employee : decending) {
			System.out.println(employee);
		}

// TreeSet<Employee> treeSet = new TreeSet<Employee>(new SortByroll());

// Way-1

//		Comparator<Employee> c = Collections.reverseOrder(new SortByroll());
//		Collections.sort(list, c);

// Way-2

// 		Comparator<Employee> decending=(e1,e2)-> -(e1.getRollno() - e2.getRollno());
//
//		System.out.println("\nEmployee details After sorting decending order based on roll no :");
//		System.out.println("-------------------------------------------------------------------");
//
//		for (Employee employee : list) {
//			System.out.println(employee);
//		}
	}

}
