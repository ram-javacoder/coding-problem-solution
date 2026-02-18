package com.learnjava17.java8programming.functionInterface;

@FunctionalInterface
interface ParentFunctionalInterface {

	void parentabstractMethod();
}


interface childInterface extends ParentFunctionalInterface {

	void childabstractMethod();
	

}

class methodDefinition implements childInterface {

	@Override
	public void parentabstractMethod() {

		System.out.println("Parent abstract method implementation... ");
	}

	@Override
	public void childabstractMethod() {

		System.out.println("Child abstract method implementation... ");

	}

}

public class SampleFunctionalInterface {

	public static void main(String args[]) {
		methodDefinition m = new methodDefinition();   //childInterface m = new methodDefinition();
		m.parentabstractMethod();
		m.childabstractMethod();
		
	}

}
