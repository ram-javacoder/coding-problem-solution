package com.ty.learnjava17.objectclass;

import java.util.Objects;

public class EqualsMethod2 {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = null;
		Object obj3 = new Object();

		boolean isEqual1 = Objects.equals(obj1, obj2); // false
		boolean isEqual2 = Objects.equals(obj1, obj3); // false (depends on the implementation of equals() in Object class)
		boolean isEqual3 = Objects.equals(null, null); // true

	}

}
