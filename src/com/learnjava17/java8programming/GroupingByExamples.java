package com.learnjava17.java8programming;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Emp {

	private Long emp_id;
	private String name;
	private String dept;
	private Double salary;
	private int age;
	private String email;
	private LocalDateTime dateOfJoining;

	public Emp(Long emp_id, String name, String dept, Double salary, int age, String email,
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

	public Double getSalary() {
		return salary;
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
		return "Id: " + emp_id + ", Name: " + name + ", Department: " + dept + ", Salary: " + salary + ", Age: " + age
				+ ", Email: " + email + ", DateOfJoining: " + dateOfJoining + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfJoining, dept, email, emp_id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return age == other.age && Objects.equals(dateOfJoining, other.dateOfJoining)
				&& Objects.equals(dept, other.dept) && Objects.equals(email, other.email)
				&& Objects.equals(emp_id, other.emp_id) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}

}

public class GroupingByExamples {

	public static void main(String[] args) {

		List<Emp> empList = List.of(
				new Emp(101L, "Arjun Sharma", "IT", 75000.0, 28, "arjun.sharma@example.com",
						LocalDateTime.of(2021, 3, 15, 10, 0)),
				new Emp(102L, "Priya Desai", "HR", 65000.0, 32, "priya.desai@example.com",
						LocalDateTime.of(2019, 7, 10, 9, 30)),
				new Emp(103L, "Ravi Kumar", "Finance", 82000.0, 35, "ravi.kumar@example.com",
						LocalDateTime.of(2020, 1, 20, 11, 45)),
				new Emp(104L, "Sneha Mehta", "Marketing", 70000.0, 30, "sneha.mehta@example.com",
						LocalDateTime.of(2022, 5, 5, 8, 15)),
				new Emp(105L, "Amit Patel", "IT", 90000.0, 40, "amit.patel@example.com",
						LocalDateTime.of(2018, 11, 1, 10, 0)),
				new Emp(106L, "Nisha Reddy", "HR", 62000.0, 29, "nisha.reddy@example.com",
						LocalDateTime.of(2023, 2, 28, 9, 0)),
				new Emp(107L, "Rahul Joshi", "Finance", 88000.0, 37, "rahul.joshi@example.com",
						LocalDateTime.of(2021, 6, 18, 9, 45)),
				new Emp(108L, "Kavita Iyer", "Marketing", 71000.0, 31, "kavita.iyer@example.com",
						LocalDateTime.of(2020, 9, 25, 8, 50)),
				new Emp(109L, "Suresh Nair", "Operations", 67000.0, 33, "suresh.nair@example.com",
						LocalDateTime.of(2019, 12, 10, 9, 20)),
				new Emp(110L, "Meena Das", "IT", 93000.0, 38, "meena.das@example.com",
						LocalDateTime.of(2017, 8, 3, 10, 10)));

		System.out.println("Current employees data:");
		empList.stream().forEach(System.out::println);

		System.out.println("Group employees by department:");
		Map<String, List<Emp>> groupEmpByDept =  empList.stream().collect(Collectors.groupingBy(Emp::getDept));
		groupEmpByDept.forEach((dept,employees) -> {
			System.out.println("Department: " +dept);
			System.out.println(employees);
			
		});
		
		System.out.println("\nGroups Employees based on age:");
		Map<Integer, List<Emp>> groupEmpAge = empList.stream()
				.collect(Collectors.groupingBy(Emp::getAge, Collectors.toList()));
		groupEmpAge.forEach((age, employees) -> {
			System.out.println("Age: " + age);
			employees.forEach(System.out::println);

		});

		System.out.println("\nGroups Employees based on age sorting in Ascending order:");

		Map<Integer, List<Emp>> groupEmpAgeSortAscending = empList.stream()
				.collect(Collectors.groupingBy(Emp::getAge, TreeMap::new, Collectors.toList()));
		groupEmpAgeSortAscending.forEach((age, employees) -> {
			System.out.println("Age: " + age);
			employees.forEach(System.out::println);

		});

	}

}
