package com.ty.learnjava17.ArrayPrograms;

public class RangeCheckMethod2 {

	public static void main(String[] args) {

		int number = 15;
		int minRange = 10;
		int maxRange = 20;

		if (isWithinRange(number, minRange, maxRange)) {
			System.out.println(number + " is within the range of " + minRange + " and " + maxRange);
		} else {
			System.out.println(number + " is NOT within the range of " + minRange + " and " + maxRange);
		}
	}

	public static boolean isWithinRange(int number, int min, int max) {
		return number >= min && number <= max;
	}

}
