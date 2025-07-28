package com.learnjava17.java8programming.functionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringLength {

	public static void main(String[] args) {

		List<String> string = Arrays.asList("Ram", "Mohanavel", "Poongavanam", "Lakshman", "Lokesh");
		Function<String, Integer> lengthString = s -> s.length();
		Function<String,String> toLowercase= l-> l.toLowerCase(); 
		System.out.println("List of Strings :" + string);
		System.out.println("Length of each String :");
		int size = string.size() - 1;
		for (String string2 : string) {

			System.out.println("String :" + (string.size() - (size--)) + " Length : " + lengthString.apply(string2));

		}

		System.out.println("\nList of Strings which are greater than 5");
		for (String string2 : string) {
			if(lengthString.apply(string2)>5)
			{
				System.out.println(string2);
				
			}
		}
		
		System.out.println("\nAll String converted into Lowercase ");
		for (String string3 : string) {
			System.out.println(toLowercase.apply(string3));
		}
		
	}
}
