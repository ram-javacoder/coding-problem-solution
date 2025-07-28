package com.javalearn17.collection.unmodifiablecollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Unmodifiablelist {

	public static void main(String[] args) {

		try {

			List<Character> list = new ArrayList<Character>();
			list.add('R');
			list.add('A');
			list.add('M');

			System.out.println("Initial list :" + list);

			Collection<Character> immutabilist = Collections.unmodifiableCollection(list);

			 immutabilist .add('K'); //UnsupportedOperationException
			
		}

		catch (UnsupportedOperationException e) {

			System.out.println("Exception thrown :" + e);
		}
	}

}
