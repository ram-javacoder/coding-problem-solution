package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {

    int id;
    	String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
    

public class EmployeeOprn {
	
	public static void main(String[] args) {
	
		 List<Employee> employees = Arrays.asList(
	                new Employee(1, "Ram", "IT", 50000),
	                new Employee(2, "Sam", "HR", 40000),
	                new Employee(3, "John", "IT", 60000),
	                new Employee(4, "Ravi", "HR", 45000),
	                new Employee(5, "Amit", "Finance", 70000)
	        );

		 System.out.println("Average Salary for each department:");
		 Map<String, Double> avgSalaryDep =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				 Collectors.averagingDouble(Employee::getSalary)));
		 
		 System.out.println(avgSalaryDep);
		 
		 System.out.println("\nHighest Salary in each department: ");
		 
		Map<String, Optional<Employee>> highestSalaryDep =  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				 Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		highestSalaryDep.forEach((dep,emp) -> {
			
			System.out.println(dep+ " : " +emp.get().getName()+ ", " +emp.get().getSalary());
			
		});
		
		System.out.println("\nTotal Salary in each department: ");
		Map<String, DoubleSummaryStatistics> totalSalaryDep =  employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment,
				Collectors.summarizingDouble(Employee::getSalary)));
		
		totalSalaryDep.forEach((dep,sal) -> {
			
			System.out.println(dep+ ": " +sal.getSum());
			
		});
		
	}

	
}