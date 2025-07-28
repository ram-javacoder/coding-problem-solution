package com.javalearn17.collection.set;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private String name;
	private int emp_id;
	private String department;
	private double sal;

	public Employee() {
		super();
	}

	public Employee(String name, int emp_id, String department, double sal) {
		super();
		this.name = name;
		this.emp_id = emp_id;
		this.department = department;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp_id=" + emp_id + ", department=" + department + ", sal=" + sal + "]";
	}

}

public class EmployeeSetOperation {

	public static void main(String[] args) {

		Set<Employee> obj = new HashSet();
		Employee e1 = new Employee("Ram", 122, "Development", 35000);
		Employee e2 = new Employee("Mohan", 123, "Testing ", 45000);
		Employee e3 = new Employee(null, 124, "Development", 32000);
		Employee e4 = new Employee(null, 125, null, 65000);
		Employee e5 = new Employee("John", 126, "Testing", 33000);

		obj.add(e1);
		obj.add(e2);
		obj.add(e3);
		obj.add(e4);
		obj.add(e5);
		
		for (Employee employee : obj) {
			
			System.out.println(employee);
		}

	}

}
