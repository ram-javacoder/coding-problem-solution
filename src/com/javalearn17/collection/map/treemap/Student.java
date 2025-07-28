package com.javalearn17.collection.map.treemap;

public class Student implements Comparable<Student> {

	private int id;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	// Decending Order
	@Override
	public int compareTo(Student s) {

		return s.getId() - this.getId();
	}

}
