package trainingPart2Qs;

/*Create a Student class with fields: id, name, location, and totalMarks.  
- Collect a list of students as a Map, where studentId is the key and Student object is the value using streams.  
- Filter students based on totalMarks and location. 
*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {

	private int studentId;
	private String studentName;
	private String location;
	private int totalMark;

	public Student(int studentId, String studentName, String location, int totalMark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.location = location;
		this.totalMark = totalMark;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getLocation() {
		return location;
	}

	public int getTotalMark() {
		return totalMark;
	}

	@Override
	public String toString() {
		return "FilterStudent [studentId=" + studentId + ", studentName=" + studentName + ", location=" + location
				+ ", totalMark=" + totalMark + "]";
	}

}

public class FilterStudent {

	public static void main(String[] args) {

		List<Student> stu = Arrays.asList(new Student(101, "Alice", "New York", 8),
				new Student(102, "Bob", "Los Angeles", 75), new Student(103, "Charlie", "New York", 92),
				new Student(104, "David", "Chicago", 60), new Student(105, "Eve", "Los Angeles", 88));

		Map<Integer, Student> mapStudent = stu.stream()
				.collect(Collectors.toMap(Student::getStudentId, student -> student));

		mapStudent.forEach((id, students) -> System.out.println(id + " : " + students));

		System.out.println("\nStudents with total mark more than 80 and location New York :");
		stu.stream().filter(
				totalMark -> totalMark.getTotalMark() >= 80 && totalMark.getLocation().equalsIgnoreCase("New York"))
				.forEach(System.out::println);

	}

}
