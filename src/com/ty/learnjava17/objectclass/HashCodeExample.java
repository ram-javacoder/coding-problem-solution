package com.ty.learnjava17.objectclass;

public class HashCodeExample {

	public static void main(String[] args) {

		HashCodeExample o1 = new HashCodeExample();
		System.out.println(o1.hashCode());
		System.out.println(o1.hashCode());
		
		System.out.println(o1.toString());
		
		
		HashCodeExample o2 = new HashCodeExample();
		HashCodeExample o3 = o1;
		System.out.println(o2.hashCode());
		System.out.println(o2.toString());
		System.out.println(o3.hashCode());
		System.out.println(o3.toString());

	}

}

/*
 * 41903949 com.ty.learnjava17.objectclass.HashCodeExample@27f674d 1239731077
 * com.ty.learnjava17.objectclass.HashCodeExample@49e4cb85 41903949
 * com.ty.learnjava17.objectclass.HashCodeExample@27f674d
 */
