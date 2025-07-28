package trainingPart2Qs;

public class DiffrentEqualsmethod {

	public static void main(String[] args) {
		
		
		String s1="Java";
		String s2="Java";
		String s3="SQL";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		String s4=new String("Java");
		String s5=new String("Java");
		String s6=new String("SQL");
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		System.out.println(s4==s6);

	}

}
