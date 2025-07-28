package trainingPart2Qs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class ImmutableStu {

	private final int rollno;
	private final String name;
	private final Map<String, Double> mark;

	public ImmutableStu(int rollno, String name, Map<String, Double> mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = new HashMap<>(mark); 
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public Map<String, Double> getMark() {
		return Collections.unmodifiableMap(mark);
	}

}

public class ImmutableStudent {

	public static void main(String[] args) {

		Map<String, Double> mark = new HashMap<String, Double>();
		mark.put("English", 98.0);
		mark.put("Competer Science", 99.0);

		ImmutableStu stu = new ImmutableStu(123, "Ram", mark);
		stu.getMark().put("Tamil", 80.0);
		
		
		System.out.println("Roll no : " + stu.getRollno());
		System.out.println("Name : " + stu.getName());
		System.out.println("Marks : " + stu.getMark());

	}
}
