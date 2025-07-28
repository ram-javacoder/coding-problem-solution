package trainingPart2Qs;

class One {
	void m1() {
		System.out.println("m1 method in class One");
	}
}

class Two extends One {
	void m2() {
		System.out.println("m2 method in class Two");
	}
}

public class DownCastingExp1 {
	public static void main(String[] args) {
		One o = new Two(); // Superclass reference refers to subclass object.
		Two t = (Two) o; // Converting super class reference type into subclass reference type.

		t.m1(); // Calling m1 method using reference variable of subclass.
		t.m2(); // Calling m1 method using reference variable of subclass.
	}
}