package com.javalearn17.DataStructureAndAlgorithms.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6 };
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}

/*
 * "Insertion Sort is an in-place sorting algorithm, so it has O(1) space complexity."
 * 	O(1) (Constant space)
 * "Insertion Sort has O(n) time complexity in the best case and O(n²) in the average and worst cases."
 */
