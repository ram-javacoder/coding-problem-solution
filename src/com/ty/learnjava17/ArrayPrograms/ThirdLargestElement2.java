package com.ty.learnjava17.ArrayPrograms;

public class ThirdLargestElement2 {

	// Find ThirdLargest Elements
	public static void main(String[] args) {

		int arr[] = { -123, -123, 123, 123, 123, 99, -123, 0, -99, 12, 4, -2, 99, 99, 67, 67,123 };

		int max = 0;
		int secondMax = 0;
		int thirdMax = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			} else if (secondMax < arr[i] && max > arr[i]) {
				thirdMax = secondMax;
				secondMax = arr[i];
			} else if (thirdMax < arr[i] && secondMax > arr[i])

			{

				thirdMax = arr[i];
			}
		}

		System.out.println("First Largest Elements :" + max);
		System.out.println("Second Largest Element :" + secondMax);
		System.out.println("Third Largest Element :" + thirdMax);

	}

}
