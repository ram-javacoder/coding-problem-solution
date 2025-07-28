package com.learnjava17.java8programming;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class EmpPartition {

	private Long emp_id;
	private String name;
	private String dept;
	private Double salary;
	private int age;
	private String email;
	private LocalDateTime dateOfJoining;

	public EmpPartition(Long emp_id, String name, String dept, Double salary, int age, String email,
			LocalDateTime dateOfJoining) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
		this.email = email;
		this.dateOfJoining = dateOfJoining;
	}

	public Long getEmp_id() {
		return emp_id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public Double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}

	@Override
	public String toString() {
		return "Emp [emp_id=" + emp_id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age
				+ ", email=" + email + ", dateOfJoining=" + dateOfJoining + "]";
	}

}

public class PartitionByExamples {

	public static void main(String[] args) {

		List<EmpPartition> employees = List.of(new EmpPartition(101L, "Arjun", "IT", 75000.0, 28, "", LocalDateTime.now()),
				new EmpPartition(102L, "Sneha", "HR", 85000.0, 30, "", LocalDateTime.now()),
				new EmpPartition(103L, "Ravi", "Finance", 65000.0, 35, "", LocalDateTime.now()),
				new EmpPartition(104L, "Meena", "IT", 92000.0, 33, "", LocalDateTime.now()));

		System.out.println("Divide employees by whether salary is above or below 75,000.");

		Map<Boolean, List<EmpPartition>> partionEmpBySalary = employees.stream()
				.collect(Collectors.partitioningBy(e -> e.getSalary() > 75000));

		System.out.println("Employees earning more than 75000");
		partionEmpBySalary.get(true).forEach(System.out::println);

		System.out.println("Employees earning less than 75000");
		partionEmpBySalary.get(false).forEach(System.out::println);

	}
}
