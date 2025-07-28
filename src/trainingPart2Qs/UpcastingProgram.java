package trainingPart2Qs;

class Animal {

	//String myName = "Ramkumar";
	String name;

	void nature() {

		System.out.println("Animal ");

	}

}

class Fish extends Animal {

	
	
	String color;
	//String myName = "Mohanavel";
	
	void nature() {
		
		System.out.println("Aquatic Animal");
		
	}
	
}

public class UpcastingProgram {

	public static void main(String[] args) {

		Animal obj_fish = new Fish(); // Upcasting
		System.out.println("Animal name :" + (obj_fish.name = "shark"));
		obj_fish.nature();

		Fish fish = new Fish();
		System.out.println("Color :" + (fish.color = "White"));
		// System.out.println(obj_fish.myName);  //Parent Class members will be called

		/*
		 * Through UpCasting we can access all the Members of Parent class and Methods which
		 * are Overridden in Subclass
		 */

		
	}

}
