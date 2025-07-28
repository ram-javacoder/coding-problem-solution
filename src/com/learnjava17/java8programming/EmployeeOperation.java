package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeOperation {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(111, "Ram", "Software Developer", 340000));
		list.add(new Employee(131, "Mohan", "Software Developer", 540000));
		list.add(new Employee(141, "Lakshman", "Charted Account", 410000));
		list.add(new Employee(151, "Lokesh", "SQl Developer", 360000));
		list.add(new Employee(121, "John", "Software Developer", 310000));
		list.add(new Employee(161, "leonardo", "Software Developer", 610000));
		list.forEach(e -> System.out.println(e));
		System.out.println("***************************************************");
       
		//Print employees whose name start with letter 'L' or 'l'
		Predicate<Employee> predicate = e -> e.getEmpName().startsWith("L") || e.getEmpName().startsWith("l");
		list.stream().filter(predicate).forEach(System.out::println);

	}

}
