package com.javalearn17.collection.programming;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindSecondMaximumElement {

	public static void main(String[] args) {

		List<Integer> findSecondMax = Arrays.asList(20, 10, 45, 50,45, 32,50,-50,65,65,63);
		Integer result = findingSecondMax(findSecondMax);
		System.out.println("List of elements :" +findSecondMax);
		System.out.println("Second Largest Element :" + result);
	}

	private static Integer findingSecondMax(List<Integer> findSecondMax) {
		int max = findSecondMax.get(0), secondMax = findSecondMax.get(1);

		for (int i = 0; i < findSecondMax.size(); i++) {

			if (findSecondMax.get(i) > max) {
				secondMax = max;
				max = findSecondMax.get(i);
			} else if (secondMax < findSecondMax.get(i) && max > findSecondMax.get(i)) {

				secondMax = findSecondMax.get(i);

			}

		}

		return secondMax;
	}

}
