package com.javalearn17.collection.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> stu = new TreeMap<Integer, String>();

		TreeMap<Integer, String> stu1 = new TreeMap<Integer, String>();

		TreeMap<Integer, String> stu2 = new TreeMap<Integer, String>();

		TreeMap<Integer, String> stu3 = new TreeMap<Integer, String>();

		stu.put(56, "A");
		stu.put(87, "B");
		stu.put(66, "C");
		stu.put(76, "D");
		stu.put(81, "E");
		stu.put(54, "F");

		stu1.put(56, "A");
		stu1.put(87, "B");
		stu1.put(66, "C");
		stu1.put(76, "D");
		stu1.put(81, "E");
		stu1.put(54, "F");
		stu1.put(80, " ");
		// stu.put(null, "E"); NullPointerException

		stu3.put(78, "G");
		stu3.put(48, "H");
		stu3.put(62, "I");
		stu3.put(92, null);

		System.out.println("Before clearing elements :");
		System.out.println(stu);

		// System.out.println("After clearing elements : ");
		// stu.clear(); //Clear() --> To clear all of the elements from map
		System.out.println(stu.containsValue("e")); // Check whether e contain or not

		// Using entrySet() to get the set view
		System.out.println("Get the set view of element by using entrySet() :");
		System.out.println(stu.entrySet());

		// Using equals()
		System.out.println("Using equals method :");
		System.out.println(stu.equals(stu1));
		System.out.println();

		// Using get method to fetch the value
		System.out.println("Using get method to fetch the value");
		System.out.println(stu.get(81));
		System.out.println(stu1.get(80)); // IT will return null

		// Generate hashCode number using hashCode()
		System.out.println("Generating hashcode number");
		System.out.println(stu.hashCode());
		System.out.println(stu1.hashCode());
		int h1 = stu.hashCode();
		int h2 = stu1.hashCode();
		System.out.println(h1 == h2); // Both hashcode number equal

		// isEmpty method check whether map is empty or not
		System.out.println("Check whether map is empty or not using isEmpty() method");
		System.out.println(stu.isEmpty());
		System.out.println(stu2.isEmpty());

		// to return a Set view of the keys contained in this map bu using keySet().
		System.out.println("Get set view of the keys in map");
		System.out.println(stu.keySet());

		// putAll(Object)
		System.out.println("After coping specified map to this map");
		stu.putAll(stu3);
		System.out.println(stu);

		// remove(Object) --> to remove the mapping for a key from this map if it is
		// present in the map.
		System.out.println("Removing value with help of key");
		stu1.remove(76);
		System.out.println(stu1);
		stu1.remove(71);

		// Displaying the size of map
		System.out.println("Get the Size of Map");
		System.out.println(stu.size());

		// putIfAbsent
		String r1 = stu3.putIfAbsent(92, "J");

		System.out.println(r1);

		// Traversing through Map using for-each loop

		for (Map.Entry<Integer, String> a : stu.entrySet()) {

			System.out.print(a.getKey() + " : ");
			System.out.println(a.getValue());

		}

	}

}
