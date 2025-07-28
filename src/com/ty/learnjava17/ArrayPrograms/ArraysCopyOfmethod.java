package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class ArraysCopyOfmethod {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };

		System.out.println("Initial Array's Length :" + arr.length + " elements :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");

		}

		System.out.println("\nOne Array's elements Copy to another Array ");
		int newArray[] = Arrays.copyOf(arr, 5);
		 newArray[3] = 4;
		 newArray[4] = 5;
		System.out.println("New Array's size :" + newArray.length + " elements :" + Arrays.toString(newArray));
	
	}

}
