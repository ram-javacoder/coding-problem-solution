package com.ty.learnjava17.relationship;

//Java Program to illustrate the
//Concept of Association

import java.util.HashSet;
import java.util.Set;

class Employee {

	private String name;

	public Employee() {
		super();
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

class Bank {

	private String name;

	private Set<Employee> employee;

	public Bank(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

}

public class BankEmployeeOperation {

	public static void main(String[] args) {

		Employee emp = new Employee("Ram");
		
		Bank b = new Bank("SBI");

		Set<Employee> employee = new HashSet<Employee>();
		employee.add(emp);
		b.setEmployee(employee);

		System.out.println(emp.getName() + " belong to " + b.getName() + " bank");

	}

}
