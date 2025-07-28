package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FindSumExceptPoint {


	static Scanner sc =new Scanner(System.in);
	public static void main(String args[]) {
		
		
		int input[] = {3,6,2,5,8};
		int output[] = new int[input.length];
		
		int totalVal = Arrays.stream(input).sum();
	
		for(int i=0;i<input.length;i++) {
			
			output[i] = totalVal - input[i];
			
			
		} 
		System.out.println("Original Array : " +Arrays.toString(input));
		System.out.println("Output : " +Arrays.toString(output));

}
}
