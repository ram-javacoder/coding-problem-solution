package com.ty.learnjava17.relationship;

class Hospital {

	private String name;
	private String location;

	Hospital() {

		super();
	}

	Hospital(String name, String location) {

		this.name = name;
		this.location = location;

	}

	public void detailsOfHospital() {

		System.out.println("Name of hospital : " + name);
		System.out.println("Location : " + location);

	}

}

class Department {

	private String deptName;
	private int numOfDocters;

	private final Hospital hospital; 

	Department(String deptName, int numOfDocters, String hospitalName, String location) {
		this.deptName = deptName;
		this.numOfDocters = numOfDocters;
		this.hospital = new Hospital(hospitalName, location);  //Composition

	}

	public void detailsOfDepartment() {

		hospital.detailsOfHospital();
		System.out.println("Name of Department : " + deptName);
		System.out.println("Number of docters : " + numOfDocters);

	}

}

public class HospitalDepartmentRelation {

	public static void main(String[] args) {

		Department d = new Department("Emergency Department (ER)", 5, "Rajiv Ghandi Hospital", "Chennai");
		d.detailsOfDepartment();
	}
}
