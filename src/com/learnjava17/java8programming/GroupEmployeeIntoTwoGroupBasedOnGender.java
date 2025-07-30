package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group employee based on gender using Collectors.partitioningBy

class EmployeeGroupGender {

	private int id;
	private String name;
	private int age;
	private String gender;

	public EmployeeGroupGender(int id, String name, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Employee id: " + id + ", name: " + name + ", age: " + age + ", gender: " + gender + "]";
	}

}

public class GroupEmployeeIntoTwoGroupBasedOnGender {

	public static void main(String[] args) {

		List<EmployeeGroupGender> employees =  Arrays.asList(
		        new EmployeeGroupGender(1, "Sunil", 32, "Male"),
		        new EmployeeGroupGender(1, "Joshi", 34, "Male"),
		        new EmployeeGroupGender(1, "Rishi", 15, "Male"),
		        new EmployeeGroupGender(1, "Anjali", 31, "Female"),
		        new EmployeeGroupGender(1, "Nisha", 25, "Female")
		      );
		
		Map<Boolean, List<EmployeeGroupGender>> groupEmployee =  employees.stream().collect(Collectors.partitioningBy(emp-> emp.getGender().equals("Male")));
		System.out.println(groupEmployee);
		System.out.println("Employee List: " +employees);
		
		System.out.println("Male Employees: ");
		groupEmployee.get(true).forEach(System.out::println);
		
		System.out.println("Female Employees: ");
		groupEmployee.get(false).forEach(System.out::println);
		
		
	}
}
