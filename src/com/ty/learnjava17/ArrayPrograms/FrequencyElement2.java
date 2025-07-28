package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class FrequencyElement2 {

	public static void main(String[] args) {

		// Declare and initialize the array elements
		int[] array = { 2, 3, 5,5, 4, 3, 1, 3, 2, 1, 1};

		// sorting an array
		Arrays.sort(array);

		System.out.println(Arrays.toString(array));
		// declaring the variables
		int i, j, frequency;
		System.out.println("These elements are repeated along with its frequency-");

		// loop for logic implementation
		for (i = 0; i < array.length; i++) {
			frequency = 1;
			for (j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {
					frequency++;
				} else {
					break;
				}
			} 
			i = j - 1;
			if (frequency >= 1 ) {

				// printing the output
				System.out.println(array[i] + " --> " + frequency);
			}
		}
	}

}
