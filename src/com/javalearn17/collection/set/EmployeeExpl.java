package com.javalearn17.collection.set;

import java.util.HashSet;
import java.util.Set;

class EmployeeData {

	private int id;
	private String name;

	public EmployeeData(int id, String name) {
		this.id = id;
		this.name = name;     
	}

	// Override hashCode() and equals() based on ID
	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		EmployeeData other = (EmployeeData) obj;
		return id == other.id;
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

	
	
}

public class EmployeeExpl {
	public static void main(String[] args) {
		
		Set<EmployeeData> employees = new HashSet<>();

        // Adding employees with duplicate IDs
        employees.add(new EmployeeData(101, "John"));
        employees.add(new EmployeeData(102, "Alice"));
        employees.add(new EmployeeData(101, "David")); // Duplicate ID
        employees.add(new EmployeeData(103, "Bob"));
        employees.add(new EmployeeData(102, "Eva"));  // Duplicate ID

        // Displaying unique employees
        System.out.println("Unique employees based on ID:");
        for (EmployeeData emp : employees) {
            System.out.println(emp.getId() + ": " + emp.getName());
        }

	
	
	}
}