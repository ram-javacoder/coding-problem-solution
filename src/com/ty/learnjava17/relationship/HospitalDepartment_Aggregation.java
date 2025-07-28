package com.ty.learnjava17.relationship;

class Hospital_ {
	private String name;
	private String location;

	public Hospital_(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public void detailsOfHospital() {
		System.out.println("Hospital Name: " + name);
		System.out.println("Location: " + location);
	}
}

class Department_ {
	private String deptName;
	private int numOfDoctors;

	// Aggregation: Hospital is referenced but not owned by Department
	private Hospital_ hospital;

	public Department_(String deptName, int numOfDoctors, Hospital_ hospital) {
		this.deptName = deptName;
		this.numOfDoctors = numOfDoctors;
		this.hospital = hospital; // Passing Hospital object instead of creating one
	}

	// Display department details
	public void detailsOfDepartment() {
		if (hospital != null) {
			hospital.detailsOfHospital(); // Optional association
		}
		System.out.println("Department Name: " + deptName);
		System.out.println("Number of Doctors: " + numOfDoctors);
	}
}

public class HospitalDepartment_Aggregation {

	public static void main(String[] args) {

		Hospital_ hospital = new Hospital_("Rajiv Gandhi Hospital", "Chennai");

		Department_ department = new Department_("Emergency Department (ER)", 5, hospital);

		department.detailsOfDepartment();

	}
}
