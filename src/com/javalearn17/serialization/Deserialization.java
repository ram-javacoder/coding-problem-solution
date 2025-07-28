package com.javalearn17.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee object1 = null;
		Employee object2 = null;
		Employee object3 = null;
		
		
		try {
			FileInputStream file = new FileInputStream("D:\\Serialization File\\employee.txt");
			ObjectInputStream object = new ObjectInputStream(file);
			object1 = (Employee) object.readObject();
			object2 = (Employee) object.readObject();
			object3 = (Employee) object.readObject();
			
			object.close();
			file.close();

			System.out.println("Object has been deserialized!...");
			System.out.println("Employee details :");
			System.out.println("Employee Id :" + object1.getId());
			System.out.println("Employee name :" + object1.getName());
			System.out.println("Employee salary :" + object1.getSalary());

			System.out.println("Employee Id :" + object2.getId());
			System.out.println("Employee name :" + object2.getName());
			System.out.println("Employee salary :" + object2.getSalary());

			System.out.println("Employee Id :" + object3.getId());
			System.out.println("Employee name :" + object3.getName());
			System.out.println("Employee salary :" + object3.getSalary());

			
			
		} catch (FileNotFoundException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}

	}
}
