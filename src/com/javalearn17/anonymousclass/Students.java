package com.javalearn17.anonymousclass;

public class Students {

	private int studentID;
	private int studentAge;
	private int mathsMark;
	private int physicsMark;
	private int computerscienceMark;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int studentID, int studentAge, int mathsMark, int physicsMark, int computerscienceMark) {
		super();
		this.studentID = studentID;
		this.studentAge = studentAge;
		this.mathsMark = mathsMark;
		this.physicsMark = physicsMark;
		this.computerscienceMark = computerscienceMark;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public int getMathsMark() {
		return mathsMark;
	}

	public void setMathsMark(int mathsMark) {
		this.mathsMark = mathsMark;
	}

	public int getPhysicsMark() {
		return physicsMark;
	}

	public void setPhysicsMark(int physicsMark) {
		this.physicsMark = physicsMark;
	}

	public int getComputerscienceMark() {
		return computerscienceMark;
	}

	public void setComputerscienceMark(int computerscienceMark) {
		this.computerscienceMark = computerscienceMark;
	}

	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", studentAge=" + studentAge + ", mathsMark=" + mathsMark
				+ ", physicsMark=" + physicsMark + ", computerscienceMark=" + computerscienceMark + "]";
	}
	
	

}
