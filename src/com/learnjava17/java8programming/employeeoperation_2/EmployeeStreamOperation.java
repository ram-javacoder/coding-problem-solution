package com.learnjava17.java8programming.employeeoperation_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeStreamOperation {

	public static void main(String[] args) {

		ArrayList<Employee> datas = DataSource.getData();

		System.out.println("Employee Informations :");
		datas.stream().forEach(d -> System.out.println(d));

		/*
		 * System.out.println("<-------------------->");
		 * datas.stream().max(Comparator.comparingDouble(Employee::getSalary)).
		 * ifPresentOrElse(emp -> System.out.println(emp), () -> new
		 * RuntimeException("No Employee"));
		 * System.out.println("<-------------------->");
		 */

		// Employees who are managers and salary greater than 100000
		Predicate<Employee> employeeWithManagerPosition = m -> m.getJobTitle().contains("Manager");

		System.out.println("\nEmployees who are managers and salary greater than 100000 :");
		datas.stream().filter((employeeWithManagerPosition).and(s -> s.getSalary() >= 100000)).forEach(e -> System.out
				.println("Name : " + e.getName() + ", Job Title : " + e.getJobTitle() + ", Salary :" + e.getSalary()));

		/* Employees who are joined in the Last 3 years */

		// LocalDateTime threeYearsAgo = LocalDateTime.minusYears(3);

		Optional<LocalDateTime> maximum3Year = datas.stream().map(Employee::getDateOfJoining)
				.max(LocalDateTime::compareTo);

		LocalDate lastThreeYears = maximum3Year.map(dateTime -> dateTime.toLocalDate().minusYears(3)).orElse(null);

		System.out.println("\nEmployees who are joined in the last 3 years :");
		datas.stream()
				.filter(e -> lastThreeYears != null && e.getDateOfJoining().toLocalDate().isAfter(lastThreeYears)
						|| e.getDateOfJoining().toLocalDate().isEqual(lastThreeYears))
				.forEach(s -> System.out.println(s));

		// Sort Employees Descending order based on YOE and Ascending order based on
		// salary

		System.out.println("\nSort Employees Descending order based on YOE and Ascending order based on salary :");
		Comparator<Employee> comparator = Comparator.comparingInt(Employee::getTotalYearsOfExperience).reversed()
				.thenComparingDouble(Employee::getSalary);

		datas.stream().sorted(comparator).forEach(e -> System.out.println("Employee name : " + e.getName()
				+ ", Year of Experience :" + e.getTotalYearsOfExperience() + ",Salary :" + e.getSalary()));

		// Employee Names reversed and Uppercase
		System.out.println("\nEmployee names with UpperCase and Reverse Order :");
		datas.stream().map(e -> new StringBuilder(e.getName().toUpperCase()).reverse())
				.forEach(s -> System.out.println("Employee names :" + s));

		// Find out Maximum Year of Joining
		LocalDateTime maximumYear = datas.stream().map(Employee::getDateOfJoining)
				.max(LocalDateTime::compareTo).get();

		// Filter out all employees who have joined in the last 5 years and have a
		// performance rating of less than 8,
		// but have a salary between 60,000 and 120,000,

//if the date of Joining is current date  
//		List<Employee> filteredEmployees = employees.stream()
//		    .filter(emp -> emp.getJoiningDate().isAfter(LocalDate.now().minusYears(5))) // Filter employees joined in the last 5 years
//		    .filter(emp -> emp.getPerformanceRating() < 8) // Performance rating less than 8
//		    .filter(emp -> emp.getSalary() >= 60000 && emp.getSalary() <= 120000) // Salary between 60,000 and 120,000
//		    .collect(Collectors.toList());

		LocalDate maximumYearsMinus5Years = maximumYear.toLocalDate().minusYears(5);

		System.out.println(
				"\nEmployees who have joined in the last 5 years and have a performance rating of less than 8 but have a salary between 60,000 and 120,000 : ");

		datas.stream()
				.filter(date -> maximumYearsMinus5Years != null
						&& date.getDateOfJoining().toLocalDate().isAfter(maximumYearsMinus5Years))
				.filter(performanceRating -> performanceRating.getPerformanceRating() <= 8)
				.filter(salary -> salary.getSalary() >= 60000 && salary.getSalary() <= 120000)
				.collect(Collectors.toList()).forEach(s -> System.out.println("Employee :" + s.getName() + ", Salary :"
						+ s.getSalary() + ", Date of Joining :" + s.getDateOfJoining() + ", "));

		
		/*
		 * Remove employees earning less than 50,000 who work in the Sales or Marketing
		 * departments. From the remaining employees, calculate the total salary of
		 * those with more than three years of experience, and determine the average age
		 * of employees whose performance rating is at least 7.
		 */
		
		double sumOfSalaries = datas.stream().filter(
				employee -> employee.getSalary() < 50000 && employee.getDepartment().equalsIgnoreCase("Marketing")
						|| employee.getDepartment().equalsIgnoreCase("Finance"))
				.filter(employee -> employee.getTotalYearsOfExperience() > 3).mapToDouble(Employee::getSalary).sum();

		System.out.println(
				"\nEmployees who have salary less than 50000 but are in the Sales or Marketing department, \nCalculate the sum of the salaries of the remaining employees,but only for those who have \nmore than 3 years of experience: "
						+ sumOfSalaries);

		/* Filter out employees who have a performance rating of at least 7 */

		List<Employee> performanceRating = datas.stream().filter(employees -> employees.getPerformanceRating() >= 7)
				.collect(Collectors.toList());

		System.out.println("\nFilter out employees who have a performance rating of at least 7 :");
		if (performanceRating.isEmpty()) {

			System.out.println("No employees with a performance rating of at least 7");
		} else {
			performanceRating.forEach(e -> System.out
					.println("Employee : " + e.getName() + ", Performance Rating : " + e.getPerformanceRating()));

		}

		// Calculate the average age of the filtered employees(PerformanceRating)
		double averageAge = performanceRating.stream().mapToInt(Employee::getAge).average().orElse(0);
		System.out.println("Average age of employees whose performance rating of at least 7 :" + averageAge);

		// Write a Java 8 stream program to group employee based on department who is
		// getting highest salary in each department

		Map<String, Employee> highestPaidInDept = datas.stream().collect(Collectors.toMap(Employee::getDepartment,
				e -> e, (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2));

		System.out.println(" ");
		System.out.println("Group employee based on department who is getting highest salary in each department");
		highestPaidInDept.forEach((Dept, emp) -> System.out.println("Department : " + Dept + ", Employee name : "
				+ emp.getName() + ", Employee's salary : " + emp.getSalary()));

		// Alternative approach

		/*
		 * Map<String, List<Employee>> groupedEmployee = datas.stream()
		 * .collect(Collectors.groupingBy(Employee::getDepartment));
		 * 
		 * groupedEmployee.forEach((dept, employees) -> { // Find max salary in this
		 * department double maxSalary = employees.stream()
		 * .mapToDouble(Employee::getSalary) .max() .orElse(0);
		 * 
		 * // Filter employees with max salary List<Employee> topEarners =
		 * employees.stream() .filter(e -> e.getSalary() == maxSalary)
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println("Department: " + dept); topEarners.forEach(e ->
		 * System.out.println("  " + e.getName() + " -> ₹" + e.getSalary()) ); });
		 */

		// Find out maximum age of Employee in each Department
		System.out.println("\nFind employee who has maximum age in each department");
		Map<String, Employee> findMaxAgeEachDept = datas.stream().collect(
				Collectors.toMap(Employee::getDepartment, e -> e, (e1, e2) -> e2.getAge() > e1.getAge() ? e2 : e1));
		findMaxAgeEachDept.forEach((Dept, emp) -> System.out
				.println("Department : " + Dept + " , Employee name : " + emp.getName() + ", Age : " + emp.getAge()));

	}

}
