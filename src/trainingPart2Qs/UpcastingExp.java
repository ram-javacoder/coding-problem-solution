package trainingPart2Qs;

class AnimalSound {
	public void makeSound() {
		System.out.println("Animal sound");
	}
}

class DogSound extends AnimalSound {

	public void makeSound() {
		System.out.println("Dog sound");
	}
}

class CatSound extends AnimalSound {

	public void makeSound() {
		System.out.println("Cat sound");
	}

}

public class UpcastingExp {
	public static void main(String[] args) {
		// Create a Dog object
		DogSound dog = new DogSound();

		// Create a Cat Object
		CatSound cat = new CatSound();

		// Upcast the Dog object to an Animal reference
		AnimalSound animal = dog;

		// Upcast the Cat object to an Animal reference
		AnimalSound animalCat = cat;
		// AnimalSound animal=cat;

		// Call the makeSound() method on the Animal reference
		animal.makeSound();
		animalCat.makeSound();

	}
}