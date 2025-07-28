package trainingPart2Qs;

import java.util.HashMap;
import java.util.Map;

class StudentWithoutDeepCopy {

	private final String stu_name;
	private final Map<String, Integer> mark;

	public StudentWithoutDeepCopy(String stu_name, Map<String, Integer> mark) {
		super();
		this.stu_name = stu_name;
		this.mark = mark;     //Direct assignment (shallow copy)
	}

	public String getStu_name() {
		return stu_name;
	}

	public Map<String, Integer> getMark() {
		return mark;
	}

	@Override
	public String toString() {
		return "Student's name = " + stu_name + " :  Mark = " + mark;
	}

}

public class WithoutDeepCopy {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("English", 98);
		map.put("Computer Science", 99);
		
		StudentWithoutDeepCopy stu = new StudentWithoutDeepCopy("Ram", map);
		System.out.println("Before modifying : " +stu);
		
		map.put("Tamil", 80);
		System.out.println("After modifying : " +stu);  //Changes Student's marks!
		
		
		
	}
	
}
