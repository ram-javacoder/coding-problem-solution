package com.ty.learnjava17.oops.superkeyword;

class Animal {
	String name;

	
	Animal(String name) {
		this.name = name;
		System.out.println("Animal Constructor: " + name);
	}
}


class Dog extends Animal {
	String breed;

	
	Dog(String name, String breed) {
		super(name); 
		this.breed = breed;
		System.out.println("Dog Constructor: " + breed);
	}
}

public class ConstructorChainWithSuperKeyword {

	public static void main(String[] args) {
		Dog myDog = new Dog("Buddy", "Golden Retriever");
		
	}

}
