package trainingPart2Qs;

class ParentClass {

	int parentvariable; // SLNSI

	public ParentClass() {
		// TODO Auto-generated constructor stub
		// LI

	}

	ParentClass(int value) {

		this.parentvariable = value;
		System.out.println("This is Parent class Constructor...");
	}

	public void display() {

		System.out.println("Parent variable is :" + parentvariable);

	}

}

class childClass extends ParentClass {

	int childVariable;

	public childClass() {
		// TODO Auto-generated constructor stub
		// LI

	}

	childClass(int parentValue, int childValue) {

		super(parentValue);
		this.childVariable = childValue;
		System.out.println("This is Child Class Constructor...");
	}

	public void display() {
		super.display();
		System.out.println("Child Class Variable :" + childVariable);

	} /*
		 * super() is used to invoke superclass constructors and methods within a
		 * subclass, allowing for proper initialization and utilization of inherited
		 * members.
		 */

}

public class SuperCallExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass c = new childClass(55, 28);
		c.display();

	}

}
