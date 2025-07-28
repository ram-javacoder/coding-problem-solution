package trainingPart2Qs;


 class Parent {
	public void property1() {
		System.out.println("Parent property1");
	}
}

 class Child extends Parent {
	public void property2() {
		System.out.println("Child property1");
	}
}

public class UpcastingDowncasting  {
	public static void main(String[] args) {
		Parent person = new Child();
		person.property1();
		//person.property2(); --> Compile error;
		Child c = (Child) person;
		c.property2();
	}
}