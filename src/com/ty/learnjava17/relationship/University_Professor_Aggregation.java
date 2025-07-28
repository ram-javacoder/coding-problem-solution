package com.ty.learnjava17.relationship;

import java.util.ArrayList;
import java.util.List;

class Professor {

	private String name;
	private String subject;

	public Professor(String name, String subject) {

		this.name = name;
		this.subject = subject;
	}

	public void professorsList() {
		System.out.println("Professor Name : " + this.name);
		System.out.println("Subject : " + this.subject);

	}
}

class University {

	private String universityName;
	private String location;
	private List<Professor> professors;

	public University(String universityName, String location) {
		this.universityName = universityName;
		this.location = location;
		this.professors = new ArrayList<>();
	}

	public void addProfessor(Professor professor) {

		professors.add(professor);
	}

	public void detailsOfUniversity() {

		System.out.println("University's name : " + universityName);
		System.out.println("Location : " + location);
		System.out.println("Professors in the University ");
		for (Professor professor : professors) {

			professor.professorsList();
		}

	}

}

public class University_Professor_Aggregation {

	public static void main(String[] args) {

		Professor p1 = new Professor("Dr. Emily Davis", "Physics");
		Professor p2 = new Professor("Dr. John Smith", "Computer Science");

		University u1 = new University("Harvard University", "USA");
		u1.addProfessor(p1);
		u1.addProfessor(p2);

		u1.detailsOfUniversity();
	}
}
