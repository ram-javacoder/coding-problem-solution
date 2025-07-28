package com.javalearn17.collection.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class MapEmployeeOperation {

	public static void main(String[] args) {

		Map<Employee, String> employee = new HashMap<Employee, String>();

		employee.put(new Employee(1, "Ram", "Benglore"), "A");
		employee.put(new Employee(2, "Mohan", "Chennai"), "B");
		employee.put(new Employee(3, "Lakshman", "Chennai"), "C");
		employee.put(new Employee(4, "Lokesh", "Chennai"), "D");
		employee.put(new Employee(5, "John", "Erode"), "E");

		// 1.Directly calling
		System.out.println(employee);

		// Way-2
		System.out.println("\nWay-2 Print elements :");
		BiConsumer<Employee, String> biconsumer = (e, s) -> {
			System.out.println(e + " , " + s);

		};
		employee.forEach(biconsumer);

		// Way-3
		System.out.println("\nWay-3 Print elements :");
		for (Employee emp : employee.keySet()) {

			String string = employee.get(emp);
			System.out.println(emp + " ," + string);
		}
		// Way-4
		System.out.println("\nWay-4 Print elements :");
		for (Entry<Employee, String> entry : employee.entrySet()) {

			System.out.println(entry);
		}

		// Way-5
		System.out.println("\nWay-5 Print elements :");
		Collection<String> values = employee.values();
		for (String string : values) {
			System.out.println(string);

		}

		// way-6
		System.out.println("\nWay-6 Print elements :");
		employee.entrySet().stream().forEach(System.out::println);

	}

}
