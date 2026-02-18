package com.javalearn17.DataStructureAndAlgorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 64, 25, 12, 22, 11 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));

		selectionSort(arr);

		System.out.println("After Sorting : " + Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {

					minIndex = j;

				}
			}

			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}

	}
}

// 1. I will prefer Selection Sort when I have a small dataset and minimizing memory usage is important because it uses O(1) space.
/*
 * 2. Selection Sort is a simple comparison-based sorting algorithm. It divides
 * the array into two parts: the sorted part at the beginning and the unsorted
 * part at the end. It repeatedly picks the smallest element from the unsorted
 * part and places it at the beginning."
 */
/*
 * 3. In selectionSort method:
 * 
 * I use a loop to go through each element.
 * 
 * For each position i, I assume it’s the minimum (minIndex = i).
 * 
 * I run an inner loop from i+1 to the end of the array:
 * 
 * If I find any smaller element, I update minIndex.
 * 
 * After the inner loop, I swap the smallest element (arr[minIndex]) with the
 * current element (arr[i]).
 */