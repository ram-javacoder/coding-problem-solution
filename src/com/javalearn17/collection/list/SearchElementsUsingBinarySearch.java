package com.javalearn17.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SearchElementsUsingBinarySearch {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		List<Integer> number = Arrays.asList(3, 7, 1, 4, 10, 5);

		Collections.sort(number);

		System.out.println("Original elements present in List : " + number);

		System.out.println("Enter the target element : ");

		int n = sc.nextInt();

		int result = binarySearch(n, number);

		if (result != -1) {

			System.out.println("Element found at " + result + " position");
		} else {

			System.out.println("Element not found !");

		}
	}

	public static int binarySearch(int n, List<Integer> number) {

		int firstEle = 0;
		int lastEle = number.size() - 1;

		while (firstEle <= lastEle) {

			int mid = (firstEle + lastEle) / 2;

			if (number.get(mid) < n) {

				firstEle = mid + 1;
			} else if (number.get(mid) == n) {

				return mid;

			}

			else {

				lastEle = mid - 1;
			}
		}

		return -1;

	}

}
