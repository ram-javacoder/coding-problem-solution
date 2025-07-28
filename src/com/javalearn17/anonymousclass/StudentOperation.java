package com.javalearn17.anonymousclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.javalearn17.collection.map.treemap.Student;

public class StudentOperation {

	public static void main(String[] args) {

		List<Students> stu = new ArrayList<Students>();
		stu.add(new Students(113, 23, 87, 82, 84));
		stu.add(new Students(154, 24, 89, 76, 89));
		stu.add(new Students(123, 25, 76, 87, 80));
		stu.add(new Students(129, 24, 81, 79, 91));
		stu.add(new Students(147, 24, 80, 90, 71));
		stu.add(new Students(167, 25, 78, 80, 84));
		stu.add(new Students(189, 25, 82, 85, 79));
		stu.add(new Students(117, 22, 87, 89, 91));
		stu.add(new Students(137, 23, 78, 79, 90));
		stu.add(new Students(111, 22, 65, 82, 80));
		stu.add(new Students(144, 24, 67, 87, 88));
		stu.add(new Students(108, 24, 71, 79, 96));

		System.out.println("Current Student data");
		System.out.println("====================");
		for (Students students : stu) {

			System.out.println(students);
		}

		System.out.println("\nReverse Sorting Student data based on Id using Lamda Experience");
		System.out.println("===========================================================");

		Comparator<Students> comparator = new SortByAge().reversed();
		stu.stream().sorted(comparator).forEach(e -> System.out.println(e));

		System.out.println("\nSort the list based on Student Age using Concrete class implementation for sorting");
		System.out.println("===================================================================");
		Comparator<Students> sortBasedOnAge = new SortByAge();
		stu.sort(sortBasedOnAge);
		for (Students students : stu) {

			System.out.println(students);
		}

		System.out.println(
				"\nSorting Decending order based on  Student's Maths mark list using an anonymous inner class");
		System.out.println("=========================================================================");

		Collections.sort(stu, new Comparator<Students>() {

			@Override
			public int compare(Students s1, Students s2) {
				return Integer.compare(s2.getMathsMark(), s1.getMathsMark());
			}

		});

		for (Students students : stu) {
			System.out.println(students);
		}

	}

}
