package com.javalearn17.collection.programming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseElement {

	public static void main(String[] args) {

		List<Integer> ele = new ArrayList<Integer>();
		Set<String> name = new HashSet<String>();
		ele.add(1);
		ele.add(2);
		ele.add(3);
		ele.add(4);
		ele.add(5);
		System.out.println("Before reverse elements :" + ele);
		Collections.reverse(ele); // reverse method
		System.out.println("After reversing elements :");
		for (Integer integer : ele) {
			System.out.println(integer + " ");
		}
		

		name.add("Java");
		name.add("SQL");
		name.add("Python");
		
		List<String> setReverseUsingList = new ArrayList<String>(name);
		Collections.reverse(setReverseUsingList);
		System.out.println("Reversing set element by converting into List :" +setReverseUsingList);
		
		
		
	}

}
