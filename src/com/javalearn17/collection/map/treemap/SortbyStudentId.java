package com.javalearn17.collection.map.treemap;

import java.util.Comparator;

public class SortbyStudentId implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getId()-o1.getId();
	}

}
