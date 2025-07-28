package com.ty.learnjava17.staticmembers;

class Department {

	public static int noOfworkers = 0;
	public String name;

	public Department(String name) {
		super();
		this.name = name;
		noOfworkers++;
	}

}

public class StaticVariableMultiobject {

	public static void main(String[] args) {

		Department obj1 = new Department("Ramkumar");
		System.out.println("Worker name :" +obj1.name);
		System.out.println(obj1.noOfworkers);
		Department obj2 = new Department("Mohanavel");
		System.out.println("Worker name :" +obj2.name);
		System.out.println(obj1.noOfworkers);
		Department obj3 = new Department("Lokesh");
		System.out.println("Worker name :" +obj3.name);
		System.out.println(obj1.noOfworkers);
		Department obj4 = new Department("Lakshman");
		System.out.println("Worker name :" +obj4.name);
		System.out.println(obj1.noOfworkers);

	}

}
