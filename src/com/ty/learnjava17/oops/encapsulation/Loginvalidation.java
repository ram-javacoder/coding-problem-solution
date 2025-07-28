package com.ty.learnjava17.oops.encapsulation;

import java.util.Scanner;

class Login {

	private String username;
	private String password;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {

		if (username.equals("Ramkumar")) {

			return "Username is correct! Please entered Password ";
		} else {

			return "Invalid User name!";
		}

	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {

		if (password.equals("8838090870")) {

			return "Password is correct !... Please go head";

		} else {
			return "Entered Password is invalid";

		}

	}

}

public class Loginvalidation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Login l = new Login();
		System.out.println("\t\t\tLogin...");
		System.out.println("Please enter User name");
		String name = sc.next();
		l.setUsername(name);
		System.out.println(l.getUsername());
		
		System.out.println("Please enter Password");
		String pass = sc.next();
		l.setPassword(pass);
		System.out.println(l.getPassword());
	}

}
