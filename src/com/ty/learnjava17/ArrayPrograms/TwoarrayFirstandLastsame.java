package com.ty.learnjava17.ArrayPrograms;

/*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */

public class TwoarrayFirstandLastsame {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 6, 5, 2, 3 };
		int arr2[] = { 3, 8, 5, 2, 6, 3 };
		int i = 0;

		if ((arr1[i] == arr2[i]) || (arr1[arr1.length - 1] == arr2[arr2.length - 1])) {

			System.out.println("YES! it is true");
		} else {

			System.out.println("NO! It is not true");
		}

	}

}
