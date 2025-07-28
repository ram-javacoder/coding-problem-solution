package com.ty.learnjava17.stringprogram;

import java.util.Scanner;

public class StringTimes {

	static Scanner sc=new Scanner(System.in);
	
	
	public static String stringTimes(String str,int n)
	{
		String string="";
		
		for (int i = 0; i < n; i++) {
			string =string+str+" ";
		}
		return string;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Enter the number for how many time want to display :");
		int n=sc.nextInt();
		
		System.out.println(stringTimes(str,n));
	}

}
