package com.learnjava17.ComparableInterface;

import java.util.Arrays;
import java.util.Collections;

public class EmployeeOperation {

	public static void main(String[] args) {

		Employee arr[] = new Employee[4];

		arr[0] = new Employee(1, "Ram", 28, 32000);
		arr[1] = new Employee(2, "Mohan", 38, 52000);
		arr[2] = new Employee(3, "Lokesh", 26, 35000);
		arr[3] = new Employee(4, "Lakshman", 24, 43000);
	
	for (Employee employee : arr) {
		
		System.out.println(employee);
	}
	
	System.out.println("***************************************************");
	Arrays.sort(arr);
	
	for (Employee employee : arr) {
		
		System.out.println(employee);
	}
	
	}

}
