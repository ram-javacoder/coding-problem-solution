package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class ConvertIntArrtoStringArr {

	public static void main(String[] args) {

		int num[] = { 256, 257, 289, 256, 257, 300, 300, 322 };

		String strArray[] = Arrays.toString(num).split(", ");

		System.out.println(Arrays.toString(strArray));

	}

}
