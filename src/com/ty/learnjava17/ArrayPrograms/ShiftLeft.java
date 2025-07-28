package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class ShiftLeft {

	public static void main(String[] args) {

		int arr[] = { 6, 2, 5, 3 };
		int firstElement=arr[0];
		for (int i = 0; i < arr.length-1; i++) {

		
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = firstElement;

		System.out.println(Arrays.toString(arr));
	}

}
