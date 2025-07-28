package com.ty.learnjava17.Interface;

//To Overcome Diamond Problem

interface Sample1 {
	default void sum(int x, int y) {
		System.out.println("Sum 1 is = " + (x + y));
	}

}

interface Sample2 {
	default void sum(int x, int y) {
		System.out.println("Sum 2 is = " + (x + y));
	}
}

class DiamondProblem implements Sample1, Sample2 {
//    @Override
//    public void sum(int x,int y) { 
//          System.out.println("Sum is = "+ (x+y)); 
//    } (OR)

	@Override
	public void sum(int p, int q) {
		// TODO Auto-generated method stub
		Sample1.super.sum(p, q);
	}

	public static void main(String args[]) {
		DiamondProblem obj = new DiamondProblem();
		obj.sum(18, 92);
	}

}
