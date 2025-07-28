package com.javalearn17.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CuncurrentModificationException {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println("Elements present in List : " +fruits);
		
		try {
			
			Iterator<String> itr = fruits.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				fruits.add("Graphs"); //collection is modifying while being iterating 
 			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}


	}

}
