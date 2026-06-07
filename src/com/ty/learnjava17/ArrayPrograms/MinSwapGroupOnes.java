package com.ty.learnjava17.ArrayPrograms;

public class MinSwapGroupOnes {
    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;

        // Step 1: Count total number of 1s in the array
        for (int num : nums) {
            if (num == 1) totalOnes++;
        }

        // Edge case: if there are no 1s or all are 1s, 0 swaps needed
        if (totalOnes == 0 || totalOnes == n) return 0;

        // Step 2: Count 0s in the first window of size 'totalOnes'
        int currentZeros = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 0) currentZeros++;
        }

        int minSwaps = currentZeros;

        // Step 3: Slide the window across the rest of the array
        for (int i = totalOnes; i < n; i++) {
            // Element leaving the window (at index i - totalOnes)
            if (nums[i - totalOnes] == 0) {
                currentZeros--;
            }
            // Element entering the window (at index i)
            if (nums[i] == 0) {
                currentZeros++;
            }

            // Update the minimum swaps found so far
            minSwaps = Math.min(minSwaps, currentZeros);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1};
        System.out.println("Minimum swaps required: " + minSwaps(arr));
    }
}