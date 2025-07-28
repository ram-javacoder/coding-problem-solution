package com.ty.learnjava17.oops.encapsulation;

/* Write a program that instantiates multiple "Employee" objects and displays their information.
  */

class Employees {

	private String name;
	private int id;

	public Employees(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void employeeDetails() {

		System.out.println("Name :" + name);
		System.out.println("Id :" + id);

	}

}

public class MultipleEmployeeOperation {

	public static void main(String[] args) {

		Employees emp[] = new Employees[3];
		emp[0] = new Employees("Ramkumar", 1);
		emp[1] = new Employees("Mohanavel", 2);
		emp[2] = new Employees("Lokesh", 3);

		System.out.println("Employee details :\n");
		emp[0].employeeDetails();
		emp[1].employeeDetails();
		emp[2].employeeDetails();

	}

}
