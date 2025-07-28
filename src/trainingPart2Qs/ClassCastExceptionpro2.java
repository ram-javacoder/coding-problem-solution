package trainingPart2Qs;

class A {
	public void m1() {

		System.out.println("This is A class m1()");
	}
}

class B extends A {

	public void m1() {

		System.out.println("This is A class m1()");
	}

	public void m2() {
		System.out.println("This is B class m2()");
	}
}

class C extends B {

	public void m3() {

		System.out.println("This is C class m3()");
	}

}

public class ClassCastExceptionpro2 {

	public static void main(String[] args) {

		A obj = new B(); // 'obj' is reference type of A and instance of B but 'obj' is not an instance
							// of C
		C obj2 = (C) obj; // It will throw ClassCastException
		obj2.m1();

		// obj2.m1();
		// obj2.m2();
		// obj2.m3();

		/*
		 * But here's the problem:
		 * 
		 * obj is actually an object of B, not C.
		 * 
		 * And even though C extends B, this cast is not valid because you're trying to
		 * treat a B object as if it were a C object, which it is not.
		 * 
		 * So at runtime, Java throws a ClassCastException.
		 */

		/*
		 * 🧠 Think of Classes Like a Family A is the grandparent
		 * 
		 * B is the parent
		 * 
		 * C is the child
		 * 
		 * C extends B means: C is a child of B. B extends A means: B is a child of A.
		 * 
		 * "obj is actually an object of B, not C"
		 * 
		 * A obj = new B(); // Object is created from class B
		 * 
		 * Even though obj is declared as type A, it actually belongs to class B.
		 * 
		 * Then you wrote:
		 * 
		 * C obj2 = (C) obj; // Trying to treat B object as if it's from class C That’s
		 * like saying:
		 * 
		 * "Hey Java, I promise this B object is a C object."
		 * 
		 * But Java checks at runtime and says:
		 * 
		 * "No, it’s not. This object doesn’t belong to class C."
		 * 
		 */

	}

}
