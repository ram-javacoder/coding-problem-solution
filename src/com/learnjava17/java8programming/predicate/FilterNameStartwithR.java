package com.learnjava17.java8programming.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterNameStartwithR {

	public static void main(String[] args) {
		
	
	List<String>name=Arrays.asList("Ram","Mohan","Lakshman","rajesh","Pravin","Rahul");
	System.out.println("Names present in the List :" +name);
	Predicate<String>namesStartWithR=r -> r.startsWith("R") || r.startsWith("r");
	System.out.println("Names start with 'R'");
	for (String names : name) {
		
		if(namesStartWithR.test(names)) {
			
			System.out.println(names);
			
		}
	}
	
	
	
	}
	
}
