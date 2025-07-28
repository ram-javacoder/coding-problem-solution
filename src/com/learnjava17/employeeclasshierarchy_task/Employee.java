package com.learnjava17.employeeclasshierarchy_task;

public class Employee {

	private String name;
	private int employeeId;
	private double salary;
	private int leavesTaken;

	public Employee(String name, int employeeId, double salary, int leavesTaken) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.leavesTaken = leavesTaken;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getLeavesTaken() {
		return leavesTaken;
	}

	public void setLeavesTaken(int leavesTaken) {
		this.leavesTaken = leavesTaken;
	}

	public void displayDetails() {
		System.out.println("Employee Details :");
		System.out.println("Name :" + name);
		System.out.println("Id :" + employeeId);
		System.out.println("Salary :" + salary);
		System.out.println("Leaves Taken :" + leavesTaken);

	}

	public double calculateBonus() {

		return salary + 1200.0;
	}

	// Additional method to calculate leave deduction
	private double calculateLeaveDeduction() {
		// Implementation based on company policies

		double leavesDeduction = (salary / 30) * leavesTaken;
		return leavesDeduction;
	}

	// Additional method to calculate tax
	private double calculateTax() {
		// Implementation based on company policies

		double grosssalary = getSalary() + getSalary() * 0.10;
		grosssalary = grosssalary + (getSalary() * 0.20);
		double tax = 0;
		if (grosssalary <= 200000) {
			return tax;
		} else if (grosssalary <= 500000) {
			return tax = grosssalary * 0.10; // 10% tax
		} else if (grosssalary <= 1000000) {
			return tax = grosssalary * 0.20; // 20% tax
		} else {
			return tax = grosssalary * 0.30; // 30% tax
		}

	}

	public double calculateNetSalary() {

		// Implementation to calculate net salary after considering leaves, taxes, etc.
		return this.salary - (calculateLeaveDeduction()) - calculateTax();
	}

}

class ProjectManager extends Employee {

	private int projectsManaged;

	public ProjectManager(String name, int employeeId, double salary, int leavesTaken, int projectsManaged) {
		super(name, employeeId, salary, leavesTaken);
		this.projectsManaged = projectsManaged;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateBonus() {
		// Implementation of bonus calculation for project managers
		return super.getSalary() + 1200.0;

	}

	// Additional project manager-specific methods
	public void conductTeamMeeting() {

		System.out.println(getName() + " is Conducting a team meeting .");
	}

}

class SeniorDeveloper extends Employee {

	private int projectsContributed;

	public SeniorDeveloper(String name, int employeeId, double salary, int leavesTaken, int projectsContributed) {
		super(name, employeeId, salary, leavesTaken);
		this.projectsContributed = projectsContributed;
	}

	@Override
	public double calculateBonus() {
		// Implementation of bonus calculation for senior developers
		return super.getSalary() + 2500.0;

	}

	// Additional senior developer-specific methods
	public void mentorJuniorDevelopers() {

	}

}

class Trainee extends Employee {
	// Additional attributes and methods for trainees
	private String mentorName;

	public Trainee(String name, int employeeId, double salary, int leavesTaken, String mentorName) {
		super(name, employeeId, salary, leavesTaken);
		this.mentorName = mentorName;

	}

	@Override
	public double calculateBonus() {
		// Implementation of bonus calculation for trainees
		return super.getSalary() + 1000.0;

	}

	// Additional trainee-specific methods
	public void attendTrainingSession() {

		System.out.println(getName() + " is attending training Sessions. ");
	}

}
