package com.ty.learnjava17.staticmembers;

class Outer {

	private String name;
	private int stu_id;
	private String dept;
	private static String school_name = "Anderson HSS";

	public Outer() {
		super();
	}

	public Outer(String name, int stu_id, String dept) {
		super();
		this.name = name;
		this.stu_id = stu_id;
		this.dept = dept;
	}

	static class Inner {

		Outer obj = new Outer("Ram", 2005, "Computer Science");

		public void stu_details() {

			System.out.println("Student name :" + obj.name);
			System.out.println("Id :" + obj.stu_id);
			System.out.println("Department :" + obj.dept);
			System.out.println("School name :" + Outer.school_name);

		}

	}

}

public class StaticInnerClass {

	public static void main(String[] args) {

		Outer.Inner oi = new Outer.Inner();
		oi.stu_details();
	}

}
