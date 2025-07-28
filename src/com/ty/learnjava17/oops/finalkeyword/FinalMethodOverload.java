package com.ty.learnjava17.oops.finalkeyword;
	
class A {
	
	public final void message(int a,int b) {
		System.out.println("Addition of Two Number :" +(a+b));
		
	}
	public final void message(int a,int b,int c) {
		System.out.println("Multiplication of Three Number :" +(a*b*c));
		
	}
	
}



public class FinalMethodOverload {

	public static void main(String[] args) {
		A obj=new A();
		obj.message(23, 56);
		obj.message(34,56,78);

	}

}
