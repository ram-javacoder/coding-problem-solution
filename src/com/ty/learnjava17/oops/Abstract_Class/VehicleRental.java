package com.ty.learnjava17.oops.Abstract_Class;

abstract class Vehicle_ {

	String vehicleId;

	public Vehicle_(String vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	abstract void rentVehicle();

	void showeVehicleId() {

		System.out.println("Vehicle Id : " + vehicleId);
	}

}

class Car_ extends Vehicle_ {

	public Car_(String vehicleId) {
		super(vehicleId);

	}

	@Override
	void rentVehicle() {

		System.out.println("Car " + vehicleId + " rented!");

	}

}

class Bike extends Vehicle_ {

	public Bike(String vehicleId) {
		super(vehicleId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void rentVehicle() {

		System.out.println("Bike " + vehicleId + " rented!");

	}

}

public class VehicleRental {

	public static void main(String[] args) {

		Vehicle_ car = new Car_("TN05123");
		Vehicle_ bike = new Bike("TN0123");

		car.rentVehicle();
		car.showeVehicleId();

		bike.rentVehicle();
		bike.showeVehicleId();

	}
}