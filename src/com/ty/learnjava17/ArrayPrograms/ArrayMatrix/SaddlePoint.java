package com.ty.learnjava17.ArrayPrograms.ArrayMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaddlePoint {

	public static void main(String[] args) {
	int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	currentMatrix(arr);
	findSaddlePoint(arr);
		
	}
	private static void currentMatrix(int[][] arr) {
		System.out.println("Input: ");
		for (int[] i : arr) {

			System.out.println(Arrays.toString(i));

		}
		
	}
	private static void findSaddlePoint(int[][] arr) {

	    int rows = arr.length;
	    int cols = arr[0].length;

	    List<Integer> result = new ArrayList<>();

	    for (int i = 0; i < rows; i++) {

	        int minInRow = Integer.MAX_VALUE;
	        int columnIndex = -1;

	        // Find minimum in row
	        for (int j = 0; j < cols; j++) {
	            if (arr[i][j] < minInRow) {
	                minInRow = arr[i][j];
	                columnIndex = j;
	            }
	        }

	        // Check if it is maximum in that column
	        boolean isSaddlePoint = true;
	        for (int k = 0; k < rows; k++) {
	            if (arr[k][columnIndex] > minInRow) {
	                isSaddlePoint = false;
	                break;
	            }
	        }

	        if (isSaddlePoint) {
	            result.add(minInRow);
	        }
	    }

	    System.out.println("Output: " + result);
	}

}
