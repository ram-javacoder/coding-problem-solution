package com.ty.learnjava17.ArrayPrograms;

public class ThirdLargestElement {

	// Finding Third Largest Elements in an Array
	public static void main(String[] args) {

		int arr[] = {123,123, 0, -99, 12, 4, -2, 99, 99, 67};

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (secondMax < arr[i] && max > arr[i]) {
				secondMax = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (thirdMax < arr[i] && secondMax > arr[i]) {
				thirdMax = arr[i];
			}
		}

		System.out.println("First Maximum Element is :" + max);
		System.out.println("Second Maximum Element is :" + secondMax);
		System.out.println("Third Maximum Element is :" + thirdMax);

	}

}

/*
 * First Maximum Element is :18 Second Maximum Element is :16 Third Maximum
 * Element is :12
 */