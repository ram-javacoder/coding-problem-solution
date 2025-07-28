package trainingPart2Qs;

import java.util.Objects;

public class Employee {

	private int employeeId;
	private String firstname;
	private String lastname;
	private long phno;
	private String email;

	private Address address=new Address(); //Early Instantiation

	
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstname, String lastname, long phno, String email, Address address) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phno = phno;
		this.email = email;
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, email, employeeId, firstname, lastname, phno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& employeeId == other.employeeId && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname) && phno == other.phno;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname + ", phno="
				+ phno + ", email=" + email + ", address=" + address + "]";
	}

}
