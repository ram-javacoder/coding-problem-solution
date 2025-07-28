package com.javalearn17.stringbuilder;

//public StringBuilder insert(int offset, String str);
public class InsertMethod {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Ram is Good boy");
		System.out.println("Before inserting :" + str);
		String strInsert = "and Bad ";
		str.insert(12, strInsert);
		System.out.println("After inserting :" + str);

	}
}
