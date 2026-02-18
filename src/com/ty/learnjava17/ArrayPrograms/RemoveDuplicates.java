package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> listWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1);
		List<Integer> listWithoutDuplicates = new ArrayList<Integer>(new LinkedHashSet<Integer>(listWithDuplicates));
		System.out.println(listWithoutDuplicates);

	}
}
