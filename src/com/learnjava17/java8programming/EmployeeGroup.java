package com.learnjava17.java8programming;

public class EmployeeGroup {

	private int empId;
	private String empName;
	private String jobTiltle;
	private double salary;

	public EmployeeGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeGroup(int empId, String empName, String jobTiltle, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.jobTiltle = jobTiltle;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJobTiltle() {
		return jobTiltle;
	}

	public void setJobTiltle(String jobTiltle) {
		this.jobTiltle = jobTiltle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", jobTiltle=" + jobTiltle + ", salary=" + salary
				+ "]";
	}

}
