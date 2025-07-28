package com.javalearn17.collection.set;

public class Employees implements Comparable<Employees> {

	private int empId;
	private String empName;
	private String empDepartment;

	public Employees() {
		super();
	}

	public Employees(int empId, String empName, String empDepartment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "]";
	}

	@Override
	public int compareTo(Employees o) {
		
		return this.empId - o.empId;
	}

}
