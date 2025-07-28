package com.ty.learnjava17.oops.polymorphism;

public class MethodOverloading_Ex1 {

	
	    void print(int x) {
	        System.out.println("int");
	    }

	    void print(long x) {
	        System.out.println("long");
	    }

	    void print(Integer x) {
	        System.out.println("Integer");
	    }

	    void print (Double x) {
	    	
	    	System.out.println("Double");
	    }
	    
	    void print(Object x) {
	        System.out.println("Object");
	    }

	    void print(int... x) {
	        System.out.println("int varargs");
	    }

	    public static void main(String[] args) {
	        MethodOverloading_Ex1 test = new MethodOverloading_Ex1();

	        byte b = 5;
	        test.print(b);           // Case 1: byte -> ?  //byte is promoted to int (exact match not found)

	        test.print(10);          // Case 2: int	 //exact match

	        test.print(10L);         // Case 3: long // exact match

	        test.print(new Integer(10)); // Case 4: Integer //exact match for Integer

	       // test.print(null);        // Case 5: null  -> Ambiguous — null can go to Integer, Object, both are applicable

	        test.print(10.5);
	        
	        test.print();            // Case 6: no argument
	    }
	}


