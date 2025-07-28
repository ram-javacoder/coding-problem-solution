package com.learnjava17.java8programming.methodreference;

//Method reference using Constructor

class StudentInformation {

	Integer id, age;
	String name;
	String mark;

	public StudentInformation(Integer id, Integer age, String name, String mark) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", age=" + age + ", name=" + name + ", mark=" + mark + "]";
	}

}

interface StudentDetails {

	StudentInformation getStudentDetails(Integer id, Integer age, String name, String mark);
}

public class StudentInformations {
	public static void main(String[] args) {

		StudentDetails stu = StudentInformation::new;
		StudentInformation s = stu.getStudentDetails(121, 28, "Ram", "87");
		System.out.println(s);

	}

}
