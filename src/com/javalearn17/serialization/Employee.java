package com.javalearn17.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private int id;
	private String name;
	transient private int salary;
	private String password;
	public Employee() {
		super();
		
	}
	public Employee(int id, String name, int salary, String password) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
