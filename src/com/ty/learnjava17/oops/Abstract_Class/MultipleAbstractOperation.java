package com.ty.learnjava17.oops.Abstract_Class;

abstract class Vehicle {
    private String manufacturer;
    private int year;

    public Vehicle(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public abstract void start();

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

	public void accelerate() {
		// TODO Auto-generated method stub
		
	}
}

// Abstract class representing a MotorVehicle which extends Vehicle
abstract class MotorVehicle extends Vehicle {
    private String fuelType;

    public MotorVehicle(String manufacturer, int year, String fuelType) {
        super(manufacturer, year);
        this.fuelType = fuelType;
    }

    public abstract void accelerate();

    public String getFuelType() {
        return fuelType;
    }
}

// Concrete class Car which extends MotorVehicle
class Car extends MotorVehicle {
    public Car(String manufacturer, int year, String fuelType) {
        super(manufacturer, year, fuelType);
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating.");
    }
}

// Concrete class Motorcycle which extends MotorVehicle
class Motorcycle extends MotorVehicle {
    public Motorcycle(String manufacturer, int year, String fuelType) {
        super(manufacturer, year, fuelType);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating.");
    }
}

public class MultipleAbstractOperation {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Toyota", 2022, "Gasoline");
        Vehicle vehicle2 = new Motorcycle("Honda", 2020, "Petrol");

        // Polymorphism in action
        vehicle1.start();
        vehicle1.getManufacturer();
        vehicle2.accelerate();
        vehicle2.getYear();
    }
}