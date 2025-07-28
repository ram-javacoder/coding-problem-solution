package com.ty.learnjava17.ArrayPrograms;

public class FineLastDigitThree {

	public static void main(String[] args) {
//		
//		String str="Java Development";
//		String ans=str.substring(str.length()-1);
//		
//		System.out.println(ans);

		int arr[] = { 21, 43, 13, 11, 3 };

		System.out.println("Element which contain last digit 3 : ");
		for (int i = 0; i < arr.length; i++) {

			int lastdigit = 0;
			String s = " ";
			s = Integer.toString(arr[i]);
			lastdigit = Integer.parseInt(s.substring(s.length() - 1));

			if (lastdigit==3) {
				
				System.out.print(arr[i]+ " ");
			}
		}

	}

}
