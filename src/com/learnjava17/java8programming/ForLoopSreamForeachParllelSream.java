package com.learnjava17.java8programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ForLoopSreamForeachParllelSream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> num = new ArrayList<String>();
		num.add("1");
		num.add("2");
		num.add("3");
		num.add("4");
		num.add("5");

		num.stream().forEach(s -> {
			System.out.println(s);

		});

		
		//ParllelStream()
		System.out.println("Using parallelStream Method");
		num.parallelStream().forEach(s-> {
			System.out.println(s);
		});
		
		
	}

}
