package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSortOnAge {

	private String employeeName;
	private int employeeAge;

	public EmployeeSortOnAge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeSortOnAge(String employeeName, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}
	


	public static void main(String[] args) {

		List<EmployeeSortOnAge> employees = Arrays.asList(new EmployeeSortOnAge("Ram", 28),
				new EmployeeSortOnAge("Mohan", 37), new EmployeeSortOnAge("Lokesh", 32),
				new EmployeeSortOnAge("Lakshman", 26));

		List<EmployeeSortOnAge> employeeByAge = employees.stream()
				.sorted(Comparator.comparingInt(EmployeeSortOnAge::getEmployeeAge)).collect(Collectors.toList());

		System.out.println(employeeByAge);
		
		  for (EmployeeSortOnAge employee : employeeByAge) {
		  System.out.println("Employee: " + employee.getEmployeeName() + ", Age: " +
		  employee.getEmployeeAge()); }
		 

	}

}
