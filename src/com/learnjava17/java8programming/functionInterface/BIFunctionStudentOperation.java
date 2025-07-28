package com.learnjava17.java8programming.functionInterface;

import java.util.function.BiFunction;

class StudentInfo {

	String stu_name;
	Double mark;

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentInfo(String stu_name, Double mark) {
		super();
		this.stu_name = stu_name;
		this.mark = mark;
	}

}

public class BIFunctionStudentOperation {

	public static void main(String[] args) {

		BiFunction<String, Double, StudentInfo> bf = (n, m) -> new StudentInfo(n, m);
		StudentInfo stu = bf.apply("Ram", 45d);
		System.out.println("Student name :" + stu.stu_name);
		System.out.println("Mark :" + stu.mark);

	}

}
