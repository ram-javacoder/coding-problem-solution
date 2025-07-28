package com.javalearn17.collection.map;

import java.util.Objects;

public class Employee {

	int rollno;
	String name, address;
	
	
	public Employee(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(address, name, rollno);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name) && rollno == other.rollno;
	}


	@Override
	public String toString() {
		return "Employee [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}


	
	
	

	
	
}
