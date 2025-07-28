package com.ty.learnjava17.objectclass;

//Example of toString method

class Student {

	private String name;
	private int id;
	private String city;

	public Student() {
		super();
	}

	public Student(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + "]";
	}

}

public class StudentOperation {

	public static void main(String[] args) {

		Student s = new Student("Ramkumar", 121, "Chennai");
		System.out.println(s.toString());
		Object o = new Object();
		System.out.println(o.toString()); // print object in meaningful way

	}

}
