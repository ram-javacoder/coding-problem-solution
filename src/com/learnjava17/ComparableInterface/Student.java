package com.learnjava17.ComparableInterface;

public class Student implements Comparable<Student> {

	private String name;
	private int rank;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public int compareTo(Student s) {
		if (this.getRank() == s.getRank()) {
			return 0;
		} else if (this.getName().compareTo(s.getName()) < 0) {
			return -1;
			// 1 means Decending order
			// -1 means Ascending order
		} else {

			return 1;

		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rank=" + rank + "]";
	}

}
