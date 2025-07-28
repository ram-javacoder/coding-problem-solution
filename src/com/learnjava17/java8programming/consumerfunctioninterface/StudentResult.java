package com.learnjava17.java8programming.consumerfunctioninterface;

import java.util.function.BiConsumer;

class StudentInfo {

	
	String name;
	int marks;

	
	public StudentInfo(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}

public class StudentResult {

	public static void main(String[] args) {

		// lambda expression to add grace marks to student using BiConsumer FI
		BiConsumer<StudentInfo, Integer> c = (s, i) -> s.marks = s.marks + 5;

		// create Student object with name and initial marks
		StudentInfo[] sArray = { new StudentInfo("Vijay", 92), new StudentInfo("Ajith", 78),
				new StudentInfo("Vikram", 66), new StudentInfo("Surya", 54), new StudentInfo("Karthi", 43),
				new StudentInfo("Arya", 31) };

		// invoke BiConsumer FI, iterating through all Students
		for (StudentInfo s : sArray) {
			c.accept(s,5);
		}

		// printing to console
		for (StudentInfo s : sArray) {
			System.out.println("Name : " + s.name + "\tMarks : " + s.marks);
		}
	}
}
