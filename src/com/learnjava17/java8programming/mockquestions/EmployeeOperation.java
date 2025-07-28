package com.learnjava17.java8programming.mockquestions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeOperation {

	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("John Doe", "IT", "Software Engineer", 30, 5, 80000.0));
		employeeList.add(new Employee("Jane Smith", "HR", "HR Manager", 35, 8, 100000.0));
		employeeList.add(
				new Employee("Robert Johnson", "Finance", "Financial Analyst", 28, 3, 70000.0));
		employeeList.add(new Employee("Amanda White", "Marketing", "Marketing Specialist", 32, 6,
				85000.0));
		employeeList
				.add(new Employee("Michael Brown", "IT", "System Architect", 38, 10, 120000.0));
		employeeList
				.add(new Employee("Emily Davis", "Finance", "Senior Accountant", 29, 4, 75000.0));
		employeeList
				.add(new Employee("Daniel Miller", "HR", "Recruitment Manager", 34, 7, 95000.0));
		employeeList.add(new Employee("Olivia Johnson", "Marketing",
				"Digital Marketing Specialist", 31, 5, 88000.0));
		employeeList
				.add(new Employee("Christopher Wilson", "IT", "DevOps Engineer", 33, 6, 90000.0));
		employeeList.add(
				new Employee("Sophia Smith", "Finance", "Financial Controller", 36, 9, 110000.0));
		employeeList.add(
				new Employee("Ethan Davis", "Marketing", "Marketing Manager", 30, 5, 82000.0));
		employeeList
				.add(new Employee("Isabella Taylor", "IT", "Software Developer", 28, 4, 75000.0));
		employeeList.add(new Employee("Matthew Brown", "HR", "HR Specialist", 32, 6, 90000.0));
		employeeList.add(
				new Employee("Ava Wilson", "Finance", "Accounting Manager", 35, 8, 105000.0));
		employeeList.add(
				new Employee("William Anderson", "Marketing", "Content Writer", 27, 3, 70000.0));
		employeeList
				.add(new Employee("Mia Miller", "IT", "Database Administrator", 29, 5, 82000.0));
		employeeList
				.add(new Employee("James White", "Finance", "Financial Analyst", 31, 6, 95000.0));
		employeeList
				.add(new Employee("Emma Wilson", "HR", "Compensation Analyst", 33, 7, 92000.0));
		employeeList.add(new Employee("Logan Harris", "Marketing", "Social Media Manager", 34, 8,
				98000.0));
		employeeList.add(new Employee("Grace Taylor", "IT", "Java Developer", 28, 4, 77000.0));

		/********************* Employees who earn more than 50000 *****************/

		Predicate<Employee> predicateSalary = e -> (e.getSalary() > 50000);
		employeeList.stream().filter(predicateSalary);

		/********************* Calculate sum of employee Salary *****************/

		double sum = employeeList.stream().filter(predicateSalary).mapToDouble(Employee::getSalary).sum();

		/*********************
		 * Employees who are working in Marketing and Finance department
		 *****************/

		Predicate<Employee> department = e -> e.getDepartment().equalsIgnoreCase("Marketing")
				|| e.getDepartment().equalsIgnoreCase("Finance");

		employeeList.stream().filter(department);

		/*********************
		 * Employees who have more than 3 years experience
		 *****************/

		Predicate<Employee> yearOfExp = e -> e.getTotalYearsOfExperience() > 3;
		employeeList.stream().filter(yearOfExp);

		/********************* Final list *****************/

		employeeList.stream().filter((predicateSalary).and(department).and(yearOfExp))
				.forEach(e -> System.out.println(e));

		System.out.println("\nSum of Salary " + sum);

	}

}
