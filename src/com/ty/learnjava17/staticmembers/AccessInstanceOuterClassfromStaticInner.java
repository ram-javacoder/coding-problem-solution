package com.ty.learnjava17.staticmembers;

class OuterClass {
	int outerInstanceVar = 10;

	static class StaticInnerClass {
		void accessOuterMember() {
			// Cannot access outerInstanceVar directly from a static context
			// System.out.println("Outer instance variable from static inner class: " +
			// outerInstanceVar);

			// To access the instance variable of the outer class,
			// create an instance of the outer class inside the static inner class
			OuterClass outer = new OuterClass();
			System.out.println("Outer instance variable from static inner class: " + outer.outerInstanceVar);
		}
	}
}

public class AccessInstanceOuterClassfromStaticInner {

	public static void main(String[] args) {

		
		// Accessing static inner class method
		OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
		inner.accessOuterMember();

	}

}
