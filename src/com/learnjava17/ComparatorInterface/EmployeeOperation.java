package com.learnjava17.ComparatorInterface;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeOperation {

	public static void main(String[] args) {

		Employee[] employees = { new Employee(1, "Ram", 28, 32000), // this
				new Employee(2, "B", 21, 34000), // e this
				new Employee(3, "C", 24, 30000), new Employee(4, "D", 22, 28000), new Employee(5, "E", 20, 35000) };

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		String sortOn = "Salary";
		
		Comparator<Employee> comparator;
		
		
		if (sortOn.equalsIgnoreCase("AGE")) {
			comparator = new CompareByAge();
		} else if (sortOn.equalsIgnoreCase("SALARY")) {
			comparator = new CompareBySalary();
		} else {
			comparator = new CompareByName();
		}

		Arrays.sort(employees, comparator);
		System.out.println("======================");

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}
}
