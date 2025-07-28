package com.learnjava17.java8programming.predicate;

public class User {

	private String name, roll;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public String getRoll() {
		return roll;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", roll=" + roll + "]";
	}

}
