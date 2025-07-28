package com.javalearn17.enumeration;

import java.util.EnumMap;

public class EnumMapEx {

	enum Size {

		SMALL, MEDIUM, LARGE, EXTRALARGE
	}

	public static void main(String[] args) {

		EnumMap<Size, Integer> enumMap = new EnumMap<EnumMapEx.Size, Integer>(Size.class);
		enumMap.put(Size.SMALL, 28);
		enumMap.put(Size.MEDIUM, 32);

		EnumMap<Size, Integer> enumMap2 = new EnumMap<EnumMapEx.Size, Integer>(Size.class);
		enumMap2.putAll(enumMap);
		enumMap2.put(Size.LARGE, 43);

		System.out.println(enumMap);
		System.out.println(enumMap2);

		System.out.println("KEY / VALUE : " + enumMap2.entrySet());
		System.out.println("Set of Keys : " + enumMap.keySet());
		System.out.println("Set of values : " + enumMap2.values());
		System.out.println("Value of Specified key : " + enumMap.get(Size.MEDIUM));

	}

}
