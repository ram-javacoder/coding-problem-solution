package com.learnjava17.java8programming.employeeoperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamapiOperation {

	public static void main(String[] args) {

		ArrayList<Employee> data = DataSource.getData();

		// See all the Employee Object
		data.stream().forEach(e -> System.out.println(e));

		// Filter employee information based on IT
		System.out.println(
				"_________________________________________________________________________________________________________________________________________________________________________________________");

		System.out.println("\nFilter the record based on IT Department only");
		System.out.println("________________________________________________");
		Predicate<Employee> predicateOn = e -> e.getDepartment().equalsIgnoreCase("IT");
		data.stream().filter(predicateOn).forEach(e -> System.out.println(e));

		System.out.println("\nFilter the record based on  IT and HR Department ");
		System.out.println("___________________________________________________");

		Predicate<Employee> predicateOnHrDept = e -> e.getDepartment().equalsIgnoreCase("HR");
		data.stream().filter((predicateOn).or(predicateOnHrDept)).forEach(e -> System.out.println(e));

		System.out.println("\nFilter the record based on HR and IT Department and sorted based on Age");
		System.out.println("________________________________________");

		data.stream().filter((predicateOn).or(predicateOnHrDept)).sorted((e1, e2) -> e1.getAge() - e2.getAge())
				.forEach(e -> System.out.println(e));

		System.out.println("\nFilter the record based on IT and HR Department and sorted based on Salary");
		System.out.println("________________________________________");
		;
		data.stream().filter((predicateOn).or(predicateOnHrDept))
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).forEach(e -> System.out.println(e));

		System.out.println(
				"\nFilter the record based on IT and HR Department  and sorted based on Salary and Only top 3");
		System.out.println("________________________________________");

		data.stream().filter((predicateOn).or(predicateOnHrDept))
				.sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).limit(3)
				.forEach(e -> System.out.println(e));

		System.out.println("\nFilter the employee in Finance Department with highest Salary");
		System.out.println("_______________________________________________________________");

		Predicate<Employee> predicateOnMaxSalaryFinace = e -> e.getDepartment().equalsIgnoreCase("Finance");
		Comparator<Employee> comparatoronSalary = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
		data.stream().filter(predicateOnMaxSalaryFinace).sorted(comparatoronSalary).max(comparatoronSalary)
				.ifPresent(e -> System.out.println(e));

		/*
		 * data.stream().filter(d ->
		 * d.getDepartment().equalsIgnoreCase("Finance")).distinct() .max((s1, s2) ->
		 * Double.compare(s1.getSalary(),
		 * s2.getSalary())).ifPresent(System.out::println);
		 */

		/*
		 * Alternate code :
		 * 
		 * Optional<Employee> highestSalary = data.stream().filter(e ->
		 * e.getDepartment().equalsIgnoreCase("Finance"))
		 * .max(Comparator.comparingDouble(Employee::getSalary)); if
		 * (highestSalary.isPresent()) { System.out.println(highestSalary.get()); }
		 */

		System.out.println("\nList all the Employee whose age between 30 to 33 and sort them on bases of Age");
		System.out.println("________________________________________");
		List<Employee> collect = (List<Employee>) data.stream().filter(e -> e.getAge() >= 30 && e.getAge() <= 33)
				.sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println(
				"\nEmployee who are from marketing department increase their salary by 25 percent and for rest increase salary by 10 percentage");
		System.out.println("________________________________________");

		
		/*
		 * data.stream().forEach(e -> { if
		 * (e.getDepartment().equalsIgnoreCase("Marketing")) { e.setSalary(e.getSalary()
		 * + (e.getSalary() * 0.25));
		 * 
		 * } else { e.setSalary(e.getSalary() + (e.getSalary() * 0.10));
		 * 
		 * }
		 * 
		 * }); data.stream().forEach(System.out::println);
		 * 
		 * System.out.println("*******************");
		 */

		data.stream().map(e -> {
			if (e.getDepartment().equalsIgnoreCase("Marketing")) {

				e.setSalary(e.getSalary() + e.getSalary() * 0.25);

			} else {

				e.setSalary(e.getSalary() + e.getSalary() * 0.10);
			}

			return e;

		}).forEach(System.out::println);

		System.out.println(
				"\nFor the Employee of IT and Finance increase the salary by 25 percentage and Specifically for a IT Department employee give a boost in rating by 1");
		System.out.println("________________________________________");
//		data.stream().forEach(e -> {
//			if (e.getDepartment().equalsIgnoreCase("IT") || e.getDepartment().equalsIgnoreCase("Finance")) {
//				e.setSalary(e.getSalary() + (e.getSalary() * 0.25));
//
//			}
//			if (e.getDepartment().equalsIgnoreCase("IT")) {
//				e.setPerformanceRating(e.getPerformanceRating() + 1);
//			}
//
//		});
//		data.stream().forEach(System.out::println);

		// ******* Other Logic *******

		List<Employee> increaseSalary = data.stream().map(e -> {

			if (e.getDepartment().equalsIgnoreCase("IT")) {

				e.setPerformanceRating(e.getPerformanceRating() + 1);
			} 
			
			if (e.getDepartment().equalsIgnoreCase("IT") || e.getDepartment().equalsIgnoreCase("FINANCE")) {

				e.setSalary(e.getSalary() + (e.getSalary() * 0.25));

			}
			return e;

		}).collect(Collectors.toList());
		increaseSalary.forEach(System.out::println);

		System.out.println("\nEmployee who has spent 2 or 3 year in company give them rise of 35 Percentage");
		System.out.println("________________________________________");
		data.stream().forEach(e -> {
			if (e.getTotalYearsOfExperience() >= 2 && e.getTotalYearsOfExperience() <= 3) {
				e.setSalary(e.getSalary() + (e.getSalary() * 0.35));
			}

		});
		data.stream().forEach(System.out::println);

		
		/*
		 * //way 2 List<Employee> test = data.stream().filter(y ->
		 * y.getTotalYearsOfExperience() == 2 || y.getTotalYearsOfExperience()
		 * ==3).map(e -> {
		 * 
		 * e.setSalary(e.getSalary() + e.getSalary()*0.35); return e;
		 * 
		 * 
		 * }).collect(Collectors.toList()); test.forEach(System.out::println);
		 */	
		System.out.println(
				"\nEmployees whose age is more than or equal to 35, make them Manager and Collect their Information :");
		System.out.println("________________________________________");

		Set<Manager> collectManager = data.stream().filter(e -> e.getAge() >= 35).map(e -> {
			Manager manager = new Manager();
			manager.setName(e.getName());
			manager.setAge(e.getAge());
			manager.setDateOfJoining(e.getDateOfJoining());
			manager.setJobTitle(e.getJobTitle());
			manager.setPerformanceRating(e.getPerformanceRating());
			manager.setSalary(e.getSalary());
			manager.setTotalYearsOfExperience(e.getTotalYearsOfExperience());

			return manager;
		}).collect(Collectors.toSet());
		collectManager.stream().forEach(System.out::println);

	}

}