package com.javalearn17.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Singleton INSTANCE = new Singleton();

	private Singleton() {
		System.out.println("Singleton Instance Created");
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

	// readResolve method to prevent creating a new instance during deserialization
	protected Object readResolve() {
		return INSTANCE;
	}
}

public class SingletonSerialization {

	public static void main(String[] args) {

		try {

			Singleton instance1 = Singleton.getInstance();

			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			out.writeObject(instance1);
			out.close();

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
			Singleton instance2 = (Singleton) in.readObject();
			in.close();

			System.out.println("Instance 1 hashcode: " + instance1.hashCode());
			System.out.println("Instance 2 hashcode: " + instance2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
