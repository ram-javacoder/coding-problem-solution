package com.javalearn17.collection.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.BiConsumer;


public class EmployeeOperation {

	public static void main(String[] args) {

		LinkedHashMap<Employee, String> lhm = new LinkedHashMap<Employee, String>();

		lhm.put(new Employee(1, "Ram", "Benglore"), "A");
		lhm.put(new Employee(2, "Mohan", "Chennai"), "B");
		lhm.put(new Employee(3, "Lakshman", "Chennai"), "C");
		lhm.put(new Employee(4, "Lokesh", "Chennai"), "D");
		lhm.put(new Employee(1, "Ram", "Benglore"), "E");
		lhm.put(new Employee(1, "Ram", "Benglore"), "E");
		
		System.out.println(lhm);

		// Way-2
		System.out.println("\nWay-2 Print elements :");
		BiConsumer<Employee, String> biconsumer = (e, s) -> {
			System.out.println(e + " , " + s);

		};
		lhm.forEach(biconsumer);

		// Way-3
		System.out.println("\nWay-3 Print elements :");
		for (Employee emp : lhm.keySet()) {

			String string = lhm.get(emp);
			System.out.println(emp + " ," + string);
		}

		// Way-4
		System.out.println("\nWay-4 Print elements :");
		for (Entry<Employee, String> entry : lhm.entrySet()) {

			System.out.println(entry);
		}

		// Way-5
		System.out.println("\nWay-5 Print elements :");
		Collection<String> values = lhm.values();
		for (String string : values) {
			System.out.println(string);

		}

		// way-6
		System.out.println("\nWay-6 Print elements :");
		lhm.entrySet().forEach(System.out::println);

	}

}
