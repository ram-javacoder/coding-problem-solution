package com.javalearn17.collection.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationMethod {

	//Example program of Hashtable and hasMoreElement() and nextElement()
	public static void main(String[] args) {

		Hashtable<String, Integer> hashtable =new Hashtable<String, Integer>();
		
		hashtable.put("D", 4);
		hashtable.put("B", 2);
		hashtable.put("A", 1);
		hashtable.put("C", 3);
		
		//Using get method
		int intValue=hashtable.get("C");
		System.out.println("Value of C :" +intValue);
		
		Enumeration<String> keys=hashtable.keys();
		while (keys.hasMoreElements()) {
			
			String key=keys.nextElement();
			System.out.println("Keys :" +key+ " : " +hashtable.get(key));
		}
		
		

	}

}
