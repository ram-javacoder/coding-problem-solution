package com.javalearn17.collection.hashtable;

import java.util.Hashtable;

public class PrintValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();

		hashtable.put("Lokesh", 2);
		hashtable.put("Ram", 3);
		hashtable.put("Mohan", 1);
//		hashtable.put("Mohan", null); --> NullPointerException
//		hashtable.put(null, 4); -->NullPointerException
		hashtable.put("Mohan", 3);
		hashtable.put("Mohan", 2);
		hashtable.put("Lokesh", 8);
		System.out.println(hashtable);
		
	}

}
