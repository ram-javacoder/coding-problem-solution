package com.learnjava17.employeeclasshierarchy_task.ems;

public class Manager extends Employee{


	private double bonus;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int empId, String name, double salary, double bonus) {
		super(empId, name, salary);
		this.bonus = bonus;

	}
	
	@Override
	public double calculateSalary() {
		return super.calculateSalary()+bonus;
	}

	public static String printEmployeedetails() {

		
		return "Manager";
	}
	
}
