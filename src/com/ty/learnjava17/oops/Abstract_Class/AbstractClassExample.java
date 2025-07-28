package com.ty.learnjava17.oops.Abstract_Class;

abstract class AbstractClass {

	private static int count = 0;

	public AbstractClass() {
		count++;

	}

	public static int getcount() {

		return count;

	}

	public abstract void doSomething();

}

class ConcreteClass1 extends AbstractClass {
	public void doSomething() {
		System.out.println("Concrete Class1 doSomething method()");

	}
}

class ConcreteClass2 extends AbstractClass {
	public void doSomething() {
		System.out.println("Concrete Class1 doSomething method()");

	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		AbstractClass a = new ConcreteClass1();
		AbstractClass b = new ConcreteClass2();
		a.doSomething();
		b.doSomething();
		System.out.println(a.getcount());
		System.out.println(b.getcount());
		System.out.println("No of Object Created :" + AbstractClass.getcount());
		

	}

}
