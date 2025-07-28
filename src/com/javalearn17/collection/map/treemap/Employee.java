package com.javalearn17.collection.map.treemap;

public class Employee {

	private Integer rollno;
	private String name, address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public Integer getRollno() {
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
