package com.javalearn17.collection.map.treemap;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

	public static void main(String[] args) {

		Map<Integer, String> name = new HashMap();
		name.put(1, "Ram");
		name.put(3, "Mohan");
		name.put(5, "Lakshman");
		name.put(2, "Poongavanam");
		name.put(4, "Lokesh");
		name.put(null, "david");   
		name.put(null, "Hi"); //if we adding more than Null key it will replace with new one 

		for (Map.Entry<Integer, String> ele : name.entrySet()) {

			System.out.println("Key :" + ele.getKey() + " Value :" + ele.getValue());

		}

	}

}
