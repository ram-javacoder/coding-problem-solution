package com.learnjava17.java8programming.supplierfunction;

import java.util.function.Supplier;

public class GeneratePassword {

	public static void main(String[] args) {
		
		Supplier<StringBuffer> s = () -> {
			 
            // local variable
            StringBuffer password = new StringBuffer();
 
            // iterate through 8 times to generate unique number
            for(int i=0; i<8; i++) {
 
                // append each ransom integer digit to StringBuffer
                password.append((int)(Math.random() * 10));
            }
 
            // finally return password
            return password;
        };
 
        // invoke above Supplier FI to print password for customer login
        System.out.println(s.get());
	}
}
