package com.learnjava17.java8programming;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class PatientOperation {

	public static void main(String[] args) {

		Patient patient1 = new Patient("SRM12A6", "abc", "Fever", 24, LocalDate.of(2024, 02, 03));
		Patient patient2 = new Patient("SRM12A10", "xyz", "Corona", 28, LocalDate.of(2024, 01, 16));
		Patient patient3 = new Patient("SRM12A2", "pqr", "Corona", 26, LocalDate.of(2024, 01, 10));
		Patient patient4 = new Patient("SRM12A13", "jkl", "Corona", 22, LocalDate.of(2024, 01, 18));
		Patient patient5 = new Patient("SRM12A8", "opq", "Fever", 23, LocalDate.of(2024, 02, 05));

		List<Patient> patientList = new LinkedList<Patient>();
		patientList.add(patient1);
		patientList.add(patient2);
		patientList.add(patient3);
		patientList.add(patient4);
		patientList.add(patient5);

		System.out.println("Patients Details :");
		for (Patient patients : patientList) {

			System.out.println("Admit number :" + patients.getAdmitNumber() + " Name: " + patients.getPatientName()
					+ " Type of Disease: " + patients.getDisease() + " Age :" + patients.getAge() + " Date of Admit :"
					+ patients.getDateOfadmit());
		}

		System.out.println("\nList of Corona patients :");
		patientList.stream().filter(c -> c.getDisease().equalsIgnoreCase("Corona")).forEach(System.out::println);

		System.out.println("\nPatients whose age is 23 and below");
		patientList.stream().filter(a -> a.getAge() <= 23).forEach(System.out::println);

		System.out.println("\nPatients whose belongs to Corona and age below 23");
		patientList.stream().filter(a -> a.getDisease().equalsIgnoreCase("Corona") && a.getAge() <= 23)
				.forEach(System.out::println);

	}

}
