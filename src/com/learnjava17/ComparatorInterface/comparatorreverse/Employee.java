package com.learnjava17.ComparatorInterface.comparatorreverse;

public class Employee {

	int rollno;
	String name, address;

	public Employee() {
		super();
	}

	public Employee(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

}
