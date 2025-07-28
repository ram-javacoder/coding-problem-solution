package com.ty.learnjava17.oops.encapsulation;

class Employee {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void salaryRaise(int raise) {

		this.salary = salary + raise;

	}

}

public class EmployeeOperation {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Ramkumar", 35000);
		System.out.println("Employee name :" + emp1.getName());
		System.out.println("salary :" + emp1.getSalary());
		emp1.salaryRaise(1500);
		System.out.println("Employee salary after increment :" + emp1.getSalary());

	}

}
