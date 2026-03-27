package com.ty.learnjava17.ArrayPrograms;

public class FindMaxSumSubArrayKadane {

		public static void main(String[] args) {

			int[] arr = {2, 3, -8, 7, -1, 2,3};

	        int maxSum = kadane(arr);
	        System.out.println("Maximum Subarray Sum: " + maxSum);
		}
		
		 public static int kadane(int[] arr) {
		        int maxSum = arr[0];     // final answer
		        int currentSum = arr[0]; // running sum

		        for (int i = 1; i < arr.length; i++) {
		            // either take current element OR extend previous subarray
		            currentSum = Math.max(arr[i], currentSum + arr[i]);

		            // update max
		            maxSum = Math.max(maxSum, currentSum);
		        }

		        return maxSum;
		    }

	}
