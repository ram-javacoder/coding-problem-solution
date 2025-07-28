package com.learnjava17.ComparatorInterface.comparatorreverse;

import java.util.Comparator;

public class SortByroll implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return Integer.compare(o2.getRollno(), o1.getRollno());
	}

}
