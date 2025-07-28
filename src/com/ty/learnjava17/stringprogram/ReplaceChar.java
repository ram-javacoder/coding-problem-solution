package com.ty.learnjava17.stringprogram;

public class ReplaceChar {
//Java Program to replace lower-case characters with upper-case and vice-versa?

	public static void main(String[] args) {

		String str = "TesTYandRa";
		char ch[]=str.toCharArray();
		String res="";
		
		for (int i = 0; i < str.length(); i++) {
			
			if (ch[i]>='A' && ch[i]<='Z') {
				
				res=res+(char)(ch[i]+32);
			}
			else
			{
				
				res=res+(char)(ch[i]-32);
			}
			
		}
		System.out.println("String is :" +str);
		System.out.println("String after replacing Uppercase to Lowercase and vice-versa :");
		System.out.println(res);
		
	}

}
