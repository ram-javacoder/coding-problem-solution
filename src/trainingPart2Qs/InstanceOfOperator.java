package trainingPart2Qs;

//Superclass
class AnimalSuperClass {
	public void makeSound() {
		System.out.println("Some sound");
	}
}

//Subclass
class DogSupclass extends AnimalSuperClass {
	public void bark() {
		System.out.println("Woof!");
	}
}

public class InstanceOfOperator {
	public static void main(String[] args) {
		// Upcasting - Creating an instance of subclass and referring it by a superclass
		// reference
		AnimalSuperClass animal = new DogSupclass();

		// Downcasting - Converting a superclass reference back to a subclass reference
		if (animal instanceof DogSupclass) {
			DogSupclass dog = (DogSupclass) animal; // Explicit downcasting
			dog.bark(); // Accessing subclass method
		} else {
			System.out.println("Not a Dog instance");
		}

		// Trying to downcast without checking can lead to runtime exceptions
		// Un-commenting the below line will throw a ClassCastException since animal is
		// not actually a Cat
		// Cat cat = (Cat) animal;
	}
}
