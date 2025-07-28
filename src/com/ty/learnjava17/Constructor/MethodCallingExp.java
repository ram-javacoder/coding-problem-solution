package com.ty.learnjava17.Constructor;

class Universe {

	public Milkeyway universeMethod() {

		System.out.println("This is Universe Method");
		return new Milkeyway();

	}
}

class Milkeyway {

	public Earth milkywayMethod() {

		System.out.println("This is Milkyway Method");
		return new Earth();

	}
}

class Earth {

	public Organism earth() {

		System.out.println("This is earth Method");
		return new Organism();

	}
}

// name.universe()
class Organism {

	public Humanbeing organism() {

		System.out.println("This is Organism Method");
		return new Humanbeing();
	}
}

class Humanbeing {

	public MethodCallingExp humanmethod() {

		System.out.println("This is Humanbeing method");

		return new MethodCallingExp();

	}
}

public class MethodCallingExp {

	public static void main(String[] args) {

		Universe obj=new Universe();
		
		obj.universeMethod().milkywayMethod().earth().organism().humanmethod();
		
	}

}

/*
This is Universe Method
This is Milkyway Method
This is earth Method
This is Organism Method
This is Humanbeing method
*/