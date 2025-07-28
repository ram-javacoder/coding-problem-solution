package com.javalearn17.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Dog_fieldReflection {

	public String type;

	private String color; // private field

}

public class FieldsReflection {

	public static void main(String[] args) {

		try {
			Dog_fieldReflection d = new Dog_fieldReflection();

			Class c = d.getClass();

			Field f1 = c.getField("type");
			f1.set(d, "Labrador");

			Field f2 = c.getDeclaredField("color"); // getting private field
			f2.setAccessible(true);
			f2.set(d, "Black");

			String getFieldVal = (String) f1.get(d);

			String getFieldVal2 = (String) f2.get(d);

			System.out.println("Value of field : " + getFieldVal);

			System.out.println("Value of private field : " + getFieldVal2);

			System.out.println("name of field : " + f1.getName());

			System.out.println("name of private field : " + f2.getName());

			int mod = f1.getModifiers();

			int mod2 = f2.getModifiers();

			System.out.println("Modifier of field (Converting to String) : " + Modifier.toString(mod));

			System.out.println("Modifier of private field :" + Modifier.toString(mod2));

			System.out.println(" ");

		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}
}
