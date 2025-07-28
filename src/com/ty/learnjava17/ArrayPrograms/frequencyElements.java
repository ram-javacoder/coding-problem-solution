package com.ty.learnjava17.ArrayPrograms;



public class frequencyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ele[]={1, 2, 8, 3, 2, 2, 2, 5, 1};

		int res[] = new int[256];

		for (int i = 0; i < ele.length; i++) {

			res[ele[i]]++;

		}

		
		
	System.out.println("Frequency Elements :");

		for (int i = 0; i < res.length; i++) {

			if (res[i] != 0) {

				System.out.println(i+ " : " +(int)res[i]);

			}

		}

	}

}
