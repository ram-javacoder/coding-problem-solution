package com.learnjava17.java8programming.mockquestions;

public class Employee {

	private String name;
	private String department;
	private String jobTitle;
	private int age;
	private int totalYearsOfExperience;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String department, String jobTitle, int age, int totalYearsOfExperience,
			double salary) {
		super();
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		this.age = age;
		this.totalYearsOfExperience = totalYearsOfExperience;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public int getAge() {
		return age;
	}

	public int getTotalYearsOfExperience() {
		return totalYearsOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", jobTitle=" + jobTitle + ", age=" + age
				+ ", totalYearsOfExperience=" + totalYearsOfExperience + ", salary=" + salary + "]";
	}

}
