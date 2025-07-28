package com.javalearn17.collection.list;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseObject {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println("Before reversing :" +obj);
		Collections.reverse(obj);
		System.out.println("After reversing :" +obj);
		
	}
}
