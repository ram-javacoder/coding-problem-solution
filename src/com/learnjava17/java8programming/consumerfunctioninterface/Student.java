package com.learnjava17.java8programming.consumerfunctioninterface;

import java.util.function.Consumer;

class StudentOperation {

	Integer stu_id;
	String stu_name;
	double mark;

	public StudentOperation(Integer stu_id, String stu_name, double mark) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.mark = mark;
	}

}

public class Student {
	public static void main(String[] args) {

		Consumer<StudentOperation> stu_info = s -> {
			System.out.println("Student id :" + s.stu_id + ", Student name : " + s.stu_name + ", Mark :" + s.mark);

		};

		StudentOperation[] stu = { new StudentOperation(121, "Ram", 80), new StudentOperation(123, "Mohan", 83),
				new StudentOperation(125, "Poongavan", 76) };

		for (StudentOperation student : stu) {

			stu_info.accept(student);
		}
	}
}
