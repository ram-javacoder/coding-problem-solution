package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

public class InterviewQs1 {

	// Input : {-4,-1,0,3,10}
	// Output : {0,1,9,16,100}

	public static void main(String[] args) {

		int arr[] = { -4, -1, 0, 3, 10 };
		int ans[] = new int[arr.length];

		for (int i = 0; i < ans.length; i++) {

			ans[i] = arr[i] * arr[i];

		}

		for (int i = 0; i < ans.length; i++) {

			for (int j = 0; j < ans.length - 1; j++) {

				int temp = 0;

				if (ans[j] > ans[j + 1]) {
					temp = ans[j];
					ans[j] = ans[j + 1];
					ans[j + 1] = temp;
				}
			}

		}
		
		System.out.println(Arrays.toString(ans));

	}

}
