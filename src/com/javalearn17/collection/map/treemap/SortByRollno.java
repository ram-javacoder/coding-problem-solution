package com.javalearn17.collection.map.treemap;

import java.util.Comparator;

public class SortByRollno implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

//		return o2.getRollno().compareTo(o1.getRollno());
		return o2.getRollno() - o1.getRollno();
	}

}
