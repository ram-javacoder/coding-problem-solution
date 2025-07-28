package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

//This version of Kadane's Algorithm 

public class FindMaxSumSubArraySingleLoop {


	public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        findMaxSubarraySum(arr);
    }

    private static void findMaxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax + arr[i]) {
                currentMax = arr[i];
                tempStart = i;
            } else {
                currentMax += arr[i];
            }

            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
                start = tempStart;
                end = i;
            }
        }

        // Print result
        System.out.println("Maximum Subarray Sum: " + maxSoFar);
        System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)));
    }
}

