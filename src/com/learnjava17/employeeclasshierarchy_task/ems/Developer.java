package com.learnjava17.employeeclasshierarchy_task.ems;

class Developer extends Employee {

	private String programmingLanguage;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int empId, String name, double salary, String programmingLanguage) {
		super(empId, name, salary);
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	public double calculateSalary() {
		return super.calculateSalary() + 2000.0;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public static String printEmployeedetails() {

		System.out.println("Developer details :");
		return "Developer";
	}

}
