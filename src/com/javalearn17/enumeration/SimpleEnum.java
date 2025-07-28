package com.javalearn17.enumeration;

enum Color_ {

		RED, GREEN, YELLOW
	}

	public class SimpleEnum {

		public static void main(String[] args) {
			
			Color_ c=  Color_.RED;
			
			System.out.println("Accessing single constant value : " +c);
			System.out.println("Accessing all constant values ");
			
			Color_ c1 [] = Color_.values();
			
			for (Color_ color : c1) {
				
				System.out.println(color);
			}
			
		}

	}
	
