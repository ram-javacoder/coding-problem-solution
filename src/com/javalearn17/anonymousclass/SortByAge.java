package com.javalearn17.anonymousclass;

import java.util.Comparator;

public class SortByAge implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {

		return o1.getStudentAge() - o2.getStudentAge();
	}

}
