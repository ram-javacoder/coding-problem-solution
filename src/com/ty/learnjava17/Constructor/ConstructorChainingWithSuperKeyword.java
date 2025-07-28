package com.ty.learnjava17.Constructor;

//Superclass
class Vehicle {
 private String brand;
 private int year;

 // Constructor with parameters
 public Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
     System.out.println("Vehicle constructor: " + brand + ", Year: " + year);
 }

 // Default constructor
 public Vehicle() {
     this("Unknown", 0); // Chaining to parameterized constructor
     System.out.println("Vehicle default constructor called");
 }

 // Getters (for demonstration)
 public String getBrand() {
     return brand;
 }

 public int getYear() {
     return year;
 }
}

//Subclass
class Car_ extends Vehicle {
 private String model;
 private int doors;

 // Constructor chaining with super
 public Car_(String brand, int year, String model, int doors) {
     super(brand, year); // Call superclass constructor
     this.model = model;
     this.doors = doors;
     System.out.println("Car constructor: " + model + ", Doors: " + doors);
 }

 // Constructor chaining with super (default values)
 public Car_(String model) {
     super(); // Call superclass default constructor
     this.model = model;
     this.doors = 4; // Default number of doors
     System.out.println("Car constructor with model only: " + model);
 }

 // Display method to show all details
 public void displayDetails() {
     System.out.println("Brand: " + getBrand() + ", Year: " + getYear() + 
                        ", Model: " + model + ", Doors: " + doors);
 }
}


public class ConstructorChainingWithSuperKeyword {


	public static void main(String[] args) {
	
		 // Test Case 1: Using full constructor
	     System.out.println("Test Case 1: Full Constructor");
	     Car_ car1 = new Car_("Toyota", 2020, "Camry", 4);
	     car1.displayDetails();

	     System.out.println("\nTest Case 2: Model-only Constructor");
	     Car_ car2 = new Car_("Civic");
	     car2.displayDetails();
		
	}
}
