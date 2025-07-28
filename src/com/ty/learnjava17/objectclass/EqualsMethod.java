package com.ty.learnjava17.objectclass;

public class EqualsMethod {

	public static void main(String[] args) {

		EqualsMethod e1=new EqualsMethod();
		EqualsMethod e2=new EqualsMethod();
		EqualsMethod e3=e1;
		EqualsMethod e4=e3;
		
		boolean res=e1.equals(e3);
		boolean res1=e1.equals(e4);
		System.out.println(e1.equals(e2));
		System.out.println(res);
		System.out.println(res1);
		
		

	}

}
