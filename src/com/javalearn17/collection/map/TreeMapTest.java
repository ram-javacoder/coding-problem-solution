package com.javalearn17.collection.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(24, "david");
		map.put(26, "Ram");
		map.put(27, "Ram");
		map.put(27, "Raj");
		map.put(24, null);
		map.put(28, null);
		// map.put(null, "John"); Null key not allowed in Map else we will get
		// NullPointerException

		System.out.println("HashCode of object :" + map.hashCode());
		System.out.println("Entry sets :" + map);

	}
}
