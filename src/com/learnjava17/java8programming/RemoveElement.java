package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {

	public static void main(String[] args) {

		Integer val = 2;

		List<Integer> num = Arrays.asList(0, 1, 2, 2, 3, 0, 4, 2);

		long count = num.stream().filter(n -> n != val).count();
		List<Integer> removeEle = num.stream().filter(n -> n != val).collect(Collectors.toList());

		System.out.println("Input :" +num+" val = " +val);
		System.out.println("Output :" + count + ", nums = " + removeEle);

	}

}
