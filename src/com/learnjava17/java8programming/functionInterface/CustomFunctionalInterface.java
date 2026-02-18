package com.learnjava17.java8programming.functionInterface;

@FunctionalInterface
interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}

class StudentDetails {
	String name;
	Double mark;
	Integer regNo;

	StudentDetails(String name, Double mark, Integer regNo) {
		super();
		this.name = name;
		this.mark = mark;
		this.regNo = regNo;

	}

}

public class CustomFunctionalInterface {

	public static void main(String[] args) {
		TriFunction<String, Double, Integer, StudentDetails> stu = (n, m, r) -> new StudentDetails(n, m, r);
		StudentDetails s1 = stu.apply("Ram", 92d, 51234);
		StudentDetails s2 = stu.apply("Lakshman", 97d, 51235);
		StudentDetails s3 = stu.apply("David", 82d, 51236);
		
		System.out.println("Name: " +s1.name+ " Mark: " +s1.mark+ " Reg no: " +s1.regNo);
		System.out.println("Name: " +s2.name+ " Mark: " +s2.mark+ " Reg no: " +s2.regNo);
		System.out.println("Name: " +s3.name+ " Mark: " +s3.mark+ " Reg no: " +s3.regNo);
		
		
	}
}
