package com.learnjava17.java8programming;

import java.util.Arrays;

public class CommonElementInBothArray {

    public static void main(String[] args) {

        int arr_1[] = {1, 3, 4};
        int arr_2[] = {3, 4,1};

        int[] result = Arrays.stream(arr_1).distinct().
                filter(e1 -> Arrays.stream(arr_2).anyMatch(e2 -> e1 == e2)).toArray();

        if (result != null || result.length != 0) {

            System.out.println(Arrays.toString(result));
        } else {
            System.out.println((arr_1.length < arr_2.length) ? Arrays.toString(new int[arr_1.length]) : Arrays.toString(new int[arr_1.length]));
        }


// (OR)		
//		List<Integer> result2 = Arrays.stream(arr_1).boxed()
//				.flatMap(e1 -> Arrays.stream(arr_2).boxed().filter(e2 -> e2 == e1)).collect(Collectors.toList());
//		System.out.println(result2);


    }
}
