package trainingPart2Qs;

class Animals {
	public void makeSound() {
		System.out.println("Some sound");
	}
}

class Dog extends Animals {
	public void bark() {
		System.out.println("Woof!");
	}
}

public class DowncastingExp {

	public static void main(String[] args) {

		// Upcasting - Creating an instance of subclass and referring it by a superclass
		// reference
		Animals animal = new Dog();

		// Downcasting - Converting a superclass reference back to a subclass reference

		Dog dog = (Dog) animal; // Explicit downcasting
		dog.bark(); // Accessing subclass method
		
	}

}
