package com.javalearn17.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Exercise1 {

	public static void main(String[] args) {
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		name.put(1, "Ram");
		name.put(2, "Mohan");
		name.put(3, "Lokesh");
		name.put(4, "Poongavanam");
		name.put(5, "Lakshman");

		name.put(null, "David");
		name.put(null, "Johnson");
		name.put(null, "zderson");
		name.put(6, null);
		name.put(7, null);
		// name.put(2, "Anderson"); //If we add duplicate key it will replace by new key
		System.out.println(name + " ");
		// Displaying all keys
		System.out.println("Getting all keys :" + name.keySet());
		// Displaying all values
		System.out.println("Getting all values :" + name.values());
		// Getting particular value with help of value
		System.out.println("Getting particular value only :" + name.get(2));
		// Check particular key contain or not
		System.out.println(name.containsKey(4));
		
		
		System.out.println(name.containsValue("Poongavanam"));
		System.out.println(name);
	}

}
