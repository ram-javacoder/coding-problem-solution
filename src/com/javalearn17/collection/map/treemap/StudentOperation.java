package com.javalearn17.collection.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class StudentOperation {

	public static void main(String[] args) {

		TreeMap<Student, Integer> stu = new TreeMap<Student, Integer>();
		stu.put(new Student(2, "Ram"), 2);
		stu.put(new Student(3, "Lakshman"), 5);
		stu.put(new Student(1, "Lokesh"), 3);

		for (Map.Entry<Student, Integer> entry : stu.entrySet()) {

			System.out.println("Key :" + entry.getKey() + " : Value " + entry.getValue());

		}

	}

}
