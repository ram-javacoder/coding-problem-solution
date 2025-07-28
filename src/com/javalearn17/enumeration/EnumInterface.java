package com.javalearn17.enumeration;

interface greeting {

	void sayHello();
}

enum Languages implements greeting {

	ENGLISH {

		@Override
		public void sayHello() {

			System.out.println("Hi, Hello!");
		}
	},

	SPANISH {

		@Override
		public void sayHello() {
			System.out.println("Hi, Hola!");

		}

	}

}

public class EnumInterface {

	public static void main(String[] args) {

		Languages.ENGLISH.sayHello();
		
	}
}
