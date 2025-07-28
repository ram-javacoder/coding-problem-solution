package com.learnjava17.Exception;

public class ThrowVSThrowsExp {

	    public static void checkAge(int age) throws IllegalArgumentException {
	        if (age < 18) {
	            throw new IllegalArgumentException("Age must be 18 or above"); // ❌ Throws Exception
	        }
	        System.out.println("Access granted!");
	    }

	    public static void main(String[] args) {
	        try {
	            checkAge(16);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	}
