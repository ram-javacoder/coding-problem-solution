package com.ty.learnjava17.ArrayPrograms;

public class FindSecondSmallest {

	public static void main(String[] args) {

		int arr[] = { -123, 123, 123, 123, 123, 99, -124, 0, -130, 12, 4, -2, -99, 99, 67, 67, -88, -123, -125 };

		int min = 0;
		int secondMin = 0;
		int thirdMin = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {

				secondMin = min;
				min = arr[i];
			}

			else if (arr[i] < secondMin && arr[i] > min) {

				thirdMin = secondMin;
				secondMin = arr[i];

			}

			else if (arr[i] < thirdMin) {

				thirdMin = arr[i];
			}

		}

		System.out.println("First minimum value :" + min);
		System.out.println("Second minimum value :" + secondMin);
		System.out.println("Third minimum value :" + thirdMin);

	}

}
