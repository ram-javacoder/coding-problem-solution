package com.ty.learnjava17.stringprogram;

public class SortStringbasedOnDigit {

	public static void main(String[] args) {
		String input = "is1 thi0s T3est 2a";
		String result = sortStringsbasedOnDigit(input);
		System.out.println("Original String : " + input);
		System.out.println("Output : " + result);

	}

	private static String sortStringsbasedOnDigit(String input) {
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				String digitStr1 = arr[j].replaceAll("[^0-9]", "");
				String digitStr2 = arr[j + 1].replaceAll("[^0-9]", "");

				// Handle cases where the digit string might be empty
				int getDigit1 = digitStr1.isEmpty() ? Integer.MAX_VALUE : Integer.parseInt(digitStr1);
				int getDigit2 = digitStr2.isEmpty() ? Integer.MAX_VALUE : Integer.parseInt(digitStr2);

				if (getDigit1 > getDigit2) {
					String temp = arr[j];
					arr[j] = arr[j + 1];

					arr[j + 1] = temp;

				}

			}
			for (int k = 0; k < arr.length; k++) {
				arr[k] = arr[k].replaceAll("[0-9]", "");
			}

		}

		return String.join(" ", arr);
	}

}
