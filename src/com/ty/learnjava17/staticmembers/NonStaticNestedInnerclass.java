package com.ty.learnjava17.staticmembers;

class ClassA {

	// Static member variable of ClassA
	static int x = 10;

	int y = 20;
	public int z = 30;

	// Class 2 - Helper Class 2
	// Non-static nested class
	class ClassB {

		// Method of Non-static nested class
		void get() {
			// Execution command of get() method

			// Print and display commands
			System.out.println("x: " + x);
			System.out.println("y: " + y);
			System.out.println("z: " + z);
		}
	}
}

public class NonStaticNestedInnerclass {

	public static void main(String[] args) {

		// Creating object of Class 1 in main() method
		ClassA ob1 = new ClassA();

		// Creating object of non-static nested class in
		// main()
		ClassA.ClassB ob2 = ob1.new ClassB();

		// Calling non-static nested class method
		// in main() method
		ob2.get();

	}

}
