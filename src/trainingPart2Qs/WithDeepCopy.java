package trainingPart2Qs;

import java.util.HashMap;
import java.util.Map;

class StudentWithDeepCopy {

	private final String stu_name;
	private final Map<String, Integer> mark;

	public StudentWithDeepCopy(String stu_name, Map<String, Integer> mark) {
		super();
		this.stu_name = stu_name;
		this.mark = new HashMap<>(mark); // Deep Copy
	}

	public String getStu_name() {
		return stu_name;
	}

	public Map<String, Integer> getMark() {
		return new HashMap<>(mark); // Returning copy
	}
	/*
	 * public Map<String, Integer> getMarks() { return
	 * Collections.unmodifiableMap(marks); // Prevent modification }
	 */

	@Override
	public String toString() {
		return "Student's = " + stu_name + " :  Mark = " + mark;
	}

}

public class WithDeepCopy {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("English", 98);
		map.put("Computer Science", 99);

		StudentWithDeepCopy stu = new StudentWithDeepCopy("Ram", map);
		System.out.println("Before modifying : " + stu);

		map.put("Tamil", 87);
		System.out.println("After modifying : " + stu); // ✅ No change!

		stu.getMark().put("History", 88); // Throws UnsupportedOperationException
		stu.getMark().put("History", 88);
		System.out.println("After modifying retrieved marks: " + stu); // ✅ No change!

	}
}
