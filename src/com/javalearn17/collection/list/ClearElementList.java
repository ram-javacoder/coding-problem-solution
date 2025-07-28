package com.javalearn17.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClearElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> iterator = list.iterator();

		// Iterate over the list and remove the elements from index 2 to index 4
		for (int i = 0; i < 3; i++) {

		System.out.print(iterator.next() + ",");
		}

		iterator.remove();// It will remove latest element --> 3 will be remove

		System.out.println(list);

	}

}
