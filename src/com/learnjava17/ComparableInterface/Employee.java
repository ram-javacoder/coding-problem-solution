package com.learnjava17.ComparableInterface;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	private long salary;

	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee emp) {
//		// TODO Auto-generated method stub
//		return this.age-emp.age;
//	}

//	@Override
//	public int compareTo(Employee emp) {
//		// TODO Auto-generated method stub
//		return (int) (this.salary-emp.salary);
//	}

//	@Override
//	public int compareTo(Employee emp) {
//
//		return Double.compare(this.salary, emp.salary);
//	}
//}

	//Displaying based on name
//	@Override 
//	public int compareTo(Employee e)
//	{
//		return name.compareTo(e.name);
//	}
	
// Sorting the Employee Object based on their age
	@Override
	public int compareTo(Employee emp) {

		if (this.age > emp.age) {
			return 1;
		} else if (this.age < emp.age) {

			return -1;
		} else {
			return 0;
		}
	}
}