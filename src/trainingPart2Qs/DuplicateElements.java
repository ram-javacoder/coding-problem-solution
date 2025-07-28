package trainingPart2Qs;

import java.util.Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int arr[]= {1,12,3,9,6,12,9,0,1,3,2};
		// 1 12 3 9 6 0 
		
		int res[]=new int[256];
		
		for (int i = 0; i < arr.length; i++) {
			
			res[arr[i]]++;
		
		
		}
		
	
		System.out.println("Duplicate Elements :");
		
		for (int i = 0; i < res.length; i++) {
			
			if (res[i]>1) {
				
				System.out.print(i+ " ");
			}
			
		}
		
	}

}
