package com.ty.learnjava17.ArrayPrograms;

public class RangeCheckmethod {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		// Check if the number 3 is in the range 1 to 5
		boolean isInRange = rangeCheck(numbers, 3, 1, 5);

		if (isInRange) {
			System.out.println("The number 3 is in the range 1 to 5");
		} else {
			System.out.println("The number 3 is not in the range 1 to 5");
		}
	}

	public static boolean rangeCheck(int[] numbers, int number, int min, int max) {
		return number >= min && number <= max;
	}

}
