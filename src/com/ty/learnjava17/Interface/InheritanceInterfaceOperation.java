package com.ty.learnjava17.Interface;

interface P {

	void print();

}

interface Q extends P {

	void show();
}

class C implements Q {

	public void print() {

		System.out.println("P Class Interface Print method...");

	}

	@Override
	public void show() {

		System.out.println("Q Interface Show Method...");
	}

}

public class InheritanceInterfaceOperation {

	public static void main(String[] args) {

	C obj=new C();
	obj.print();
	obj.show();
	}

}
