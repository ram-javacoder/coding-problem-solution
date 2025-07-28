package com.javalearn17.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeOperation {

	public static void main(String[] args) {

		Set<Employees> employees = new TreeSet<Employees>();
		employees.add(new Employees(111, "Ram", "Developing"));
		employees.add(new Employees(112, "Mohanavel", "Testing"));
		employees.add(new Employees(113, "Lokesh", "Developing"));
		employees.add(new Employees(114, "Lakshman", "Testing"));
		employees.add(new Employees(112, null, "Testing")); // If adding duplicate key it will just ignore new one
		employees.forEach(e -> System.out.println(e));

	}

}
