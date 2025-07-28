package com.javalearn17.anonymousclass;

import java.util.Comparator;

public class SortById implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {

		return Integer.compare(o1.getStudentID(), o2.getStudentID());
	}

}
