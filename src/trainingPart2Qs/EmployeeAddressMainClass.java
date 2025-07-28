package trainingPart2Qs;

import java.util.Map;

public class EmployeeAddressMainClass {

	public static void main(String[] args) {
		
		Address address =new Address();
		address.setCity("Chennai");
		address.setState("Tamilnadu");
		

		Employee employee =new Employee();
		employee.setEmployeeId(1);
		employee.setFirstname("Ram");
		employee.setLastname("Mohanavel");
		employee.setPhno(8838090870l);
		employee.setEmail("ramxyz5595@gmail.com");
		employee.setAddress(address);
		
		System.out.println(employee);
		
		SubjectMark sm=new SubjectMark();
		sm.setMark(87);
		sm.setSubject("Maths");
		sm.setMark(92);
		sm.setSubject("Computer Science");
		sm.setMark(81);
		sm.setSubject("English");
	
		
		
		
	}

}
