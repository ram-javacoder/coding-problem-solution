package com.javalearn17.collection.concurrentModicationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//Example of FailFast and Concurrent Modification Exception 

public class FailFastAndFailSafe {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");

		CopyOnWriteArrayList<String> flowers = new CopyOnWriteArrayList<>();
		flowers.add("Sunflower");
		flowers.add("Jasmin");
		flowers.add("Rose");
		flowers.add("Marigold");

		try {
			Iterator<String> itr = fruits.iterator();
			while (itr.hasNext()) {

				System.out.println(itr.next());
				fruits.add("Graps"); // Concurrent Modification Exception
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		Iterator<String> itr_1 = flowers.iterator();
		try {

			while (itr_1.hasNext()) {

				System.out.println(itr_1.next());
				
				flowers.add("Lily");
				
			}
		
			System.out.println(flowers);
		} catch (Exception e) {
			e.printStackTrace();

		}
		

	}
}
