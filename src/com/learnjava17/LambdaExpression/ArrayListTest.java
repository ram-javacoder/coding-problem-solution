package com.learnjava17.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<Integer> name = new ArrayList<Integer>();
		name.add(34);
		name.add(56);
		name.add(63);
		name.add(90);
		name.add(32);
		name.add(87);

		System.out.println("Element present in list :");
		name.forEach(n -> System.out.println(n));   //Lamda Expression with single statement

		System.out.println("Even Numbers :");       //Lamda Expression with block statement
		name.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);

		});

	}

}
