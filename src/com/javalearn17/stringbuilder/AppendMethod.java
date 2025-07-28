package com.javalearn17.stringbuilder;

public class AppendMethod {

	public static void main(String[] args) {

		StringBuilder name = new StringBuilder("My name is : ");
		name.append("Ramkumar");

		StringBuilder age = new StringBuilder("Age :");
		age.append(30);

		StringBuilder salary = new StringBuilder("Salary :");
		salary.append(38000.0d);

		StringBuilder bloodGroup = new StringBuilder("Blood group :");
		bloodGroup.append('A');

		StringBuilder department = new StringBuilder("Department :");
		char c[] = { 'S', 'O', 'F', 'T', 'W', 'A', 'R', 'E',' ', 'D', 'E', 'V', 'E', 'L', 'O', 'P', 'E', 'R' };

		department.append(c);
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(bloodGroup);
		System.out.println(department);
	}

}
