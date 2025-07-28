package com.javalearn17.datastructure.sorting;

import java.util.Arrays;

public class QuickSorting {

	public static void main(String[] args) {

		int arr[] = { 17, 14, 15, 28, 6, 8, -6, 1, 3, 18 };
		System.out.println("Unsorted Array : " + Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println("Sorted Array : " + Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j < high; j++) {

			if (arr[j] < pivot) {

				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}

/*
 * 1. In quickSort method:
 * 
 * This method takes three parameters: the array, the low index, and the high
 * index.
 * 
 * If low is less than high, I partition the array and find the pivot index
 * (pi).
 * 
 * After partitioning:
 * 
 * Elements left of pi are smaller.
 * 
 * Elements right of pi are greater.
 * 
 * Then I recursively call quickSort on the left and right subarrays.
 */	


/*
 * 2. Step 3 — In partition method:
 * 
 * I choose the last element (arr[high]) as the pivot.
 * 
 * I initialize i = low-1 to track the position where smaller elements should
 * go.
 * 
 * I loop j from low to high-1:
 * 
 * If arr[j] is smaller than pivot, I increment i and swap arr[i] and arr[j].
 * 
 * After the loop:
 * 
 * I swap arr[i+1] with pivot (i.e., arr[high]).
 * 
 * I return i+1, which is the correct position of the pivot.
 */
