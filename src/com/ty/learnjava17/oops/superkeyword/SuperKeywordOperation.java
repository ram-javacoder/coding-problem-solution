package com.ty.learnjava17.oops.superkeyword;

class A {
	int emp_id;
	String name;
	int age;

	public A(int emp_id, String name, int age) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Employee id :" + emp_id + "\nName :" + name + "\nAge :" + age);

	}
	void message() {
		System.out.println("Inside message of Class A");
	}
}

class B extends A {

	String dep_name;
	String msg;
	public B(int emp_id, String name, int ag, String dep_name) {
		super(emp_id, name, ag);
		this.dep_name = dep_name;
		this.msg="This variable of Class B";
	}

	void display() {
		super.display();
		System.out.println("Department :" + dep_name);
		super.message();
		this.message();
		System.out.println(this.msg);
	}
	void message() {
		System.out.println("Inside the Message of B Class");
		
	}

}

public class SuperKeywordOperation {

	public static void main(String[] args) {
		B b = new B(1, "Ram", 28, "Software Development");
		b.display();

	}

}
