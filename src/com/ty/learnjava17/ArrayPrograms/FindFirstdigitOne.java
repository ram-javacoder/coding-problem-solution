package com.ty.learnjava17.ArrayPrograms;

public class FindFirstdigitOne {

	public static void main(String[] args) {

//		int n=23;
//		String s=Integer.toString(n);
//		System.out.println(s.substring(0,1));

		int arr[] = { 13, 22, 17, 1, 77, 11, 123, 21, 141 };
		System.out.println("Elements which contain first digit one");
		for (int i = 0; i < arr.length; i++) {

			int firstDigit = 0;
			firstDigit = Integer.parseInt(Integer.toString(arr[i]).substring(0, 1));
			if (firstDigit == 1) {

				System.out.print(arr[i] + " ");
			}

		}

	}

}
