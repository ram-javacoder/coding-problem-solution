package com.learnjava17.java8programming.employeeoperation;

import java.time.LocalDateTime;
import java.util.Objects;

public class Manager {

	private String name;
	private String department;
	private String jobTitle;
	private int age;
	private int totalYearsOfExperience;
	private double salary;
	private int performanceRating;
	private LocalDateTime dateOfJoining;

	public Manager() {
		super();
	}

	public Manager(String name, String department, String jobTitle, int age, int totalYearsOfExperience, double salary,
			int performanceRating, LocalDateTime dateOfJoining) {
		super();
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		this.age = age;
		this.totalYearsOfExperience = totalYearsOfExperience;
		this.salary = salary;
		this.performanceRating = performanceRating;
		this.dateOfJoining = dateOfJoining;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTotalYearsOfExperience() {
		return totalYearsOfExperience;
	}

	public void setTotalYearsOfExperience(int totalYearsOfExperience) {
		this.totalYearsOfExperience = totalYearsOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}

	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}

	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfJoining, department, jobTitle, name, performanceRating, salary,
				totalYearsOfExperience);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return age == other.age && Objects.equals(dateOfJoining, other.dateOfJoining)
				&& Objects.equals(department, other.department) && Objects.equals(jobTitle, other.jobTitle)
				&& Objects.equals(name, other.name) && performanceRating == other.performanceRating
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& totalYearsOfExperience == other.totalYearsOfExperience;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", department=" + department + ", jobTitle=" + jobTitle + ", age=" + age
				+ ", totalYearsOfExperience=" + totalYearsOfExperience + ", salary=" + salary + ", performanceRating="
				+ performanceRating + ", dateOfJoining=" + dateOfJoining + "]";
	}

}
