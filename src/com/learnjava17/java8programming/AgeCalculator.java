package com.learnjava17.java8programming;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

	public static void main(String[] args) {
		
		String birthDateString = "1995-05-05";
		LocalDate birthDate =  LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate currentDate =  LocalDate.now();
		
		if (birthDate != null && currentDate!= null) {
			
			Period period =  Period.between(birthDate, currentDate);
		
			System.out.println("Age: " +period.getYears()+ " years");
		}
		
		
	}
}
