package com.ty.learnjava17.stringprogram;

public class CheckPolindrome {

	    public static void main(String[] args) {
	        String str = "mom"; 

	        if (isPalindrome(str)) {
	            System.out.println("Yes! It is a palindrome");
	        } else {
	            System.out.println("It is not a palindrome!");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false; // Mismatch found
	            }
	            start++;
	            end--;
	        }

	        return true; // All characters matched
	    }
	}


