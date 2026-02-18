package com.ty.learnjava17.stringprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIndexesTargetSum {

	public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 2, 7};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>(); 
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                result.add(new int[]{map.get(complement), i});
            }
 
            map.put(arr[i], i);
        }

        if (result.isEmpty()) {
            System.out.println("No pairs found");
        } else {
        	System.out.print("[");
            for (int[] pair : result) {
                System.out.print(Arrays.toString(pair));
            }
            System.out.println("]");
        }
    }
}
