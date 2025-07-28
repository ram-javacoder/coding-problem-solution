package com.learnjava17.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws_exp1 {


	    // ❌ This method does not handle the exception, so we use throws
	    public static void readFile() throws FileNotFoundException {
	        File file = new File("non_existing_file.txt");
	        FileReader fr = new FileReader(file); // Might throw FileNotFoundException
	    }

	    public static void main(String[] args) {
	        try {
	            readFile(); // ✅ Must handle exception here
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + e.getMessage());
	        }
	    }
	}
