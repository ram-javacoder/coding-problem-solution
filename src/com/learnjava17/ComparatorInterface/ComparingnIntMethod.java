package com.learnjava17.ComparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingnIntMethod {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("Ram", "Mohanavel", "Lakshmanakumar", "Poongavanam", "Lokesh");
		
		// Way-1
		Comparator<String> lengthComparator = Comparator.comparingInt(String :: length); // or
		name.sort(lengthComparator);
		
		// Way-2
		// name.sort(Comparator.comparingInt(l -> l.length()));
		
		//Way -3
		
		//Collections.sort(name,lengthComparator);
		
		System.out.println("Name sorted by length in Ascending order :" + name);

	}

}
