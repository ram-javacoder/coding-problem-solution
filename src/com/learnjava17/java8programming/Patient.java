package com.learnjava17.java8programming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Patient {

	private String admitNumber;
	private String patientName;
	private String disease;
	private Integer age;
	private LocalDate dateOfadmit;
	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String admitNumber, String patientName, String disease, Integer age, LocalDate localDate) {
		super();
		this.admitNumber = admitNumber;
		this.patientName = patientName;
		this.disease = disease;
		this.age = age;
		this.dateOfadmit = localDate;
	}

	public String getAdmitNumber() {
		return admitNumber;
	}

	public void setAdmitNumber(String admitNumber) {
		this.admitNumber = admitNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDateOfadmit() {
		return dateOfadmit;
	}

	public void setDateOfadmit(LocalDate dateOfadmit) {
		this.dateOfadmit = dateOfadmit;
	}

	@Override
	public String toString() {
		return "Patient [admitNumber=" + admitNumber + ", patientName=" + patientName + ", disease=" + disease
				+ ", age=" + age + ", dateOfadmit=" + dateOfadmit + "]";
	}

}
