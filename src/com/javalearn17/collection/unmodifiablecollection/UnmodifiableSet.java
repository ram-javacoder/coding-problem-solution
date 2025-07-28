package com.javalearn17.collection.unmodifiablecollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSet {

	public static void main(String[] argv) throws Exception {

		try {

			// creating object of HashSet<Character>
			Set<Character> set = new HashSet<Character>();

			// populate the table
			set.add('X');
			set.add('Y');

			// make the set unmodifiable
			Set<Character> immutableSet = Collections.unmodifiableSet(set);

			// printing unmodifiableSet
			System.out.println("unmodifiable Set: " + immutableSet);

			System.out.println("\nTrying to modify" + " the unmodifiable set");
			immutableSet.add('Z'); //UnSupportedOperationException
		}

		catch (UnsupportedOperationException e) {
			System.out.println("Exception thrown : " + e);
		}
	}

}
