package com.learnjava17.ComparableInterface;

//Java Program to Avoid Duplicate User 
//Defined Objects in TreeSet
import java.util.TreeSet;

public class StudentOperation {

	public static void main(String[] args) {

		TreeSet<Student> stu = new TreeSet<Student>();

		stu.add(new Student("James", 3));
		stu.add(new Student("Ram", 5));
		stu.add(new Student("Anderson", 1));
		stu.add(new Student("David", 3));

		for (Student student : stu) {

			System.out.println(student);
		}

	}

}
