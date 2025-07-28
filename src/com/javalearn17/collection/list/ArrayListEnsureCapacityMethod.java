package com.javalearn17.collection.list;

import java.util.ArrayList;

	public class ArrayListEnsureCapacityMethod {
	
		public static void main(String[] args) {
			
			ArrayList<Integer>ele=new ArrayList<Integer>();
			
			ele.add(1);
			ele.add(2);
			ele.add(3);
			ele.add(6);
			ele.ensureCapacity(10);
			ele.add(4);

			System.out.println(ele);
			System.out.println(ele.size());
			
		}
	}
