package com.javalearn17.stringbuilder;

public class EnsureCapasityMethod {

	public static void main(String[] args) {

		StringBuilder capacity = new StringBuilder();
		int defaultCapacity = capacity.capacity();

		System.out.println("Defalut Capacity : " + defaultCapacity);

		capacity.ensureCapacity(18);
		System.out.println("After setting Ensure Capacity :" + capacity.capacity());

		StringBuilder capacity2 = new StringBuilder(" ");
		int cap2 = capacity2.capacity();
		capacity2.ensureCapacity(65);
		System.out.println(cap2);
		System.out.println(capacity2.capacity());

		
		
		
	}

}
