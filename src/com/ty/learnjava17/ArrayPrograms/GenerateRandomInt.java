package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomInt {

	public static void main(String[] args) {

		int size = 15;
		List<Integer> result = generateRandomInteger(size);
		System.out.println("Size : " + size);
		System.out.println("List of Numbers : ");
		System.out.println(result);
	}

	private static List<Integer> generateRandomInteger(int size) {

		if (size < 10 || size > 50) {

			throw new IllegalArgumentException("size must be between 50 and 100.");
		}

		List<Integer> randomIntegers = new ArrayList<Integer>();
		Random random = new Random();

		for (int i = 0; i < size; i++) {

			int num = random.nextInt(100) + 1;
			randomIntegers.add(num);
		}

		return randomIntegers;
	}

}
