package com.ty.learnjava17.ArrayPrograms;

import java.lang.annotation.Target;
import java.util.Arrays;

public class FindFirstLastOccuranceBinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1,3, 4, 2, 2, 2, 2, 7,2, 8, 8 };
		Arrays.sort(arr);
		int target = 2;
		int result1 = firstOccurance(arr, target);
		int result2 = LastOccurance(arr, target);

		System.out.println("First Occurance of " + target + " is :" + result1 + " Index");
		System.out.println("Last Occurance of " + target + " is :" + result2 + " Index");

	}

	private static int firstOccurance(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {	
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				if (mid == 0 || arr[mid - 1] != target) {
					return mid;
				} else {
					high = mid - 1;
				}
			}

			else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		return -1;
	}

	private static int LastOccurance(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				if (mid == arr.length - 1 || arr[mid + 1] != target) {
					return mid;
				} else {
					low = mid + 1;
				}
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;
	}
}
