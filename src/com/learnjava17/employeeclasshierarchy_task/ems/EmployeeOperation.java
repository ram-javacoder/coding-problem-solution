package com.learnjava17.employeeclasshierarchy_task.ems;

public class EmployeeOperation {

	public static void main(String[] args) {
		
		Employee emp=new Manager(1551,"Ramkumar",35000,2000.0);
		double empSalary=emp.calculateSalary();
		Manager manager =null;
		
		//downcasting in order to get the designation of Manager
		
		if (emp instanceof Manager) {
			
			manager=(Manager)emp;
		
		}
		
		String empDesignation =manager.printEmployeedetails();
		System.out.println("Employee name :" +emp.getName()+ "\nDesignation :" +empDesignation+ "\nSalary :" +empSalary);
		System.out.println(" ");
		
		Employee emp2=new Developer(1552,"Mohanavel",50000,"Java Programming");
		double empSalary1=emp2.calculateSalary();
		
		
		if (emp2 instanceof Developer) {
			
			Developer dev=(Developer)emp2;
		
			String empDesignation2= dev.printEmployeedetails();
			System.out.println("Employee name :" +emp2.getName()+ "\nDesignation :" +empDesignation2+ "\nSalary :" +empSalary1+ "\nProgramming :" +dev.getProgrammingLanguage());
		}
		
		
		
		

	}

}

/*

Employee name :Ramkumar
Designation :Manager
Salary :37000.0
 
Developer details :
Employee name :Mohanavel
Designation :Developer
Salary :52000.0
Programming :Java Programming
*/