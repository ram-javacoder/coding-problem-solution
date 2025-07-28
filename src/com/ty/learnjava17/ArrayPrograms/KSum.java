package com.ty.learnjava17.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KSum {


    private static Set<String> pairs = new HashSet<>();

    public static boolean checkPair(int val1, int val2) {
        String newPair = Math.min(val1,val2) + "," +Math.max(val1, val2);
        return pairs.add(newPair);
    }

    public static void main(String args[]) {

        Integer num[] = {1, 3, 5, 3, 1, 4, 2};
        int n = 6;

        int count = 0;

        List<Integer> numberList = new ArrayList<>(Arrays.asList(num));


        for (int k = 0; k < numberList.size(); k++) {


            for (int i = k + 1; i < numberList.size(); i++) {
                int inc = numberList.get(i);
                int add = numberList.get(k) + inc;

                if ((add == n) && checkPair(numberList.get(k), numberList.get(i))) {
                    count++;

                    break;

                }


            }

        }
        System.out.println("n : " + n);
        System.out.println("Elements present in Array : " + Arrays.toString(num));
        System.out.println("Number of possible pairs : " + count);
        System.out.println(pairs);

    }
	
}
