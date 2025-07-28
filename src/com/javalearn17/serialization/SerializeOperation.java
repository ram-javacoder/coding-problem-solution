package com.javalearn17.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeOperation {

	public static void main(String[] args) throws IOException {

		Employee e = new Employee(111, "Ram", 340000, "ram5595");
		Employee e1 = new Employee(112, "Mohanavel", 440000, "mohan1970");
		Employee e2 = new Employee(113, "Lakshmanakumar", 360000, "lakshman5595");

		String filename = "D:\\Serialization File\\employee.txt";

		// Serialization
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream object = new ObjectOutputStream(file);
			object.writeObject(e);
			object.writeObject(e1);
			object.writeObject(e2);
			object.close();
			file.close();
			System.out.println("Object has been serialized");

		}

		catch (FileNotFoundException f) {

			f.printStackTrace();

		}

	}
}
