package com.ty.learnjava17.relationship;

//This program is example of Aggregation

class Engine {

	private String power;
	private String cc;
	private int strock;
	private String type;

	public Engine() {
		super();
	}

	public Engine(String power, String cc, int strock, String type) {
		super();
		this.power = power;
		this.cc = cc;
		this.strock = strock;
		this.type = type;
	}

	public void detailsOfEngine() {

		System.out.println("Detais of engine :");
		System.out.println("Power :" + power);
		System.out.println("cc :" + cc);
		System.out.println("Strock :" + strock);
		System.out.println("Type :" + type);
		System.out.println(" ");

	}
}

class Car {

	private String name;
	private String color;
	private double price;

	private Engine e;

	public Car() {
		super();
		this.e = new Engine(); // Case 1: Engine created inside Car (Composition)

	}

	Car(String name, String color, double price, Engine e) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.e = e; // Case 2: Engine passed from outside (Aggregation)

	}

	public void detailsOfCar() {

		System.out.println("Details of Car :");
		System.out.println("Name :" + name);
		System.out.println("Color :" + color);
		System.out.println("Price : " + price);
		this.e.detailsOfEngine();
		System.out.println(" ");

	}

}

public class CarEngineRelation {

	public static void main(String[] args) {

		Engine e1 = new Engine("1200", "800cc", 4, "Diesel");
		Car c = new Car("BMW", "Black", 500000, e1);
		c.detailsOfCar();
		Engine e2 = new Engine("950", "600cc", 4, "Diesel");
		Car c1 = new Car("Maruthi Swift", "Blue", 300000, e2);
		c1.detailsOfCar();

	}

}

//Default constructor (Car()) → creates a new Engine → Composition (Car owns the Engine fully).
//Parameterized constructor (Car(String, String, double, Engine e)) → takes an Engine from outside → Aggregation (Engine can exist independently of Car).
