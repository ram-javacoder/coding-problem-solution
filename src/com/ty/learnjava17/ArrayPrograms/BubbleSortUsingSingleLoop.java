package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class BubbleSortUsingSingleLoop {

	public static void main(String[] args) {

		String str = "RAMKUMAR";
		char arr[] = str.toCharArray();

		System.out.println("String before sorting :" + str);
		for (int i = 0; i < str.length()-1; i++) {

			char temp = 0;
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}

		}
		System.out.println("String after sorting :" + String.valueOf(arr));
		//System.out.println("String after sorting :" + new String(arr));
	}

}
