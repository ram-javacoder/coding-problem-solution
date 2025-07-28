package com.learnjava17.java8programming.employeeoperation;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataSource {

	public static ArrayList<Employee> getData() {
		ArrayList<Employee> employeeList = new ArrayList<>();

		// Adding 20 employee data entries to the ArrayList
		employeeList.add(new Employee("John Doe", "IT", "Software Engineer", 30, 5, 80000.0, 4,
				LocalDateTime.of(2020, 1, 15, 8, 0)));
		employeeList.add(new Employee("Jane Smith", "HR", "HR Manager", 35, 8, 100000.0, 5,
				LocalDateTime.of(2018, 5, 20, 9, 30)));
		employeeList.add(new Employee("Robert Johnson", "Finance", "Financial Analyst", 28, 3, 70000.0, 3,
				LocalDateTime.of(2021, 8, 10, 7, 45)));
		employeeList.add(new Employee("Amanda White", "Marketing", "Marketing Specialist", 32, 6, 85000.0, 4,
				LocalDateTime.of(2019, 3, 5, 10, 15)));
		employeeList.add(new Employee("Michael Brown", "IT", "System Architect", 38, 10, 120000.0, 5,
				LocalDateTime.of(2015, 7, 12, 11, 45)));
		employeeList.add(new Employee("Emily Davis", "Finance", "Senior Accountant", 29, 4, 75000.0, 4,
				LocalDateTime.of(2022, 2, 8, 9, 0)));
		employeeList.add(new Employee("Daniel Miller", "HR", "Recruitment Manager", 34, 7, 95000.0, 5,
				LocalDateTime.of(2017, 9, 18, 8, 30)));
		employeeList.add(new Employee("Olivia Johnson", "Marketing", "Digital Marketing Specialist", 31, 5, 88000.0, 4,
				LocalDateTime.of(2016, 4, 22, 10, 0)));
		employeeList.add(new Employee("Christopher Wilson", "IT", "DevOps Engineer", 33, 6, 90000.0, 4,
				LocalDateTime.of(2018, 11, 30, 8, 15)));
		employeeList.add(new Employee("Sophia Smith", "Finance", "Financial Controller", 36, 9, 110000.0, 5,
				LocalDateTime.of(2014, 6, 25, 9, 45)));
		employeeList.add(new Employee("Ethan Davis", "Marketing", "Marketing Manager", 30, 5, 82000.0, 4,
				LocalDateTime.of(2020, 3, 10, 10, 30)));
		employeeList.add(new Employee("Isabella Taylor", "IT", "Software Developer", 28, 4, 75000.0, 4,
				LocalDateTime.of(2021, 7, 5, 8, 45)));
		employeeList.add(new Employee("Matthew Brown", "HR", "HR Specialist", 32, 6, 90000.0, 4,
				LocalDateTime.of(2019, 1, 12, 8, 0)));
		employeeList.add(new Employee("Ava Wilson", "Finance", "Accounting Manager", 35, 8, 105000.0, 5,
				LocalDateTime.of(2016, 8, 20, 9, 15)));
		employeeList.add(new Employee("William Anderson", "Marketing", "Content Writer", 27, 3, 70000.0, 3,
				LocalDateTime.of(2022, 5, 15, 11, 0)));
		employeeList.add(new Employee("Mia Miller", "IT", "Database Administrator", 29, 5, 82000.0, 4,
				LocalDateTime.of(2017, 10, 8, 8, 30)));
		employeeList.add(new Employee("James White", "Finance", "Financial Analyst", 31, 6, 95000.0, 4,
				LocalDateTime.of(2018, 4, 5, 9, 0)));
		employeeList.add(new Employee("Emma Wilson", "HR", "Compensation Analyst", 33, 7, 92000.0, 4,
				LocalDateTime.of(2019, 11, 18, 10, 45)));
		employeeList.add(new Employee("Logan Harris", "Marketing", "Social Media Manager", 34, 8, 98000.0, 5,
				LocalDateTime.of(2015, 9, 30, 8, 15)));
		employeeList.add(new Employee("Grace Taylor", "IT", "Java Developer", 28, 4, 77000.0, 4,
				LocalDateTime.of(2020, 6, 22, 10, 30)));

		return employeeList;
	}
}
