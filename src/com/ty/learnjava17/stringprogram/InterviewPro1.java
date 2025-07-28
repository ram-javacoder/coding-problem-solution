package com.ty.learnjava17.stringprogram;

//Input : aaabbaacce
//Output: a : 3 b : 2 a : 2 c : 2 e : 1

public class InterviewPro1 {

	public static void main(String[] args) {
		
		String str="aaabbaggcee";
		int m,j;
		
		for(int i=0;i<str.length();i++) {
			m=1;
			for (j = i+1; j < str.length(); j++) {
				
				if (str.charAt(i)==str.charAt(j)) {
					m++;
				} else {
					
					break;

				}
				
			}
			
			System.out.print(str.charAt(i)+ " : " +m+ " ");
			i=j-1;
			
		}
		

	}

}


//a : 3 b : 2 a : 2 c : 2 e : 1
