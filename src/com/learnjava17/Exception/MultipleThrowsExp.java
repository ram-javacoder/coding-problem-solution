package com.learnjava17.Exception;

import java.io.FileReader;
import java.io.IOException;

public class MultipleThrowsExp {


	    public static void readData() throws IOException, ArithmeticException {
	        FileReader file = new FileReader("data.txt"); // May throw IOException
	        int result = 10 / 0; // May throw ArithmeticException
	        System.out.println(file);
	        System.out.println(result);
	    }

	    public static void main(String[] args) {
	        try {
	            readData(); // Must handle both exceptions
	        } catch (IOException | ArithmeticException e) {
	            System.out.println("Exception occurred: " + e.getMessage());
	        }
	    }
	}
