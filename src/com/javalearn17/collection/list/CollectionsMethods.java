package com.javalearn17.collection.list;

import java.util.ArrayList;
import java.util.List;

public class CollectionsMethods {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		// add Method
		
		fruits.add("Mango");fruits.add("Mango");
		fruits.add("Banana");
		System.out.println(fruits);
		List<String> addfruitsCollection = new ArrayList<String>();
		addfruitsCollection.add("Apple");
		addfruitsCollection.add("Graphs");
		// addAll method
		addfruitsCollection.addAll(fruits);
		System.out.println(addfruitsCollection);
		// add(index,object)
		fruits.add(1, "Pine Apple");
		System.out.println("After adding new Object at 1 index position : " + fruits);
		//add(index,collection)
		addfruitsCollection.addAll(1, fruits);
		System.out.println("After adding new collection at 1 index position : " + addfruitsCollection);
		
		//remove()
		fruits.remove("Mango");
		System.out.println("After removing  ' Mango ' from fruits list : " +fruits);
		//removeAll(collection)
		
		System.out.println("Before removing all occurance of collection :" +addfruitsCollection);
		addfruitsCollection.removeAll(fruits);
		System.out.println("After removing all occurance of collection : " +addfruitsCollection);
		
		
	}
}
