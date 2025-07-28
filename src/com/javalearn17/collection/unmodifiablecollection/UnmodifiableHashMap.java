package com.javalearn17.collection.unmodifiablecollection;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class UnmodifiableHashMap {

	public static void main(String[] args) {

		try {

			// creating object of SortedMap<String, String>
			SortedMap<String, String> map = new TreeMap<String, String>();

			// populate the map
			map.put("First", "10");
			map.put("Second", "20");
			map.put("Third", "30");

			// make the map unmodifiable
			Map<String, String> unmodsortmap = Collections.unmodifiableSortedMap(map);

			// printing unmodifiable map
			System.out.println("unmodifiableSortedMap value: " + map);

			System.out.println("\nTrying to modify" + " the unmodifiable SortedMap");
			unmodsortmap.put("Fourth", "40");
		}

		catch (UnsupportedOperationException e) {
			System.out.println("Exception thrown : " + e);
		}

	}

}
