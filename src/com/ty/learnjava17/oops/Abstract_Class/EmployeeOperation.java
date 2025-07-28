package com.ty.learnjava17.oops.Abstract_Class;

import java.util.Scanner;

abstract class Person {

	private String name;
	private String gender;

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	public abstract void work();

	public void changename(String Newname) {
		this.name = Newname;

	}

}

class Employee extends Person {

	private int emp_id;

	public Employee(String name, String gender, int emp_id) {
		super(name, gender);
		this.emp_id = emp_id;
	}

	@Override
	public void work() {

		if (emp_id == 0) {
			System.out.println("Not Working!...");
		} else {
			System.out.println("Working as a Employee!...");
		}

	}

}

public class EmployeeOperation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the Employee Id :");
		int id = sc.nextInt();
		Person stu = new Employee("Mohan", "male", 0);
		Person emp = new Employee("Ram", "male", id);

		stu.work();
		emp.work();

		emp.changename("Ramkumar");
		System.out.println(emp.toString());

	}

}
