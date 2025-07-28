package trainingPart2Qs;

class Animalclass {

}

class Dogclass extends Animalclass {

}

class Lion extends Animalclass {

}

public class ClassCastExceptionPro {

	public static void main(String[] args) {

		try {
			Animalclass animalOne = new Dogclass(); // At runtime the instance is dog
			Dogclass bruno = (Dogclass) animalOne; // Downcasting

			Animalclass animalTwo = new Lion(); // At runtime the instance is animal
			Dogclass tommy = (Dogclass) animalTwo; // Downcasting
		} catch (ClassCastException e) {
			System.err.println("ClassCastException caught!");
			e.printStackTrace();
		}

	}

}