package com.ty.learnjava17.ArrayPrograms;

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */

public class SixfirstorLast {

	public static void main(String[] args) {

		int arr[]= {2,5,7,12,9,6};
		int i=0;
		if (arr[i]== 6 || arr[arr.length-1]==6) {

			System.out.println("YES ! It is true");
		} else {

			System.out.println("No! it is false");
		}
		
		
		
		
	}

}
