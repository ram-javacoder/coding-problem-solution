package com.learnjava17.employeeclasshierarchy_task.ems;

class Employee {

	private int empId;
	private String name;
	private double salary;

	public Employee() {

		// LI
	}

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	/********************/
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	/********************/
	public static String printEmployeedetails() {

		return "Employee";
	}

	public String getProgrammingLanguage() {
		
		return null;
	}

}
