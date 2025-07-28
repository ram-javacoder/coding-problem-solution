package com.learnjava17.java8programming.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Useroperation {

	public static void main(String[] args) {

		List<User> user = new ArrayList<User>();
		user.add(new User("John", "admin"));
		user.add(new User("James", "member"));
		user.add(new User("Peter", "member"));
		user.add(new User("Anderson", "admin"));
		user.add(new User("David", "admin"));
		
	Predicate<User>admin=  a-> a.getRoll().equalsIgnoreCase("Admin");
	user.stream().filter(admin).forEach(System.out::println);
	
	}

}
