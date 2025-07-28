package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise2 {

	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		name.add("Ram");
		name.add(" ");
		name.add("Mohan");
		name.add("Lakshman");
		name.add("Poongavanam");
		name.add("Lokesh");
		name.add(" ");

		List<Integer> number = Arrays.asList(1, 3, 4, 1, 2, 5, 4, 7, 9, 2);

		System.out.println("Collections of elements :" + name);
		// How many elements are Blank
		long cout = name.stream().filter(n -> n.isBlank()).count();
		System.out.println("Total blank elements :" + cout);

		// Elements which are more than 3 length
		long leg = name.stream().filter(l -> l.length() > 3).count();
		System.out.println("Elements size which greater than 3 :" + leg);

		long sta = name.stream().filter(s -> s.startsWith("L")).count();
		System.out.println("Total number of Elements start with \"L\" :" + sta);

		System.out.println("Elements which are not blank");
		Stream<String> notEmpty = name.stream().filter(e -> !e.isBlank());
		notEmpty.forEach(System.out::println);

		System.out.println("Distinct elements in Collections :");
		number.stream().distinct().forEach(System.out::println);

	}

}
