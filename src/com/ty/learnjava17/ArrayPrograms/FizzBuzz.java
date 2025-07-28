package com.ty.learnjava17.ArrayPrograms;
/*
Based on a traditional English children's game
Print the numbers 1..100
For multiples of 3, print "Fizz" instead of the number
For multiples of 5, print "Buzz" instead of the number
For multiples of 3 and 5, print "FizzBuzz" instead of the number
Here: fill an array instead of printing + some other complications
*/

import java.util.Arrays;

public class FizzBuzz {

	public static void main(String[] args) {

		String arr[] = new String[50];

		for (int i =1; i < arr.length; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {

				arr[i] = "FizzBuzz";
				System.out.println(i + " : " + arr[i]);
			} else if (i % 3 == 0) {

				arr[i] = "Fizz";
				System.out.println(i + " : " + arr[i]);
			} else {

				arr[i] = String.valueOf(i);
				System.out.println(i + " : " + arr[i]);
			}

		}

	}
}
