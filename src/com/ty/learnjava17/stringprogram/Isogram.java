package com.ty.learnjava17.stringprogram;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Isogram {

	public static void main(String[] args) {

		String str = "Machine";
		String low = str.toLowerCase();
		char ch[] = low.toCharArray();
		boolean flag = false;

		for (int i = 0; i < ch.length; i++) {

			for (int j = i+1; j <=ch.length - 1; j++) {

				if (ch[i] == ch[j]) {

					flag = true;
					break;
				}
			}
		}

		if (flag == false) {

			System.out.println("The String '" + str + "' is Isogram");
		} else {

			System.out.println("The String '" + str + "' is not Isogram");
		}

	}

}

/*
Input: Machine
Output: True
Explanation: “Machine” does not have any character repeating, it is an Isogram


The String 'Machine' is Isogram


*/