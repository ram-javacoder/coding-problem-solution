package com.learnjava17.employeeclasshierarchy_task;

import java.util.Scanner;

public class EmployeeOperation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Create an array of employees
		Employee[] employees = new Employee[3];

		// Interactive creation of different employee types
		for (int i = 0; i < employees.length; i++) {

			System.out.println("Enter the details of Employee " + (i + 1) + " : ");
			System.out.println("Name :");
			String name = sc.nextLine();
			System.out.println("Salary :");
			double sal = sc.nextDouble();
			System.out.println("Leaves taken :");
			int lev = sc.nextInt();
			sc.nextLine(); // Consume the new Line
			employees[i] = new Employee(name, i, sal, lev);

		}

		for (Employee employee : employees) {
			System.out.println("Employee Details:");
			employee.displayDetails();
			System.out.println("Bonus: $" + employee.calculateBonus());
			System.out.println("Net Salary: $" + employee.calculateNetSalary());

			// Handle scenarios based on employee type
			if (employee instanceof ProjectManager) {
				((ProjectManager) employee).conductTeamMeeting();
			} else if (employee instanceof SeniorDeveloper) {
				((SeniorDeveloper) employee).mentorJuniorDevelopers();
			} else if (employee instanceof Trainee) {
				((Trainee) employee).attendTrainingSession();
			}

			System.out.println("---------------------------");
		}
		sc.close();
	}

}
