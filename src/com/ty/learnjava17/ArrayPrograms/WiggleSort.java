package com.ty.learnjava17.ArrayPrograms;

import java.util.Arrays;

/*
The usual requirement is:

a[0] <= a[1] >= a[2] <= a[3] >= a[4]...

For example:

[3, 5, 2, 1, 6, 4]

A valid wiggle arrangement could be:
[3, 5, 1, 6, 2, 4]
because:
        3 <= 5 ✅
        5 >= 1 ✅
        1 <= 6 ✅
        6 >= 2 ✅
        2 <= 4 ✅

*/
public class WiggleSort {

    public static void wiggleSortStrict ( int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int mid = (n - 1) / 2; // Midpoint for smaller half
        int end = n - 1;       // End index for larger half

        // Fill even positions with smaller values (from middle towards 0)
        for (int i = 0; i < n; i += 2) {
            nums[i] = sorted[mid--];
        }

        // Fill odd positions with larger values (from end towards middle)
        for (int i = 1; i < n; i += 2) {
            nums[i] = sorted[end--];
        }
    }

    public static void main (String[]args){
        int[] nums = {3, 5, 2, 1, 6, 4};  //5, 5, 5, 4, 4, 4, 4
        wiggleSortStrict(nums);
        System.out.println(Arrays.toString(nums));

    }

//    Time Complexity  O(N)(Single loop) O(N log N) (Due to sorting)
//    Space Complexity  O(1)(In-place)  O(N) (Creates temporary sorted array)

}
